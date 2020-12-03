package com.manvenpractice.HibrenateApplication;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import com.manvenpractice.HibrenateApplication.SampleFirstHibernateApp;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(SampleFirstHibernateApp.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session s = sf.openSession();
        Transaction txn = s.beginTransaction();
        Random r = new Random();
        for(int i=101;i<=130;i++)
        {
      	
        	EmployeeName e = new EmployeeName();
        	e.setFirst_Name("alien"+i);
        	e.setLast_Name("alien");
        	SampleFirstHibernateApp s1= new SampleFirstHibernateApp();
        	s1.setId(r.nextInt(1271053));
        	s1.setName(e);
        	s.save(s1);
         	System.out.println(s1);
        }
        s.getTransaction().commit();
        
    }

	
	}

