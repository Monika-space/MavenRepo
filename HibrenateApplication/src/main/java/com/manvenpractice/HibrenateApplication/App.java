package com.manvenpractice.HibrenateApplication;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.manvenpractice.HibrenateApplication.SampleFirstHibernateApp;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SampleFirstHibernateApp s1 = new SampleFirstHibernateApp();
        s1.setName("Monika");
        s1.setId(1271031);
        Configuration con = new Configuration().configure().addAnnotatedClass(SampleFirstHibernateApp.class);
        SessionFactory sf = con.buildSessionFactory();
        Session s = sf.openSession();
        Transaction txn=s.beginTransaction();
        s.save(s1);
        txn.commit();
        
    }
}
