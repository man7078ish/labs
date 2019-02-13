package com.cg.lab7.bean;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Lab7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> list1 = new ArrayList<String>();
		System.out.println("Enter the no. of product names");
        int n=s.nextInt();
		System.out.println("Enter the product names");
		for(int i=0;i<n;i++)
		{
			String str=s.next();
			list1.add(str);
		}
		
		Collections.sort(list1);
		System.out.println("List after the use of" + 
                " Collection.sort() :\n" + list1); 
	}

}
