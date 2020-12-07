package com.springcore.SpringApplicationPractice;

import java.util.Scanner;

import com.springcore.SpringApplicationPractice.Vehicle;

public class Bike implements Vehicle{
	
	public Bike(String bikeName) {
		super();
		BikeName = bikeName;
	}
	public Bike(int fuel) {
		super();
		Fuel = fuel;
	}

	private String BikeName;
	private String Destination;
	private int Fuel;
	
	//getters and setters
	
	/*public String getBikeName() {
		return BikeName;
	}
	public void setBikeName(String bikeName) {
		BikeName = bikeName;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public int getFuel() {
		return Fuel;
	}
	public void setFuel(int fuel) {
		Fuel = fuel;
	}*/
	
	//display details of bike
	
	public void display()
	{
	  System.out.println("Hey!! Happy and safe journey");	
	}
	
	@Override
	public String toString() {
		return "Bike [BikeName=" + BikeName + ", Destination=" + Destination + ", Fuel=" + Fuel + "]";
	}
	
	

}
