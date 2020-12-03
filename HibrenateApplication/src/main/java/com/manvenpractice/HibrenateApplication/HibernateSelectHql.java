package com.manvenpractice.HibrenateApplication;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateSelectHql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(SampleFirstHibernateApp.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session s = sf.openSession();       
        Transaction txn = s.beginTransaction();
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID to get the details");
        b=(sc.nextInt());
        Query q1 = s.createQuery("from Employee_Table where Id=:b");
        q1.setParameter("b", b);
        SampleFirstHibernateApp sa =(SampleFirstHibernateApp)q1.uniqueResult();
        System.out.println(sa);
        txn.commit();
        s.close();
    	}

}
