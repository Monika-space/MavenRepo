package com.springcore.SpringApplicationPractice;
import java.util.Scanner;

import com.springcore.SpringApplicationPractice.Vehicle;

public class Car implements Vehicle{
	private String car;
	private String destination;
	private int fuel;
	
	//getters and setters
	
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}
	
	//display details of car
	
	public void display()
	{
	  System.out.println("Happy long and safe journey");	
	}
	@Override
	public String toString() {
		return "Car [car=" + car + ", destination=" + destination + ", fuel=" + fuel + "]";
	}
}
