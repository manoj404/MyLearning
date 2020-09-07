package com.arrays;

import java.util.Arrays;

public class ArrayRemoveDuplicateEx10 {
	
	public int[] removeDuplicates(int[] arr) {
	    
		int temp = arr[0]; 
	    int res_ind = 1; 
	    for (int i = 1; i < arr.length; i++) 
	    { 
	        if (temp % arr[i] != 0) 
	        { 
	        	arr[res_ind++] = arr[i]; 
	        	temp = temp * arr[i]; 
	        } 
	    } 
	    return Arrays.copyOf(arr, res_ind);
	}
	
	public int removeDuplicate(int[] arr) {
		int len = arr.length;
		int[] temp = new int[len];
		int j=0;
		if(len==0 || len==1)
			return len;
		else {
			for (int i = 0; i < arr.length -1 ; i++) {
				if(arr[i]!=arr[i+1]) {
					temp[j] = arr[i];
					j++;
				}
			}
			temp[j++] = arr[len-1];
			for (int i = 0; i < j; i++) {
				arr[i] = temp[i];
			}
			return j;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {2,5,5,2,3,9,14,8,14};
		int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
		ArrayRemoveDuplicateEx10 obj = new ArrayRemoveDuplicateEx10();
		//int[] finalArr = obj.removeDuplicates(arr);
		int n = obj.removeDuplicate(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
