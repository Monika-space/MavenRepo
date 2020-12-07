package com.springcore.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails implements Student{
	
	private List<StudentAttributes> Students = new ArrayList<StudentAttributes>();

	public void display() {
		
	System.out.println(Students);
		
		
	}

	public List<StudentAttributes> getStudents() {
		return Students;
	}

	public void setStudents(List<StudentAttributes> students) {
		Students = students;
	}

	@Override
	public String toString() {
		return "StudentDetails [Students=" + Students + "]";
	}

	


}