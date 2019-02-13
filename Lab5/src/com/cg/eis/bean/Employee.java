package com.cg.eis.bean;

public class Employee {
int id;
String name;
public int salary;
String designation;
String insScheme;

public Employee(int id, String name, int salary, String designation, String insScheme) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
	this.insScheme = insScheme;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsScheme() {
	return insScheme;
}
public void setInsScheme(String insScheme) {
	this.insScheme = insScheme;
}
}
