package com.sunpreet.HQL;

import java.util.List;
import java.util.Random;
import javax.persistence.Query;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

public class Main 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();	
		
		// HQL is database independent means that it has its own Query Language.
		// We can use any query language(i.e Sql/Oracle) using the concept of NativeQuery in Hibernate.
		
		
		// Storing
	/*	
		Random r = new Random();
		for(int i=1 ; i <=10 ; i++)
		{
			Teacher t = new Teacher();
			t.setId(i);
			t.setName("Name " + i);
			t.setCity("Cityname " + i);
			t.setSalary(r.nextInt(100000));
			s.persist(t);
		}
	
	*/	
		
		// Fetching
		
		
		
 /*		Teacher th = (Teacher)s.get(Teacher.class, 29);			//for simple queries we can do this .
		System.out.println(th.getName()+ " : " + th.getSalary());
 */		
		//but what when we need only those teachers who has salary>50000.There we need to use HQL
		// because in upper query it will only give the records for a particular id.
		
		// To fetch Multiple results we use getResultList() and for single result we use getSingleResult();
		
		/* Multiple Results */
		Query q1 = s.createQuery("from Teacher where salary>50000");
		List<Teacher> teacher = q1.getResultList();
		for(Teacher t1 : teacher)
			System.out.println(t1.getName()+" : "+t1.getSalary());
		
		/* Single Result */
		Query q2 = s.createQuery("from Teacher where id=7");
		Teacher t2 = (Teacher)q2.getSingleResult();
		System.out.println(t2.getName()+" : "+ t2.getSalary());
		
		/* Updating Records using HQL*/
		Query q3 = s.createQuery("update Teacher set city='Delhi' where salary<40000");
		q3.executeUpdate();
		System.out.println("Updated");
		
		Query q4 = s.createQuery("update Teacher set city=:c where salary>:s");
		q4.setParameter("c", "NewDelhi");		// These(c,s) can be user input .
		q4.setParameter("s", 80000);
		q4.executeUpdate();
		System.out.println("Updated");
		
		/* Deleting Record using HQL */
		Query q5 = s.createQuery("delete from Teacher where id=:i");
		q5.setParameter("i", 5);
		q5.executeUpdate();
		System.out.println("Deleteted");
		
		/* Fetching only specific columns */
		
		/*  for example if we want to fetch only 'name' and 'salary' column from teacher then 
			it will not return Teacher's object(i.e Teacher t2 = (Teacher)q2.getSingleResult();)
			instead it will  return the object of Object.
			 
			And if we are fetching more than 1 column then it should be stored in 
			array of Object(i.e Object[]).
			
		*/
		
		// select query with where clause(we get only one record).
		Query q6 = s.createQuery("Select name,salary from Teacher where id=:i");	
		q6.setParameter("i", 2);		
		/*
		Teacher t = (Teacher)q6.getSingleResult();
		System.out.println(t.getName() + " : " + t.getSalary());
		
		if we do this then we get (Ljava.lang.Object; cannot be cast to class com.sunpreet.HQL.Teacher)
		*/
		Object[] obj = (Object[])q6.getSingleResult();
		for (Object o : obj)
			System.out.println(o);
			//or
		System.out.println(obj[0] +" : " +obj[1]);
		
		
		// select query without where clause(we get entire table's records for specific columns)
		Query q7 = s.createQuery("Select name,salary from Teacher");
		List<Object[]> obj1 =(List<Object[]>)q7.getResultList();
		for (Object[] o : obj1)
			System.out.println(o[0] +" : " +o[1]);
		
		
		// Native Query(using SQL instead of HQL)
		NativeQuery nq = s.createSQLQuery("select * from teacher where salary>50000");
		List<Object[]> l = nq.getResultList();
		for(Object o[] : l)
		{
			System.out.println(o[0]+":"+o[1]+":"+o[2]+":"+o[3]);
		}

			
		// HCQL :- Hibernate criteria query language
		
		// Fetching all records
		Criteria c = s.createCriteria(Teacher.class);
		List<Teacher> list = c.list();
		for( Teacher t : list)
		{
			System.out.println(t);
		}
		
		// Fetching records based on conditions using Restriction , Restriction can be lt,le,gt,ge,eq,ne,between,like
		Criteria c1 = s.createCriteria(Teacher.class);
		c1.add(Restrictions.lt("salary", 50000));
		List<Teacher> l1 = c1.list();
		for( Teacher t : l1)
		{
			System.out.println(t);
		}
		
		// Fetching and sorting records using Order
		Criteria c2 = s.createCriteria(Teacher.class);
		c2.addOrder(Order.asc("salary"));
		List<Teacher> l2 = c2.list();
		for( Teacher t : l2)
		{
			System.out.println(t);
		}
		
		
		
		tx.commit();
		s.close();
		sf.close();
	}
}
