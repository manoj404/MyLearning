package com.trying;

public class Recursion {
	
	public static void stringReverse(String str) {
		int length = str.length();
		if(length <= 1) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length()-1));
			stringReverse(str.substring(0,str.length()-1));
		}
	}
	
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		} else {
			
			return num * factorial(num-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringReverse("Manoj");
		System.out.println(factorial(3));
	}

}
