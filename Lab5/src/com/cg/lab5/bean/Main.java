package com.cg.lab5.bean;



public class Main {

	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p1=new Person("smith",21.0f);
        Person p2=new Person("Kathy",21.0f);
        
       p1.setAccNum(1);
       p1.setBalance(2000);
       p1.setAccHolder(p1);
       p2.setAccNum(2);
       p2.setBalance(3000);
       p2.setAccHolder(p2);
       
       	
       	 p1.deposit(2000);
       	 p2.withdraw(2000);
       	 System.out.println(p1.getBalance());
       	 System.out.println(p2.getBalance());
       	 
}

	

	

	}
