package com.cg.lab4.bean;


public class Lab4_1 {

	private long accNum;
    protected double balance;
    Person accHolder;
	public Lab4_1(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	
	public Lab4_1() {
		// TODO Auto-generated constructor stub
	}


	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
  public void deposit(double a)
  {
	  balance+=a;

  }
  public void withdraw(double a)
  {
	  if(balance>500)
	  {balance-=a;}
 
  }


	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
  
}