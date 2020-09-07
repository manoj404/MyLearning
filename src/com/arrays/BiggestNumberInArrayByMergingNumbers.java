package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class BiggestNumberInArrayByMergingNumbers {
	
	
	//This method returns large number in a rotation way
	public static void printBiggestNumberInArrayInRotation(int[] arr) {
		int max = -1;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			// check for the last digit
			while (num > 0) {
				int r = num % 10;
				num = num / 10;
				// get the max number's index in the array
				if (num == 0) {
					if (max <= r) {
						max = r;
						index = i;
					}
				}
			}

		}
		System.out.println("index is: " + index);
		// print the biggest number in a rotation way
		for (int i = index; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		for (int j = 0; j < index; j++) {
			System.out.print(arr[j]);
		}

	}//end of method
	
	//This method prints largest number by arranging all numbers in the arr
	public static void printLargest(ArrayList<String> arr) {
		
		Collections.sort(arr, new Comparator<String>() {
			
			public int compare(String a, String b) {
				String ab = a+b;
				String ba = b+a;
				return ab.compareTo(ba) > 0 ? -1 : 1; // if ab > ba return a else return b
			}
		});
		Iterator<String> it = arr.iterator(); 
		  
	    while(it.hasNext()) 
	    	
	        System.out.print(it.next()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 93, 1 };// 9313
		ArrayList<String> arr = new ArrayList<>();
		arr.add("54"); 
        arr.add("546"); 
        arr.add("548"); 
        arr.add("60"); 
		//printBiggestNumberInArrayInRotation(arr1);
		printLargest(arr);
	}

}
