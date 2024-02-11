package com.springORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springORM.Dao.StudentDao;
import com.springORM.Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentdao = context.getBean("studentdao", StudentDao.class);
       /*
        Student st1 = new Student(101,"Sunpreet Singh","New Delhi");
        int r = studentdao.insert(st1);
        System.out.println("Done. No. of records saved:-" + r);
       */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while(go)
        {	
        	System.out.println("Press 1 to add new student");
        	System.out.println("Press 2 to display all students");
        	System.out.println("Press 3 to dsiplay details of student");
        	System.out.println("Press 4 to delete student");
        	System.out.println("Press 5 to update student");
        	System.out.println("Press 6 to Exit");
        	
        	try
        	{
        		int input = Integer.parseInt(br.readLine());
        		switch(input)
        		{
        			case 1 : 	
        				System.out.println("Enter student id");
        				int uid = Integer.parseInt(br.readLine());
        				System.out.println("Enter student name");
        				String uname = br.readLine();
        				System.out.println("Enter student city");
        				String ucity = br.readLine();
        				
        				Student s = new Student(uid,uname,ucity);
        				int i = studentdao.insert(s);
        				System.out.println(i+"Student added");
        				System.out.println("------------------------------------------");
        					break;
        			case 2 : 
        				List<Student> students = studentdao.getAllStudents();
        				for(Student stu : students)
        				{
        					System.out.println("Student [id=" + stu.getId() + ", name=" + stu.getName() + ", city=" + stu.getCity() + "]");
        				}
        				System.out.println("-------------------------------------------");
    						break;
        			case 3 : 
        				System.out.println("Enter student id to get details:-");
        				int getid = Integer.parseInt(br.readLine());
        				Student st = studentdao.getStudent(getid);
        				System.out.println("Student [id=" + st.getId() + ", name=" + st.getName() + ", city=" + st.getCity() + "]");
    						break;
        			case 4 : 
        				System.out.println("Enter student id to delete student:-");
        				int delid = Integer.parseInt(br.readLine());
        				studentdao.deleteStudent(delid);
        				System.out.println("Deleted Successfully");
    						break;
        			case 5 : 
        				System.out.println("Enter student id to update details:-");
        				int updateid = Integer.parseInt(br.readLine());
        				Student stud = studentdao.getStudent(updateid);
        				

        				System.out.println("Enter student name to update");
        				String upname = br.readLine();
        				System.out.println("Enter student city to update");
        				String upcity = br.readLine();
        				
        				stud.setName(upname);
        				stud.setCity(upcity);
        				studentdao.updateStudent(stud);
        				System.out.println("Updated Successfully");
    						break;
        			case 6 : 
        					go = false;
    						break;
        		}
        	}
        	catch(Exception e)
        	{
        		System.err.println("Invalid option choose another one :) ");
        		System.out.println(e.getMessage());
        	}
        	
        
        
        }
        
        
    }
}
