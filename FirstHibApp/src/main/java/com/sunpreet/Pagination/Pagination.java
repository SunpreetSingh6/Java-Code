package com.sunpreet.Pagination;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sunpreet.HQL.Teacher;

public class Pagination 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
				
		/* Pagination :- When we want specific no. of records from a table .
						 In this we have to specify the starting index with the help of setFirstResult(); 
						 and number of records we want, from that index with the help of setMaxResult();
		*/
		
		Query q = s.createQuery("from Teacher");
		q.setFirstResult(2);	// starting index
		q.setMaxResults(6);		// number of records from index 2;
		
		List<Teacher> l = q.getResultList();
		for(Teacher t : l)
			System.out.println(t.getId()+" : "+t.getName()+" : "+t.getSalary());
		
		s.close();		
		sf.close();

	}

}
