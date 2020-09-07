package com.algorithms;
//Concept
//In Selection sort we will have 2 sub arrays as Unsorted array and Sorted array
//we will find the min element from the Unsorted array and swap with first element of the sorted array


import java.util.Scanner;

public class SelectionSort {

	public void swap(int[] arr,int maximum, int minimum) {
		int temp = arr[maximum];
		arr[maximum] = arr[minimum];
		arr[minimum] = temp;
	}
	public void selectionSort(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[min]){
					min=j;
				}	
			}
			if(i!=min)
				swap(arr, i,min);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];

		System.out.println("Enter an array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);
		System.out.println("sorted array is: ");
		for (int k=0; k< arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
	}

}
