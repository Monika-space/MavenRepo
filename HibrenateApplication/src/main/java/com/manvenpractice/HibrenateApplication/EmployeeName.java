package com.manvenpractice.HibrenateApplication;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class EmployeeName {
	@Column(name="Emp_fname")
	private String First_Name;
	@Column(name="Emp_lanme")
	private String Last_Name;

	@Override
	public String toString() {
		return "EmployeeName [First_Name=" + First_Name + ", Last_Name=" + Last_Name + "]";
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

}
