package com.capgemini.lab3.bean;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab3_5{
	 public static void main(String[] args)

	{
		 LocalDate result=null;
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter date in dd/MM/yyyy format:");
			String input  = scanner.nextLine();
			System.out.println("enter warrany in months and years");
			int months=scanner.nextInt();
			int years=scanner.nextInt();
			LocalDate enteredDate1 = LocalDate.parse(input,formatter);
			if(months>0 && months<13)
			{
				 result = enteredDate1.plusMonths(months);
			}
			else
				System.out.println("invalid");
			if(years>0)
			{
				System.out.println("your warrany expires on="+result.plusYears(years));
				
			}
			else
				
				System.out.println("invalid");
			

	}
}