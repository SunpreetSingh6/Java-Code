package com.sunpreet.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sunpreet.HQL.Teacher;

public class FirstLevelCache 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		// By default 1st level cache is enabled
		
		/*  1) Caching is used to enhance the performance of an application 
			2) It reduce the number of database queries. 
		*/ 
		
		/*  First Level Cache is associated with session object.
		 	For same data if there is only 1 session it will fire only 1 query , whereas
		 	For same data if there are 2 sessions then it will fire 2 queries.
		*/
		
		Teacher t1 = s.get(Teacher.class, 4);			
		System.out.println(t1);
													// Both belongs to 1st session that's why will 
		Teacher t2 = s.get(Teacher.class, 4);		// fire only 1 query
		System.out.println(t2);							
		
		s.close();
		System.out.println("-------------------------------------------");
		
		/* Both will wire there query. */
		
		Session s1 = sf.openSession();
		Teacher t3 = s1.get(Teacher.class, 4);			
		System.out.println(t1);
		s1.close();
		
		Session s2 = sf.openSession();
		Teacher t4 = s2.get(Teacher.class, 4);			
		System.out.println(t1);
		s2.close();
	}

}
