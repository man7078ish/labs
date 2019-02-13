package com.cg.lab6.bean;
import java.util.Scanner;

public class PersonMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		try {
			System.out.println(" enter first name:");
		
			String fName=s.nextLine();
			System.out.println(" enter last name:");
			String lName=s.nextLine();
			
			if((fName.equals(""))&&(lName.equals("")))
			{
				throw new Validate("you kept it blank");
			}
			
		}
		catch(Validate v)
		{
			System.out.println(v.getMessage());
		}
		
		System.out.println("exception executed");
		}

}
