package org.stjohn.singleinheitance;

public class Student extends Citizen 
{
	private String college;
	private int rollno;
	//default 
	public Student() {
		super();
		
	}
	//parameterized
	public Student(String college, int rollno) {
		super();
		this.college = college;
		this.rollno = rollno;
	}
	//getter & setter
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [college=" + college + ", rollno=" + rollno + "]";
	}
	
	
	
	}
	

