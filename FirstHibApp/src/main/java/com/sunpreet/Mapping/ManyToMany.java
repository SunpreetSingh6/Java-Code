package com.sunpreet.Mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("Sunpreet");
		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("Manvinder");
		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("Paramjeet");
		
		Project p1 = new Project();
		p1.setPid(201);
		p1.setPname("Library Management System.");
		Project p2 = new Project();
		p2.setPid(202);
		p2.setPname("Tournament Management System.");
		Project p3 = new Project();
		p3.setPid(203);
		p3.setPname("Database Management System.");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		List<Project> proj1 = new ArrayList<Project>();
		proj1.add(p1);
		proj1.add(p2);
		
		List<Project> proj2 = new ArrayList<Project>();
		proj2.add(p2);
		proj2.add(p3);
		
		e1.setProj(proj1);
		e2.setProj(proj2);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
		
		t.commit();
		s.close();
		sf.close();
	}
}
