package com.arrays;

public class FindLargeAndSecondLarge {

	public static void findLargeAndSecondLarge(int[] arr) {
		int big = arr[0];
		int sec_big = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] > arr[i]) {
				sec_big = big;
				big = arr[i + 1];
			} else if (arr[i + 1] > sec_big && arr[i + 1] < big)
				sec_big = arr[i + 1];
		}
		System.out.println("big: " + big + " 2nd big: " + sec_big);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 10, 30, 50, 70, 90, 80, 100 };
		FindLargeAndSecondLarge obj = new FindLargeAndSecondLarge();
		findLargeAndSecondLarge(arr);
		
	}

}
