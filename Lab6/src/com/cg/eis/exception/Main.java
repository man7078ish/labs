package com.cg.eis.exception;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 try
         {
		System.out.println("enter your name");
		String name=s.nextLine();
		 
         System.out.println("Enter the employee id");
         int id=s.nextInt();
         System.out.println("Enter employee designation");
         String designation=s.next();
        
        	 
         
         System.out.println("Enter employee salary");
         int salary=s.nextInt();
         if(salary<3000)
         {
        	 throw new EmployeeException("Exception");
			}
			
		}
		catch(EmployeeException v)
		{
			System.out.println(v.getMessage());
		}
		
		System.out.println("exception executed");
		}
         
         
         
	}


