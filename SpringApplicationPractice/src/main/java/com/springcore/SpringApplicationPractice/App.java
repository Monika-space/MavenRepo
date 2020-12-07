package com.springcore.SpringApplicationPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new ClassPathXmlApplicationContext("vehicle.xml");
        Vehicle v = (Vehicle)app.getBean("vehicle",Vehicle.class);
        System.out.println(v.toString());
        v.display();
    }
}
