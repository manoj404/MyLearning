package com.arrays;


//Insertion sort will have sorted sublist and Unsorted sublist
//get each elememt from unsorted array and compare with sorted array
// then replace the value in appropriate place in sorted array


public class InserstionSortEx {
	
	public void insertionSort(int[] arr) {
		//consider the first element as sorted array so loop will start from 1 index
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,4,10,1,6,2};
		System.out.println();
	}

}
