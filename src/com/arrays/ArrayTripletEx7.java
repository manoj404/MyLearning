package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTripletEx7 {

	public static void arrayTriplet(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		int sum = 0;
		int startIndex = 0;
		int endIndex = 0;

		for (int k = len - 1; k > 2; k--) {
			startIndex = 0;
			endIndex = k - 1;
			while (startIndex < endIndex) {
				if (arr[startIndex] + arr[endIndex] < arr[k]) {
					startIndex++;
				} else if (arr[startIndex] + arr[endIndex] > arr[k]) {
					endIndex--;
				} else {
					System.out.println(arr[startIndex] + "+" + arr[endIndex] + "=" + arr[k]);
					startIndex++;
				}

			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Enter an array: ");
		// Scanner sc = new Scanner(System.in);
		int[] arr = { 2, 5, 7, 3, 1, 10, 4 };
		// for (int i = 0; i < arr.length; i++) {
		// int item = sc.nextInt();
		// arr[i] = item;
		// }
		arrayTriplet(arr);
	}

}

// 1 2 3 , 3 1 4, 3 4 7, 1 4 5, 7 3 10, 2 3 5