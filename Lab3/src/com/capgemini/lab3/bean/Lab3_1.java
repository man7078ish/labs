package com.capgemini.lab3.bean;
import java.util.Scanner;
public class Lab3_1 {


public static void main(String args[])
{
	
	Scanner sc=new Scanner(System.in);
	String s= sc.nextLine();
	int choice=sc.nextInt();
	String longStr=s+s;
	
	switch(choice) {
	case 1:new Lab3_1().concat(s);break;
	case 2:new Lab3_1().replace(s);break;
	case 3:new Lab3_1().duplicate(s);break;
	case 4:new Lab3_1().upper(s);break;
	default: System.out.println("invalid");
	}
}


public void concat(String str)
{
	String longStr=str+str;
	System.out.println("concatinated string is="+longStr);
}
public void replace(String str) {
	char s[]=str.toCharArray();
	for (int i=0; i < s.length; i++){
        if ((i % 2 )!= 0){
        	s[i]='#';
        	}
        System.out.print(""+s[i]);
        }
	
}
public void duplicate(String str)
{
	char[] chars = str.toCharArray();
	StringBuilder sb = new StringBuilder();
	boolean repeatedChar;
	for (int i = 0; i < chars.length; i++) {
	    repeatedChar = false;
	    for (int j = i + 1; j < chars.length; j++) {
	        if (chars[i] == chars[j]) {
	            repeatedChar = true;
	            break;
	        }
	    }
	    if (!repeatedChar) {
	        sb.append(chars[i]);
	    }
	}
	
	
	}

public void upper(String str) {
	char s[]=str.toCharArray();
	for (int i=0; i < s.length; i++){
        if ((i % 2 )!= 0)
        	 System.out.println("replaced string is="+ Character.toUpperCase(str.charAt(i)));
        }
}

}