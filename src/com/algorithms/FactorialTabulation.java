package com.algorithms;

//Bottom Up approach
public class FactorialTabulation {
	
	public int factorial(int n){
		
		int[] arr = new int[n+1];
		arr[0] = 1;
		for(int i=1; i < arr.length; i++)
			arr[i] = i * arr[i-1];
			
		return arr[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialTabulation f = new FactorialTabulation();
		int n = 8;
		System.out.println("Factorial of given number is: " + f.factorial(n));
	}

}
