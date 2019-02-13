package com.cg.lab5.bean;



public abstract class Account {
	private long accNum;
    protected double balance;
    Person accHolder;
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}


	public long getAccNum() {
		return accNum;
	}


	public void setAccNum(long accNum) {
		this.accNum = accNum;
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
  public abstract void withdraw(double a);

 
  


	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance
				+ ", accHolder=" + accHolder + "]";
	}
  
}

