package com.capgemini.lab3.bean;
import java.util.Arrays;
import java.util.Scanner;
public class Lab3_8 {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the comma seperated elements");
		String str=s.nextLine();
		String[] arr = str.split(",");
		Arrays.sort(arr);
		if(arr.length%2==0) {
			for(int i=0;i<(arr.length)/2;i++)
			{
				System.out.println(""+arr[i].toUpperCase());
			}
			for(int i=arr.length/2;i<arr.length;i++)
			{
				System.out.println(""+arr[i].toLowerCase());
				
			}
		}
			else
			 {
				for(int i=0;i<=(arr.length)/2;i++)
				{
					System.out.println(""+arr[i].toUpperCase());
				}
				for(int i=(arr.length/2)+1;i<arr.length;i++)
				{
					System.out.println(""+arr[i].toLowerCase());
					
				}
				
		}

		

	
		
		/*for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" " );*/
		
	}

}
