package com.arrays;

public class ArrayInversionEx5 {

	public static int arrayInversion(int[] arr)
	{
		int inversionCount=0;
 
		for (int i=0; i<arr.length-1; i++)
		{
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					inversionCount++;
					System.out.println("Inversion :" + arr[i] + " " + arr[j]);
				}
			}
		}
 
		return inversionCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2,4,1,3,5};
		arrayInversion(arr);
	}

}

//{{])()