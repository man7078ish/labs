package com.cg.lab2.ui;
public enum Gender {
M("male"), F("female");
	private Gender(String gender)
	{
		this.gender=gender;
	}
	private String gender;
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
