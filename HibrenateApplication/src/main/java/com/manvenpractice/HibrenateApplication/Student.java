package com.manvenpractice.HibrenateApplication;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private String Student_id;
	private String Student_name;
	private String Student_dept;
	@OneToMany
	private List<Laptop> lap = new ArrayList<Laptop>();
/*	@OneToOne
	private Laptop lap;*/
	
	//getters and setters
	public String getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(String student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_dept() {
		return Student_dept;
	}
	public void setStudent_dept(String student_dept) {
		Student_dept = student_dept;
	}
	
	@Override
	public String toString() {
		return "Student [Student_id=" + Student_id + ", Student_name=" + Student_name + ", Student_dept=" + Student_dept
				+ ", lap=" + lap + "]";
	}
	public List<Laptop> getLap() {
		return lap;
	}
	public void setLap(List<Laptop> lap) {
		this.lap = lap;
	}

	
	/*public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}*/
	
}
