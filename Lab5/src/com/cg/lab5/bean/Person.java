package com.cg.lab5.bean;

public class Person extends Account  {
	 private String name;
	   private float age;
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	@Override
	public void withdraw(double a) {
		// TODO Auto-generated method stub
		if(balance>500)
		  {balance-=a;}
	}
	   
	}
