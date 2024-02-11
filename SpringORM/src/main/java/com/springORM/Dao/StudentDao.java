package com.springORM.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springORM.Entity.Student;

public class StudentDao 
{
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
		Integer i = (Integer)this.hibernateTemplate.save(student);
		return i;
	}

	// Retrieve single student 
	public Student getStudent(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		return student;
	}
	
	public List<Student> getAllStudents()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	@Transactional
	public void deleteStudent(int id)
	{
		Student student = this.hibernateTemplate.get(Student.class, id);
		this.hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
}
