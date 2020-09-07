package com.output.test;

public class OutputEx1 {
	int a;
	String s;
	
	public OutputEx1(int a, String s) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.s = s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputEx1 obj1 = new OutputEx1(10, "MMT");
		OutputEx1 obj2 = new OutputEx1(10, "MMT");
		OutputEx1 obj3 = obj1;
		System.out.println(obj1 = obj2);//
		System.out.println(obj1 == obj3);//false
		System.out.println(obj1.equals(obj2));//true
		System.out.println(obj1.equals(obj3));//false
	}

}
