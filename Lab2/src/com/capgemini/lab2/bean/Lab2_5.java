package com.capgemini.lab2.bean;
enum g {
M("male"), F("female");
	private g(String gender)
	{
		this.gender=gender;
	}
	private String gender;
	public String getg() {
		return gender;
	}
	public void setg(String gender) {
		this.gender = gender;
	}
	
}


public class Lab2_5 {
	private String firstName;
	private String lastName;
	private g Gender;
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
	public g getGender() {
		return Gender;
	}
	public void setGender(g gender) {
		Gender = gender;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2_5 person1=new Lab2_5("Manish","Kumar",g.M,1234567890L);
		System.out.println("First Name:" + person1.getFirstName());
		System.out.println("Last Name:" + person1.getLastName());
		System.out.println("Gender:" + person1.getGender());
		System.out.println("Moblie No:" + person1.getMobile());
	}
	public Lab2_5() {
		super();
	}
	public Lab2_5(String firstName, String lastName, g gender, long mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Gender = gender;
		Mobile = mobile;
	}
}
