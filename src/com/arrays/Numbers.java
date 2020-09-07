package com.arrays;

public class Numbers {
	
	public static void multPrimeNumbers(int num) {
		double mult = 1;
		for (int i = 1; i <= num; i++) {
			int count=0;
			for(int j=1; j<=i ; j++) {
				if(i%j==0) 
					count++;
			}
			if(count==2) {
				mult = mult*i;
			}
		}
		System.out.println(mult);
	}
	
	public static void twinPrimes(int n) {
		int prev = 2;
		for (int i = 1; i < n; i++) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if(i%j == 0)
					count++;
			}
			if(count==2) {
				if((i-prev) == 2) { // check if they are twin prime or not
					System.out.println("twin primes are --> " + i + ","+ prev);
				}
				prev = i; // if not then update the previous prime
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		//multPrimeNumbers(num);
		twinPrimes(num);
	}

}
