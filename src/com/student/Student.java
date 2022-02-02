package com.student;


public class Student {
	
	private int studentId;
	private String studentName;
	private int marks;
	
	public Student(){
		this.studentId = 0;
		this.studentName = "";
		this.marks = 0;
	}
	
	public Student(int studentId, String studentName, int marks) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}
	
	public int getStudentId() {
		return this.studentId;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public int getMarks() {
		return this.marks;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
