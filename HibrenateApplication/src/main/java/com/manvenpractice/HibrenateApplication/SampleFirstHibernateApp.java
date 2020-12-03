package com.manvenpractice.HibrenateApplication;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Column;

@Entity(name="Employee_Table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class SampleFirstHibernateApp //persistant class
{
	
	@Id
	@Column(name="Emp_id")
	private int Id;
	private EmployeeName Name;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

	public EmployeeName getName() {
		return Name;
	}
	public void setName(EmployeeName name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "SampleFirstHibernateApp [Name=" + Name + ", Id=" + Id + "]";
	}




	
}
