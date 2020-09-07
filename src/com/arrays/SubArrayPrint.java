package com.arrays;

public class SubArrayPrint {
	
	public static void printAllSubArrays(int[] arr) {
		for(int start=0; start< arr.length; start++) {
			for(int group = start; group <= arr.length; group++) {
				for (int end = start; end < group; end++) {
					System.out.print(arr[end] + " " + "\n");
				}
			}
		}
	}
	public static void printAllSubArrRecursion(int[] arr, int start, int end) {
		if(end == arr.length) {
			return;
		} else if(start > end) { // then call the function with increamenting end
			printAllSubArrRecursion(arr, 0, end + 1);
		} else {// print the sub arrays till end by increamenting start
			System.out.print("["); 
	        for (int i = start; i < end; i++){ 
	            System.out.print(arr[i]+", "); 
	        } 
	          
	        System.out.println(arr[end]+"]"); 
	        printAllSubArrRecursion(arr, start + 1, end);			
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,8,10,4};
		//printAllSubArrays(arr);
		printAllSubArrRecursion(arr,0,0);
	}

}
