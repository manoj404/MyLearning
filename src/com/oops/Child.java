package com.oops;

public class Child extends Parent{
	
	public void m1() {
		System.out.println("Child class method");
		super.m1();
	}
	//you can not use super keyword in static 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1 = new Child();
		obj1.m1();
	}

}
