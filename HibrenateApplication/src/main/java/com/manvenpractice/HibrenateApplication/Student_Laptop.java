package com.manvenpractice.HibrenateApplication;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Student_Laptop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
     	s1.setStudent_id("MA5037769");
    	s1.setStudent_name("Monika");
    	s1.setStudent_dept("CSE");
        Laptop l1= new Laptop();
        l1.setLaptop_id(102);
        l1.setLaptop_name("HP");
        Laptop l2= new Laptop();
        l2.setLaptop_id(103);
        l2.setLaptop_name("DELL");
        s1.getLap().add(l1);
        s1.getLap().add(l2);
		Configuration con = new Configuration().configure("StudentLaptop.cfg.xml").addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(sr);
        Session ss = sf.openSession();
        Transaction txn = ss.beginTransaction();
        ss.save(s1);
        ss.save(l1);
        ss.save(l2);
        txn.commit();
	}

}
