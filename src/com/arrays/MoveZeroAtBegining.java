package com.arrays;

public class MoveZeroAtBegining {

	public static void moveZeroAtBeginingMethod_1(int[] arr) {
		int count = 0;
		int len = arr.length;
		int[] output = new int[len];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				output[count] = 0;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[count] = arr[i];
				count++;
			}
		}
		for (int j = 0; j < output.length; j++) {
			System.out.print(output[j] + " ");
		}
	}
	
	// reduce the space complexity
	public static void moveZeroAtBeginingMethod_2(int[] arr) {
		int j = arr.length-1;
		for (int i = arr.length-1; i >= 0; i--) {
			if(arr[i]!=0) {
				arr[j] = arr[i];
				j--;
			}
		}
		for(int k = j; k >= 0; k--) {
			arr[k] = 0;
		}
		
		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 0, 5, 7, 0, 0, 8, 0 };
		moveZeroAtBeginingMethod_2(arr);
	}

}
