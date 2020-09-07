package com.arrays;

public class Fibonaci {
	
	public static int fibonaciSeries(int num) {
		int[] fib = new int[num+1];
		fib[0]=0; fib[1] = 1;
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib[num];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=30;
		System.out.println(fibonaciSeries(num));
	}

}
