package com.cg.lab7.bean;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab7_4 {
	public HashMap<Integer,Integer> getSquares(int arr[])
	{
		HashMap<Integer,Integer> Squares = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			
			Squares.put(arr[i], arr[i]*arr[i]);
		}
		return Squares;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of inputs");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("enter the numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		Lab7_4 obj=new Lab7_4();
		obj.getSquares(arr);
		Set set = obj.getSquares(arr).entrySet();
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + ": " + me.getValue());
		}

	}

}
