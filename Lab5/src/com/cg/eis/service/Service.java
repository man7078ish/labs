package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeService {
	Employee a;
	@Override
	public Employee details() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter your name");
		String name=s.nextLine();
		 
         System.out.println("Enter the employee id");
         int id=s.nextInt();
         System.out.println("Enter employee designation");
         String designation=s.next();
         System.out.println("Enter employee salary");
         int salary=s.nextInt();
         System.out.println("enetr insurence");
         String insScheme=s.next();
         a=new Employee(id,name,salary,designation,insScheme);
         return a;
		
		
		
	}

	@Override
	public void insurance() {
		// TODO Auto-generated method stub
		if((a.salary>5000)&&(a.salary<20000))
		{
			System.out.println("Designation is System Associate and scheme C");
		}
		else if((a.salary>=20000)&&(a.salary<40000))
		{
			System.out.println("Designation is Programmer and scheme B");
		}
		else if(a.salary>=40000)
		{
			System.out.println("Designation is Manager and scheme A");
		}
		else if(a.salary<5000)
		{
			System.out.println("Designation is Clerk and  no scheme ");
		}
	}

	@Override
	public void showDetails() {
		System.out.println("Employe id is:"+a.getId());
		System.out.println("Employe name is:"+a.getName());
		System.out.println("Employe designation is:"+a.getDesignation());
		System.out.println("Employe salary is:"+a.getSalary());
		System.out.println("Employe scheme is:"+a.getInsScheme());
		
		
	}

}
