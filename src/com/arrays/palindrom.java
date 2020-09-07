package com.arrays;

public class palindrom {
	
	public static void checkPalindrom(int num) {
		int temp=0;
		int curNum = num;
		while(curNum!=0) {
			int digit = curNum%10;
			curNum = curNum/10;
			temp = (temp*10)+digit;
		}
		if(temp == num)
			System.out.println("Palindrom");
		else
			System.out.println("not palindrom");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 526;
		checkPalindrom(num);
	}

}
