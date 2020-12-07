package com.springcore.Employee;

import com.springcore.Employee.EmployeeName;
import com.springcore.Employee.EmployeeMailId;

public class EmployeeDetails implements EmployeeInterface{
	private EmployeeName EmployeeName;
	private String EmployeeID;
	private EmployeeMailId EmployeeMailId;
	private String Domain;
	public EmployeeName getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(EmployeeName employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(String employeeID) {
		EmployeeID = employeeID;
	}
	public EmployeeMailId getEmployeeMailId() {
		return EmployeeMailId;
	}
	public void setEmployeeMailId(EmployeeMailId employeeMailId) {
		EmployeeMailId = employeeMailId;
	}
	public String getDomain() {
		return Domain;
	}
	public void setDomain(String domain) {
		Domain = domain;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetails \n " + EmployeeName + "\n EmployeeID : " + EmployeeID + "\n"
				+ EmployeeMailId + "\n Domain :" + Domain ;
	}
	
	

}
