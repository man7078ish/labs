package com.capgemini.lab3.bean;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Lab3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the zoneid");
		String input  = scanner.nextLine();
		ZonedDateTime current = ZonedDateTime.now(ZoneId.of(input));
		System.out.println("current time in your zone is="+current.getHour()+":"+current.getMinute());
		System.out.println("current date in your zone is="+current.getDayOfMonth()+"/"+current.getMonthValue()+"/"+current.getYear());
}

}
