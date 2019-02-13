package com.cg.lab4.bean;

public class Saving extends Account{


	final int minBalance=100;
    boolean withdraw(int a)
    {
    	if(super.balance<minBalance)
    		return false;
    
    else
    {
    	super.balance-=a;
    	System.out.println("your balance is:"+balance);
    	return true;

    }

}
}
