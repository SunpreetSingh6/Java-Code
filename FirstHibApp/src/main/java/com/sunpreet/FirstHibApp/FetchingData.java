package com.sunpreet.FirstHibApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData 
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		/* GET() Method
		 1) If we are fetching same object twice using get() method then hibernate will not hit the db 
		    twice rather hibernate just hit the db once, during 2nd object it will just fetch the data from 
		    the cache of 1st object(Note works only for same object) , (Only fire one sql query) .
		 2) If the data is not found in db then get() will just return null.
		 3) Use get() when you are not sure wheater the data is in db or not. 
		*/
		Alien_Home ah = (Alien_Home)session.get(Alien_Home.class, 101);
		System.out.println(ah);
		
		Alien_Address ad = (Alien_Address)session.get(Alien_Address.class, 1);
		System.out.println(ad);
		
		Alien_Address ad1 = (Alien_Address)session.get(Alien_Address.class, 1);
		System.out.println(ad1);
		
		Alien_Address ad2 = (Alien_Address)session.get(Alien_Address.class, 3);		// Returns null .
		System.out.println(ad2);
		
		
		/* LOAD() Method
		 1) If we are using load() and we are just storing data in an object(not printing it)
		 	 i.e  Alien_Home a = (Alien_Home)session.load(Alien_Home.class, 101);
		 	then hibernate will not fire query until and unless we use any data from that object ,
		 	hence this approach is known as Lazy Initialization and it makes the program faster. 
		 2) If the data is not found in db then load() will throw ObjectNotFoundException .
		 3) Use load() when you are 100% sure that data is in db.
		*/
		
		Alien_Home a = (Alien_Home)session.load(Alien_Home.class, 101);
		System.out.println(a);
		
		try 
		{
			Alien_Home a1 = (Alien_Home)session.load(Alien_Home.class, 104);
			System.out.println(a1);
		} 
		catch (Exception e) 
		{
			System.out.println("No Record Found");
		}
		
		session.close();
		sf.close();
	}

}
