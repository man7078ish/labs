package com.cg.lab4.bean;

public class Current extends Account{


	int limit=10000;
   
    public Current() {
		// TODO Auto-generated constructor stub
	}

	boolean withdrawl(int a)
    {if(a<limit)
  	  return false;
    else
  	  return true;
    }
}
