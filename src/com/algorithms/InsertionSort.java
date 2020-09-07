package com.algorithms;
//Concept:
//In Insertion sort we will have 2 sub arrays as Unsorted array and Sorted array
//Sorted array is always first element of the array and rest is Unsorted array
//we will pick first element of the Unsorted array and compare it with all the element os the Sorted array and insert it
//in the appropriate position

import java.util.Scanner;

public class InsertionSort {
	
	public void inserstionSort(int[] arr){
		for(int i=1; i< arr.length; i++){
			int temp=arr[i];
			int j= i-1;
			while(j>=0 && arr[j] > temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		
		System.out.println("Enter an array");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		InsertionSort is = new InsertionSort();
		is.inserstionSort(arr);
		System.out.println("sorted array is: ");
		for (int k=0; k< arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
	}

}
