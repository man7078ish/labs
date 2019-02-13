package com.capgemini.lab3.bean;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Lab3_3 {  
   public static void main(String[] args)
    {
	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date in dd/MM/yyyy format:");
		String input  = scanner.nextLine();
		LocalDate enteredDate = LocalDate.parse(input,formatter);
	   
        
        LocalDate now = LocalDate.now();
 
        Period diff = Period.between(enteredDate, now);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
