package com.encap;

public class Student {
	int roll_no;
	String Student_name;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student[roll_no=" + roll_no "  student_name= " + student_name  "]";
	}

	

	}


