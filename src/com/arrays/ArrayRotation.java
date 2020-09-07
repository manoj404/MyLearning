package com.arrays;

public class ArrayRotation {
	
	public static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	//using array reversal algorithm
	public static void arrayRightRotation(int[] arr, int n, int len) {
		int reverseIndex = (len-1)-n;
		reverse(arr, 0, reverseIndex);
		reverse(arr, reverseIndex+1, len-1);
		reverse(arr,0,len-1);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,4,8,6,1,3};
		arrayRightRotation(arr, 2, arr.length);
		for (int i : arr) {
			System.out.print(i+",");
		}
	}

}
