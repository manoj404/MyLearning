package com.algorithms;
import java.util.Scanner;

public class StringRotation {

	public static boolean stringRotation(String str1, String str2) {
		boolean isRotation = false;
		String mainString = null;
		if (str1.length() == str2.length()) {
			mainString = str1 + str1;
			if (mainString.contains(str2))
				isRotation = true;

		}
		return isRotation;

	}
	
	//String reverse with recursion
	public static void stringReverse(String str) {
		if (str.length() != 0) {
			System.out.print(str.charAt(str.length()-1));
			stringReverse(str.substring(0,str.length()-1));
		}
	}
	
	//String reverse with word wise
	public static void stringReverseWithWordWise(String str){
		String[] stArr = str.split(" ");
		for (int i = stArr.length-1; i>=0 ; i--) {
			
			System.out.print(stArr[i]);
			System.out.print(" ");
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
//		String input2 = sc.next();
//		boolean output = stringRotation(input1, input2);
//		System.out.println(output);
//		stringReverse(input1);
		stringReverseWithWordWise(input1);
	}

}
