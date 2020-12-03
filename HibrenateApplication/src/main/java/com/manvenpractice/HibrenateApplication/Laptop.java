package com.manvenpractice.HibrenateApplication;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	private int Laptop_id;
	private String Laptop_name;
	//private List<Student> stud;
	/* @OneToOne
	private Student stud;*/
	
	//getters and setters
	public int getLaptop_id() {
		return Laptop_id;
	}
	public void setLaptop_id(int laptop_id) {
		Laptop_id = laptop_id;
	}
	public String getLaptop_name() {
		return Laptop_name;
	}
	public void setLaptop_name(String laptop_name) {
		Laptop_name = laptop_name;
	}
	@Override
	public String toString() {
		return "Laptop [Laptop_id=" + Laptop_id + ", Laptop_name=" + Laptop_name + "]";
	}

}
