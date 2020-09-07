package com.algorithms.dynamic.program;

public class LongestIncreasingSubSeqEx1 {
	
	public static void longestIncreasingSubSeq(int[] arr, int len) {
		int[] lis = new int[len];
		int max=0;
		/* Initialize LIS values for all indexes */
		for (int i = 0; i < lis.length; i++) {
			lis[i] = 1;
		}
		/* Compute optimized LIS values in  
        bottom up manner */
		for (int i = 1; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if(arr[i]>arr[j]) {// compare the ith index with jth index
					lis[i] = Math.max(lis[i], lis[j]+1);// then update the lis of ith index with lis[j] +1 with max value
				}
			}
		}
		/* Pick maximum of all LIS values */
		for (int i = 0; i < lis.length; i++) {
			if(max<lis[i]) {
				max=lis[i];
			}
		}
		System.out.println("Longest increasing sub sequence length is " + max);
	}
	
	public static void main(String args[]) {
		//int arr[] = {50, 3, 10, 7, 40, 80};
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int len = arr.length;
		longestIncreasingSubSeq(arr,len);
	}
}
