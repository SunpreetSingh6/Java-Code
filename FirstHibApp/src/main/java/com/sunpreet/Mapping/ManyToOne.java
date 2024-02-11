package com.sunpreet.Mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOne 
{
	public static void main(String[] args) 
	{
		// OneToMany and ManyToOne example using Student,Laptop 
		
		Student s1 = new Student();
		s1.setSid(101);
		s1.setSname("Sunpreet Singh");
		
		Laptop l1 = new Laptop();
		l1.setLid(201);
		l1.setLname("Dell");
		l1.setStud(s1);
		
		Laptop l2 = new Laptop();
		l2.setLid(202);
		l2.setLname("Hp");
		l2.setStud(s1);
		
		Laptop l3 = new Laptop();
		l3.setLid(203);
		l3.setLname("Mac");
		l3.setStud(s1);
		
		List<Laptop> l = new ArrayList<Laptop>();
		l.add(l1);
		l.add(l2);
		l.add(l3);
		s1.setLaptop(l);
				
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		
		/*  In @OneToMany mapping we have to explicitly save the laptop's object
		 	but what if we have 500 objects of laptop, should we do the same for 500 objects.	
		
		s.save(s1);
		s.save(l1);
		s.save(l2);
		s.save(l3);
		*/
		
		 /* NO we can simply use the concept of 'CASCADING' 
		 	
		 	In cascading all the related entities(i.e Laptop) of the main entity(Student) will be 
		 	save/remove/update automatically.
		 	We have to use cascading in Student class inside the @OneToMany()
		 
		s.save(s1); 	// Laptop will be saved automatically using the concept of cascading.
		*/
		
		// Fetching Data.
		
		s.save(s1);
		s.save(l1);
		s.save(l2);
		s.save(l3);
		
		Student st = (Student)s.get(Student.class, 101);
		System.out.println(st.getSname());
		
		for(Laptop ans : st.getLaptop())
		{
			System.out.println(ans.getLname());
		}
		
		t.commit();
		s.close();
		sf.close();
	}
}
