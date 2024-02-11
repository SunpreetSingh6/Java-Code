package com.sunpreet.Mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Lazy_Eager_Loading 
{
	public static void main(String[] args) 
	{
		/*	1) Lazy_Loading :- In lazy loading associated data loads only when we explicitly call the
		 *					   getter/size method .
		 *	2) Eager_Loading :- In eager loading this loads the data on spot.
		 *
		 *  Example:- As 1 student has many laptops,so when we create object of student(s)
		 *  		  it will only load sid and sname not the laptops. To load all the laptops 
		 *  		  we have to explicitly call size/getter method , then only it will fire 
		 *  		  sql query(LazyLoading).
		 *  
		 *     		  Whereas when we use EagerLoading then it will load all the laptops in the object.
		 *     		  No need to call explicit method().
		 *      
		 *     By default it will use Lazy loading .
		 
		*/
		
		Student stu = new Student();
		stu.setSid(101);
		stu.setSname("Sunpreet");
		
		Laptop l1 = new Laptop();
		l1.setLid(201);
		l1.setLname("Dell");
		l1.setStud(stu);
		Laptop l2 = new Laptop();
		l2.setLid(202);
		l2.setLname("Mac");
		l2.setStud(stu);
		Laptop l3 = new Laptop();
		l3.setLid(203);
		l3.setLname("Hp");
		l3.setStud(stu);
		
		List<Laptop> lap = new ArrayList<Laptop>();
		lap.add(l1);
		lap.add(l2);
		lap.add(l3);
		stu.setLaptop(lap);
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		//Saving
		
		s.save(stu);
		s.save(l1);
		s.save(l2);
		s.save(l3);
		
		
		// Fetching 

		
	/*	Lazy Loading
	
	 	Student student = (Student)s.get(Student.class, 101);
		System.out.println(student.getSid()+ " : " + student.getSname());
		
		// If we use explicit method then it will fire a query only.
		 
	 	System.out.println(student.getLaptop().size());		
	 	
		Collection<Laptop> laptops = student.getLaptop(); 
		for(Laptop l : laptops)
			System.out.println(l.getLname());
	*/
		
	
	//	Eager Loading
	 	
		Student student = (Student)s.get(Student.class, 101);
		System.out.println(student.getSid()+ " : " + student.getSname());
		
		// we didn't use any explicit method for laptops but still it is loading the laptops in student.
		// Hence it is eager loading
 	
 	
		t.commit();
		s.close();
		sf.close();
	}
}
