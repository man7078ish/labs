package com.capgemini.lab3.bean;

import java.util.Scanner;
public class Lab3_7 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter username of atleast 8 character ending with _job: ");
		String username=s.nextLine();
		String a=username.substring(0,username.length()-4);
		String b=username.substring(username.length() - 4);
		String c="_job";
		if(a.length()>7 )
		{
			if(b==c) {
			System.out.println("True");
			}
			System.out.println("False");
			
		}
		else
			System.out.println("False");
		

	}

}
