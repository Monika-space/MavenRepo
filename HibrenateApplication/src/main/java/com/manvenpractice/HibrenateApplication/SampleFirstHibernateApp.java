package com.manvenpractice.HibrenateApplication;

import javax.persistence.Entity;

@Entity
public class SampleFirstHibernateApp {
	@javax.persistence.Id
	private String Name;
	private int Id;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	

}
