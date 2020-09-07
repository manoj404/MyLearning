package com.arrays;

public class ArrangeArraysAlternatelyEx9 {
	
	public static int[] arrangeAlternately(int[] arr){
		int[] result = new int[arr.length];
		int start = 0; int end = arr.length-1; int k = 0;
		while( start < end){
			result[k] = arr[end];
			k++;
			result[k] = arr[start];
			k++;
			start++;
			end--;
		}
		if(start == end){
			result[k] = arr[end];
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] finalArr = arrangeAlternately(arr);
		for (int i = 0; i < finalArr.length; i++) {
			System.out.print(finalArr[i] + " ");
		}
	}

}
