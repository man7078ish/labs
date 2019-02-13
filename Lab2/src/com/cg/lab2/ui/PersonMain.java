package com.cg.lab2.ui;
import com.capgemini.lab2.bean.*;
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab2_3_person person1=new Lab2_3_person("Manish","Kumar",'M');
		System.out.println("First Name:" + person1.getFirstName());
		System.out.println("Last Name:" + person1.getLastName());
		System.out.println("Gender:" + person1.getGender());
				
	}

}
