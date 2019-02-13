package com.cg.lab7.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab7_3 {
	public void rem(ArrayList list1,ArrayList list2)
	{
		list1.removeAll(list2);
		System.out.println("list1 is:"+list1);
		System.out.println("list2 is:"+list2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList();
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no. elements of array");
		int n=s.nextInt();
		System.out.println("enter the elements of array");
		
		for(int i=0;i<n;i++)
		{
		String str1=s.next();
		list1.add(str1);
		}
		System.out.println("enter the elements of array");
		for(int i=0;i<n;i++)
		{
		String str2=s.next();
		list2.add(str2);
		}
		Lab7_3 obj=new Lab7_3();
		obj.rem(list1,list2);
	}

}
