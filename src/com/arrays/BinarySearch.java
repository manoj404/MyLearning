package com.arrays;

public class BinarySearch {

	// Recursive approach
	public static int binarySearchRecursive(int[] arr, int start, int end, int num) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == num)
				return mid;
			if (arr[mid] > num)
				return binarySearchRecursive(arr, start, mid - 1, num);
			return binarySearchRecursive(arr, mid + 1, end, num);
		}
		return -1;
	}

	// iterative approach
	public static int binarySearch(int[] arr, int num) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (arr[mid] == num)
				return mid;
			// Check if num is present at mid
			if (num > arr[mid])
				start = mid + 1;
			// If num is smaller, ignore right half
			else
				end = mid - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 8, 12, 25, 32, 48, 75, 81, 92, 95 };
		int num = 100;
		// int index = binarySearch(arr, num);
		int index = binarySearchRecursive(arr, 0, arr.length-1, num);
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index:" + index);
		}
	}

}
