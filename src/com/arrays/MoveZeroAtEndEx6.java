package com.arrays;


public class MoveZeroAtEndEx6 {
	
	public  static void moveAllZeroToEndMethod_1(int[] arr){
		int count = 0;
		int i = 0;
		//arrange nonzero elements sequentially
		for (i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				arr[count] = arr[i];
				count = count+1;
			}
		}
		//replace all 0s till lenght
		while(count < i ){
			arr[count] = 0;
			count = count+1;
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}			
	}
	//Using same array to reduce space complexity
	public static void moveAllZeroToEndMethod_2(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[j] = arr[i];
				j++;
			}
		}
		for(int k = j; k<arr.length; k++) {
			arr[k] = 0;
		}
		
		for (int l = 0; l < arr.length; l++) {
			System.out.print(arr[l] + " ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,3,0,0,0,2};
		//Expected output 1 2 3 2 0 0 0 0 
		moveAllZeroToEndMethod_1(arr);
		
	}

}
