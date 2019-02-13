package com.cg.lab4.bean;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p1=new Person("smith",21.0f);
         Person p2=new Person("Kathy",21.0f);
         
         Lab4_1 a=new Lab4_1(1,2000,p1);
        
        Lab4_1 a1=new Lab4_1(2,3000,p2);
        	
        	 a.deposit(2000);
        	 a1.withdraw(2000);
        	 System.out.println(a.getBalance());
        	 System.out.println(a1.getBalance());
        	 
}
}