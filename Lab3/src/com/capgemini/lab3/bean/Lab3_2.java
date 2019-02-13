package com.capgemini.lab3.bean;

import java.util.Scanner;
public class Lab3_2 {
	public static boolean postring(String str){
	    for(int i = 0;i<str.length()-1;i++)         
	        if(str.charAt(i) > str.charAt(i+1))
	            return false; 
	    return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s= sc.nextLine();
		 if (postring(s))  
	           System.out.println("True");  
	        else
	            System.out.println("False");  
	            
	    } 
	}


