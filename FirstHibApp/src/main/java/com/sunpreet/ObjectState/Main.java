package com.sunpreet.ObjectState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Courses c = new Courses();				// Object c is New state.
		
		// when we initialize the value to object c then the object is Transient State.
		
		c.setCid(101);						 	// Transient State.  
		c.setCname("Core Java");
		c.setCprice(1000);						
		
		// when we save the object c in db then it is in Persistence State.
		
		s.save(c);
		c.setCprice(900);					// changing the value of persistence object will reflect in db.
		
		s.remove(c);						// removing the object from db. hence in Removing State.
		
		t.commit();
		
		c.setCprice(950);					// after commit when we try this,change will not reflect in db.
		
		s.close();							// Detached State.
		sf.close();
	}


/*	
 *  	Hibernate object lifecycle have 4 states :- Transient,Persistence,Detached,Remove
 *  
 *    	1) TS:- The transient state is the initial state of an object.
    			Once we create an instance of class, then the object entered in the transient state.
    			Here, an object is not associated with the Session. So, the transient state is not 
    			related to any database.
    			Hence, modifications in the data don't affect any changes in the database.
    		
    	2) PS:- As soon as the object associated with the Session, it entered in the persistent state.
    			Hence, we can say that an object is in the persistence state when we save or persist it.
    			Here, each object represents the row of the database table.
    			So, modifications in the data make changes in the database.
    			Method's used for PS:- save(),persist(),update(),saveOrUpdate().
    			
		3) DS:- Once we either close the session or clear its cache, then the object entered into 
				the detached state.
    			As an object is no more associated with the Session, modifications in the data don't 
    			affect any changes in the database.
    			However, the detached object still has a representation in the database.
    			If we want to persist the changes made to a detached object, it is required to reattach
    			the application to a valid Hibernate session by using save(),persist(),update().
    			Method's used for DS:- detach(),clear(),close(),evict().
    			
		4) RS:- In remove state object is associated with Session.
				Method used for RS:- delete(),remove().
				
				
									TS		PS		DS		RS
									
			Database Associated:-	NO		YES		YES		NO
			Session	Associated:-	NO		YES		NO		YES
 */
	
}