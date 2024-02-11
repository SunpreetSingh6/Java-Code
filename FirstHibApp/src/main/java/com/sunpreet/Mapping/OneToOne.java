package com.sunpreet.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne 
{
	public static void main(String[] args) 
	{
		// OneToOne Mapping Example using 2 classes(Question,Answer)
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Answer a1 = new Answer();
		a1.setAns_id(201);
		a1.setAns("Java is programming language.");
		
		Question q1 = new Question();
		q1.setQues_id(101);
		q1.setQues("What is Java?");
		q1.setAns(a1);
		a1.setQues(q1);
		
		Answer a2 = new Answer();
		a2.setAns_id(202);
		a2.setAns("Hibernate is an ORM tool.");
		Question q2 = new Question();
		q2.setQues_id(102);
		q2.setQues("What is Hibernate?");
		q2.setAns(a2);
		a2.setQues(q2);
		
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);
		
		t.commit();
		session.close();
		sf.close();
		

	}

}
