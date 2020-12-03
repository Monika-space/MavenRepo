package com.manvenpractice.HibrenateApplication;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class EmployeeHqlSelect {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    Configuration con = new Configuration().configure().addAnnotatedClass(SampleFirstHibernateApp.class);
	        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	        SessionFactory sf = con.buildSessionFactory(sr);
	        Session s = sf.openSession();       
	        Transaction txn = s.beginTransaction();
	        SQLQuery q1= s.createSQLQuery("select Emp_id,Emp_fname from Employee_Table where Emp_id>1100764");
	        int i=0;
	        
	        List<Object[]> sa = (List<Object[]>)q1.list();
	        for (Object[] objects : sa) 
	        {
				System.out.println(objects[0]+"..."+objects[1]);
				i++;
			}
	        System.out.println(i);
	        txn.commit();
	        
	}

}
