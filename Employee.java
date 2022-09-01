package com.oops.bll;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	public Employee() //Default constructor
	{
		
	}
public Employee (int id, String firstName, String lastName, int salary) {
	 this.id = id;
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.salary = salary;
 }
 public int getId() {
	 return id;
 }
 public String getFirstName() {
	 return firstName;
 }
 public String getLastName() {
	 return lastName;
 }
 public String getName() {
	 return firstName+lastName;
 }
 public int getSalary() {
	 return salary;
 }
 public void setSalary(int salary) {
	 this.salary=salary;
 }
 public int getAnnualSalary() {
	 return salary*12;
 }
 public int raiseSalary(int percentage) {
	 return salary+(salary*percentage/100);
 }
 @Override
 public String toString() {
	 return  "Employee id:" + id + "\nName: "+firstName +lastName + "\nSalary: "+ salary;
 }
}
