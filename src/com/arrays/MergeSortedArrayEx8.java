package com.arrays;

public class MergeSortedArrayEx8 {
	
	public static int[] mergeArray(int[] arr1, int[] arr2){
		int[] arr3 = new int[arr1.length+arr2.length];
		
		for(int i=0; i<arr1.length; i++){
			arr3[i] = arr1[i];
		}
		int k = arr1.length;
		for(int j = arr2.length-1 ; j>=0 ; j--){
			if(k < arr3.length){
				arr3[k] = arr2[j];
				k++;
			}	
		}
		sortFinalArr(arr3);
		
		return arr3;
	}

	public static void sortFinalArr(int[] arr){
		
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
		int[] arr1 = {1,3,4};
		int[] arr2 = {2,4,5,6,7,8,9,10};
		int[] sortedArr = mergeArray(arr1,arr2);
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i] + " ");
		}
	}

}
