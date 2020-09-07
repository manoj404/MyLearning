package com.trying;

public class MaxSumInArr {

	public static int maxSumSubArray(int[] arr) {

		int sumEnding = arr[0];
		int maxSum = 0;
		for (int i = 1; i < arr.length; i++) {
			sumEnding = Math.max(sumEnding + arr[i], arr[i]);
			maxSum = Math.max(maxSum, sumEnding);
		}
		return maxSum;
	}

	public static void maxSumSubArrayWithIndex(int[] arr) {

		int sumEnding = arr[0];
		int maxSum = 0;
		int start = 0;
		int end = 0;
		for (int i = 1; i < arr.length; i++) {
			sumEnding = Math.max(sumEnding + arr[i], arr[i]);// add curr element to sumending and return the max
			end++;
			if (sumEnding > maxSum) {
				start++;
				end = 0;
			}
			maxSum = Math.max(maxSum, sumEnding);
		}
		System.out.println("Found maximum sum sub array starting at " + start + "ending at " + end);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -3, 8, -2, 4, -5, 6 };
		int maxSum = maxSumSubArray(arr);
		System.out.println("Maximum sum in sub array: " + maxSum);
		maxSumSubArrayWithIndex(arr);
	}
}
