package com.trying;

public class Employee implements Comparable<Employee> {
	
	int age,salary;
	String dept;
	
	public Employee(int age,int salary,String dept) {
		this.age=age;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee obj) {
		return this.age-obj.age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "age: " + this.age + " Salary: " + this.salary + " Department: " + this.dept;
	}

}
