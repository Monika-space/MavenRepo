package com.manvenpractice.HibrenateApplication;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SecondLevelCachePrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(SampleFirstHibernateApp.class);
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(sr);
		Session s1 = sf.openSession();
		Transaction t1 = s1.beginTransaction();
    	Query q1 = s1.createQuery("from Employee_Table where Emp_id=1271050");
    	q1.setCacheable(true);
    	SampleFirstHibernateApp sa1=(SampleFirstHibernateApp)q1.uniqueResult();
    	System.out.println(sa1);
    	t1.commit();
    	s1.close();
    	Session s2 = sf.openSession();
    	Transaction t2 = s2.beginTransaction();
    	Query q2 = s2.createQuery("from Employee_Table where Emp_id=1271050");
    	q2.setCacheable(true);
    	SampleFirstHibernateApp sa2 = (SampleFirstHibernateApp)q2.uniqueResult();
    	System.out.println(sa2);
    	t2.commit();
    	s2.close();
 	}

}
