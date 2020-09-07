package com.arrays;

public class EquilibriumPoint {

	public static int findEquilibriumPoint(int[] arr) {
		int start = 0;
		int lSum = 0;
		int rSum = 0;
		int num = 0;
		int end = arr.length - 1;
		if (arr.length == 1) {
			return arr[0];
		}
		int mid = start + (end - start) / 2;
		while (start < mid) {
			lSum += arr[start];
			start++;
		}
		while (end > mid) {
			rSum += arr[end];
			end--;
		}
		System.out.println("*****" + lSum + "****" + rSum);
		if (lSum == rSum) {
			num = mid +1;
			return num;
		} else 
			return -1;		
	}

	public static void main(String[] args) {
		int[] arr = { 4,42,27,16,28,3,4,5,9,3,31,5,5,29,10,18,35,35,33,19,41,23,8,32,9,5,8,18,35,13,6,7,6,10,11,13,37,2,25,7,28,4};
		int index = findEquilibriumPoint(arr);
		System.out.println(index);
	}

}
