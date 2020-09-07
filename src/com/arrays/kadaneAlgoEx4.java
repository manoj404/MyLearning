package com.arrays;

public class kadaneAlgoEx4 {
	
	public static void maximuSumSubArray(int[] arr){
		int maxSum = arr[0];
		int currSum=0;
		int start=0;
		int end = 0;
		int searchStart = 0;
		for (int i = 0; i < arr.length; i++) {
			currSum = currSum+arr[i];//finding current sum
			if(currSum > maxSum){
				maxSum = currSum; //assign current sum to max sum
				start = searchStart; //re assign the start to new index
				end=i;
			} 
			if(currSum < 0){
				currSum = 0;
				searchStart = i+1; // if sum goes to negative then assign the search index to next array index
			}
		}
		for(int k=start ; k< end ; k++){
			System.out.print(arr[k] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
		maximuSumSubArray(arr);
	}

}
