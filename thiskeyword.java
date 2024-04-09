package com.core;

class student
{
	int rno;
	String sname;
	public student() {
		System.out.println("Default Constructor");
	}
	public student(int rno,String sname) {
		this();
		System.out.println("Parameterized Constructor");
		this.rno=rno;
		this.sname=sname;
	}
	public void display() {
		System.out.println("Roll No : "+this.rno);
		System.out.println("Student Name : "+this.sname);
    }
}

public class thiskeyword {
	
	public static void main(String[]args) {
		System.out.println("Main Method");
		student s1=new student(1,"jigar");
		s1.display();

	}

}
