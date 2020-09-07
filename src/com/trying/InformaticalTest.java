package com.trying;

import java.lang.reflect.Array;
import java.util.Arrays;

//Simple question: 
//1) Given five positive integers, find the minimum and maximum values that can be calculated by 
//summing exactly three of the five integers. Then print the respective minimum and maximum 
//values as a single line of two space-separated long integers.
//
//Example
//arr={5,3,9,7,1}
//The minimum sum is 1+3+5 = 9 and the maximum sum is 9+7+5 = 21. The function prints 9 , 21

//Check whether two strings are anagram of each other
//
//Write a function to check whether two given strings are anagram of each other or not. 
//An anagram of a string is another string that contains same characters, 
//only the order of characters can be different. For example, “abcd” and “dabc” 
//are anagram of each other.

public class InformaticalTest {
	
	public static void findMaxAndMinSum(int[] arr) {
		int min_Sum = 0;
		int max_Sum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < 3; i++) {
			min_Sum = min_Sum+arr[i];
		}
		for (int i = arr.length-1; i >= arr.length-3; i--) {
			max_Sum = max_Sum+arr[i];
		}
		System.out.println("Min sum: " + min_Sum + " Max sum: " + max_Sum);
	}
	public static Boolean findAnagram(String str1, String str2) {
		Boolean isAnagram = false;
		int l1 = str1.length();
		int l2 = str2.length();
		if(l1!=l2)
			return isAnagram;
		else {
			for (int i = 0; i < str1.length(); i++) {
				
			}
		}
		return isAnagram;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {5,3,9,7,1};
		//findMaxAndMinSum(arr);
		String str1 = "abcd";
		String str2 = "dabc";
		Boolean anagram = findAnagram(str1,str2);
	}

}
