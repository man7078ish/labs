package com.cg.lab7.bean;

import java.util.Arrays;
import java.util.Scanner;

public class Lab7_1 {
	public static String[] reverseArray(int[] arr)
	{
		String[] str=new String[arr.length];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++)
		{
			str[i]=String.valueOf(arr[i]);
			sb.append(str[i]);
			str[i]=sb.reverse().toString();
			sb.delete(0, arr.length);
		}
		Arrays.sort(str);
		return str;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of inputs:");
		int n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		String[] res=reverseArray(arr);
		for(String str : res)
	        System.out.println(str);
		
		
	}

}
