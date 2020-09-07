package com.arrays;

public class SubArraySumEx3 {

//	public static int findSubArrGivenSum(int[] arr, int gSum){
//		
//		int sum=arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			int currSum=arr[i];
//			for (int j = i+1; j < arr.length; j++) {
//				if(currSum == gSum){
//					System.out.println(i + " " + (j-1));
//					return 1;
//				}
//				if (currSum > gSum || j==arr.length)
//					break;
//				currSum+=arr[j];
//			}
//		}
//		System.out.println("no sub array found!!");
//		return 0;
//		
//	}
	
	//Kadane's algo with time complexity O(n)
	public static int maxSumSubArray(int[] arr) {

		int sumEnding = arr[0];
		int maxSum = 0;
		for (int i = 1; i < arr.length; i++) {
			sumEnding = Math.max(sumEnding + arr[i], arr[i]);// add curr element to sumending and return the max
			maxSum = Math.max(maxSum, sumEnding);
		}
		return maxSum;
	}
	
	public static void maxSumSubArrayWithIndex(int[] arr) {

		int sumEnding = arr[0];
		int maxSum = 0;
		int start = 0;
		int end = 0;
		for (int i = 1; i < arr.length; i++) {
			sumEnding = Math.max(sumEnding + arr[i], arr[i]);// add curr element to sumending and return the max
			end++;
			if(sumEnding>maxSum) {
				start++;
				end=i-1;
			}
			maxSum = Math.max(maxSum, sumEnding);
		}
		System.out.println("Found maximum sum sub array starting at " + start + " ending at " + end);
	}

	public static int subArraySum(int arr[], int n, int sum) {
		// {2,10,25,1,2,3,0,0,2,11,18}
		int curr_sum = arr[0], start = 0, i;

		// Pick a starting point
		for (i = 1; i <= n; i++) {
			// If curr_sum exceeds the sum, then remove the starting elements
			while (curr_sum > sum && start < i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}

			// If curr_sum becomes equal to sum, then return true
			if (curr_sum == sum) {
				int p = i - 1;
				System.out.println("Maximum Sum found between indexes " + start + " and " + p);
				return 1;
			}

			// Add this element to curr_sum
			if (i < n)
				curr_sum = curr_sum + arr[i];

		}

		System.out.println("No subarray found");
		return 0;
	}

	public static void findSubArrGivenSum(int[] arr, int gSum) {
		int currSum = arr[0];
		int prevSum = 0;
		int start = 0;
		int end = 0;
		// int searchStart = 0;
		for (int i = 1; i < arr.length; i++) { // 3

			if (currSum > gSum) {
				currSum = arr[i];
				start = i;
				end = i;

			} else if (currSum < gSum) {
				currSum = currSum + arr[i];// 37
				end = end + 1; // 2
			} else {
				System.out.print(start + " " + end);
				System.out.println();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = { 2, 10, -25, 1, 2, 3, 0, 0, 2, -11, 18 };
		int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
		int givenSum = 8;
		//findSubArrGivenSum(arr, givenSum);
		 //subArraySum(arr,arr.length, givenSum);
		maxSumSubArrayWithIndex(arr);
		System.out.println(maxSumSubArray(arr));
		
	}

}
/*
 * int start=i; int end= i+1; while(start<end){ int currSum = sum+arr[end];
 * if(currSum > gSum){ sum = arr[end]; start = end; } else if(currSum<gSum){
 * end++; } else break; }
 * 
 */