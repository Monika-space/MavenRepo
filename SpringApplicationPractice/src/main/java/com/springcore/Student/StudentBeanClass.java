package com.springcore.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentBeanClass {
	
    public static void main(String args[])
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
    	context.getBean("student1", StudentAttributes.class);
    	context.getBean("student2", StudentAttributes.class);
    	Student s =(Student)context.getBean("studdetails", StudentDetails.class);
    	s.display();
        
    }
}
