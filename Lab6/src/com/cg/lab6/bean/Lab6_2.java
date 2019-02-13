package com.cg.lab6.bean;

import java.util.Scanner;

public class Lab6_2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println(" enter age:");
		
			int age=s.nextInt();
			
			if(age<15)
			{
				throw new Validate("your age is less than 15");
			}
			
		}
		catch(Validate v)
		{
			System.out.println(v.getMessage());
		}
		
		System.out.println("exception executed");
		}



	}


