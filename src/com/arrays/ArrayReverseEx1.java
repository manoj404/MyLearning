package com.arrays;

public class ArrayReverseEx1 {
	
	
	public static void swap(int[] arr, int stInd, int enInd){
		int temp = arr[stInd];
		arr[stInd] = arr[enInd];
		arr[enInd] = temp;
	}
	
	public static int[] arrayReverseInplace(int[] arr){
		int startIndex = 0;
		int endIndex= arr.length-1;
			while(startIndex < endIndex){
					swap(arr, startIndex, endIndex);
					startIndex++;
					endIndex--;
			}
			return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int[] arrayReverseInplace = arrayReverseInplace(arr);
		for (int i : arrayReverseInplace) {
			System.out.print(i + " ");
		}
		
	}

}
