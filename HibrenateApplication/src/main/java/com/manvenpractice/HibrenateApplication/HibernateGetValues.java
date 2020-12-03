package com.manvenpractice.HibrenateApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateGetValues {

	public static void main(String args[])
	{
    SampleFirstHibernateApp sa = new SampleFirstHibernateApp();
	Configuration con = new Configuration().configure().addAnnotatedClass(SampleFirstHibernateApp.class);
	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf = con.buildSessionFactory(sr);
	
	Session ss = sf.openSession();
	Transaction txn = ss.beginTransaction();
	sa = (SampleFirstHibernateApp)ss.get(SampleFirstHibernateApp.class,1271050);
	System.out.println(sa);
	
	Session s1 = sf.openSession();
	Transaction txn1 = s1.beginTransaction();
	sa = (SampleFirstHibernateApp)s1.get(SampleFirstHibernateApp.class,1271050);
	System.out.println(sa);
	txn1.commit();
	s1.close();
	
	}
}
