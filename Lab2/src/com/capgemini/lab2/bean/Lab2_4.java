package com.capgemini.lab2.bean;

public class Lab2_4 {
	private String firstName;
	private String lastName;
	private char Gender;
	private long Mobile;
	
	
	public long getMobile() {
		return Mobile;
	}
	public void setMobile(long mobile) {
		Mobile = mobile;
	}
	//getter and setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2_4 person1=new Lab2_4("Manish","Kumar",'M',1234567890L);
		System.out.println("First Name:" + person1.getFirstName());
		System.out.println("Last Name:" + person1.getLastName());
		System.out.println("Gender:" + person1.getGender());
		System.out.println("Moblie No:" + person1.getMobile());
	}
	public Lab2_4() {
		super();
	}
	public Lab2_4(String firstName, String lastName, char gender, long mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		Mobile = mobile;
	}

}
