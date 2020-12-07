package com.springcore.Student;

public class StudentAttributes {
	private String StudentName;
	private int MarksPercentage;
	private int RollNo;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getMarksPercentage() {
		return MarksPercentage;
	}
	public void setMarksPercentage(int marksPercentage) {
		MarksPercentage = marksPercentage;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	@Override
	public String toString() {
		return "StudentAttributes [StudentName=" + StudentName + ", MarksPercentage=" + MarksPercentage + ", RollNo="
				+ RollNo + "]\n";
	}

}
