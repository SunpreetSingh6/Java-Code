package com.sunpreet.FirstHibApp;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoringData 
{
    public static void main( String[] args ) throws Exception
    {
    	Alien_Specs sun = new Alien_Specs();
    	sun.setNum_heads(2);
    	sun.setNum_eyes(4);
    	sun.setNum_hands(3);
    	sun.setNum_legs(5);
    	sun.setPlanet_name("Jupiter");
    	Alien_Home sunpreet = new Alien_Home();
        sunpreet.setAid(101);
        sunpreet.setAname("Sunpreet");
        sunpreet.setColor("Green");
        sunpreet.setAs(sun);
        
        Alien_Specs par = new Alien_Specs();
    	par.setNum_heads(1);
    	par.setNum_eyes(2);
    	par.setNum_hands(2);
    	par.setNum_legs(2);
    	par.setPlanet_name("Earth");
        Alien_Home mom = new Alien_Home();
        mom.setAid(102);
        mom.setAname("Paramjeet");
        mom.setColor("Orange");
        mom.setAs(par);
        
        Alien_Address  a = new Alien_Address();
        a.setHouse_no("221/55");
        a.setStreet(7);
        a.setCity("New Delhi");
        a.setLandmark("GGSGH");
        a.setAdded_date(new Date());
        a.setX(1213.54);
        
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
//      cfg.addAnnotatedClass(Alien_Home.class);
//      cfg.addAnnotatedClass(Alien_Address.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();			// Transaction is only used to store/save data in db .
        
        /*
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        SessionFactory sf = meta.getSessionFactoryBuilder().build();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        */
        
        /*
        Configuration cfg = new Configuration().configure().addAnnotatedClass(Alien_Home.class);
        StandardServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
        SessionFactory sf = cfg.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        */
        
        session.save(sunpreet);
        session.save(mom);
        session.save(a);
        t.commit();
        System.out.println("Successfully Saved");
        sf.close();
        session.close();
        
    }
}
