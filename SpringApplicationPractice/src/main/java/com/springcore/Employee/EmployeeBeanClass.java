package com.springcore.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeBeanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		context.getBean("EmployeeName", EmployeeName.class);
		context.getBean("EmployeeMailId", EmployeeMailId.class);
		EmployeeInterface EDetails=(EmployeeInterface)context.getBean("EmployeeDetails",EmployeeDetails.class);
        System.out.println(EDetails.toString());
	}

}
