package com.sunpreet.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

import com.sunpreet.HQL.Teacher;



public class SecondLevelCache 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s1 = sf.openSession();

		// By default it is Disabled;
		
		/*  Now as SecondLevelCache is disabled we have to add 2 things in pom.xml file to
		 	make it enable , as well as in hibernate.cfg.xml file
		 		types of 2ndlevelcache : - ehcache(preferable) , os , swam .
		 	1) Dependency of ehcache .
		 	2) jar file(hibernate-ehcache) to integrate hibernate with ehcache.
		*/
		
		/*  Now every entity is not allowed to make cache so we have to use @Cacheable annotation 
		 *  in the class and have to use @Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
		*/
		
		/* Second Level Cache is associated with SessionFactory object
		 	Now if SecondLevelCache is enabled then hibernate will only fire one query 
		 	 for same data but in different sessions. 
		*/
		Teacher t1 = s1.get(Teacher.class, 4);			
		System.out.println(t1);
		
		s1.close();
		
		Session s2 = sf.openSession();
		Teacher t2 = s2.get(Teacher.class, 4);			
		System.out.println(t2);
		
		s2.close();
	}

}
