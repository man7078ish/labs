package com.capgemini.lab3.bean;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab3_4 {
	 public static void main(String[] args)

	{
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter date in dd/MM/yyyy format:");
			String input  = scanner.nextLine();
			LocalDate enteredDate1 = LocalDate.parse(input,formatter);
			
			String input1  = scanner.nextLine();
			LocalDate enteredDate2 = LocalDate.parse(input1,formatter);
		   
	        
	       
	 
	        Period diff = Period.between(enteredDate1, enteredDate2);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	  }

}
