package com.algorithms;
import java.util.Scanner;

public class RemoveDuplicate {
	
	
	public static void removeDuplicateChar(String str1, String str2){
		
		char[] charArr = str2.toCharArray();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < charArr.length; i++) {
			if(!str1.contains(String.valueOf(charArr[i]))){
				builder.append(charArr[i]);
			}	
		}
		System.out.println("Removed duplicate char string is: "+ builder.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter two string");
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		removeDuplicateChar(input1, input2);
	}

}
