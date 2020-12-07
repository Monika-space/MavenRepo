package com.springcore.Employee;

public class EmployeeName {
	
//constructors 
	public EmployeeName(String firstName, String lastName, String middleName) {
		super();
		FirstName = firstName;
		LastName = lastName;
		MiddleName = middleName;
	}


	public EmployeeName(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	
// primitive attributes to store employee name 
	
	private String FirstName;
	private String LastName;
	private String MiddleName;
	
   	
// to string method that works as display function
	
	@Override
	public String toString() {
		return "\n FirstName : " + FirstName + "\n LastName : " + LastName + "\n MiddleName : " + MiddleName + "\n";
	}

}
