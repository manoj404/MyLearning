package com.arrays;

public class MaxLengthEvenOddSubArray {

	//Naive Solution
	// Time Complexity O(n*n)
	public static int maxlengthEvenOddSubArray(int[] arr) {
		int result = 1;
		for (int i = 0; i < arr.length; i++) {
			int count=1;
			for (int j = i+1; j < arr.length; j++) {
				if((arr[j]%2 == 0 && arr[j-1]%2 !=0) || (arr[j]%2 !=0 && arr[j-1]%2==0)){
					count++;
				} else 
					break;
			}
			result = Math.max(result, count);
		}
		return result;
	}
	
	//kadane's algo
	// Time Complexity O(n)
	public static int maxlengthEvenOddSubArrayKadane(int[] arr) {
		int result = 1;
		int curr = 1;
		for (int i = 1; i < arr.length; i++) {
				if((arr[i]%2 == 0 && arr[i-1]%2 !=0) || (arr[i]%2 !=0 && arr[i-1]%2==0)){// checking alternate odd and even 
					curr++;
					result = Math.max(result, curr);
				} else curr=1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,10,20,6,3,8,7};
		int result = maxlengthEvenOddSubArrayKadane(arr);
		System.out.println("Max length: " + result);
	}

}
