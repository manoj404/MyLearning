package com.arrays;

public class MaxSumCircularSubArray {

	// Naive Approach
	// O(n*n)
	public static int maxSumCircularSubArray(int[] arr, int length) {

		int result = arr[0];
		for (int i = 0; i < length; i++) {
			int currSum = arr[i];
			int currMax = arr[i];
			for (int j = 1; j < length; j++) {
				int index = (i + j) % length; // to find the next circular index
				currSum += arr[index];
				currMax = Math.max(currSum, currMax);
			}
			result = Math.max(result, currMax);
		}

		return result;
	}

	// kadane's Algorithm
	public static int maxSumCircularSubArrayKadane(int[] arr, int length) {

		int result = arr[0];
		int currSum = arr[0];
		int k=0;
		for (int i = 0; i < length; i++) {
			int j = i+1;
			if(j<length) {
				int index = (k+j) % length;
				currSum += arr[index];
				result = Math.max(result, currSum);
			} else
				k++;
		}
		int temp = 3%6;
		System.out.println(temp);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, -2, 3, 4 };
		int result = maxSumCircularSubArrayKadane(arr, arr.length);
		System.out.println("Max sum circular sub array: " + result);
	}

}
