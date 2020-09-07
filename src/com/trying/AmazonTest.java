package com.trying;

import org.omg.CORBA.PUBLIC_MEMBER;

//Input:
//String: BdAcbCaD
//Output:
//BbdDAacC
public class AmazonTest {
	
	public static void arrangeAlphabet(String str) {
		char[] chArr = str.toCharArray();
		int j = 0;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < chArr.length; i++) {
			char temp = chArr[i];
			builder.append(temp);
			while (j < chArr.length) {
				if ((temp - chArr[j]) == 32 || (temp - chArr[j]) == -32) {					
					builder.append(chArr[j]);
				}
				j++;
			}
			j=0;
		}
		System.out.println(builder.substring(0, str.length()));
	}
	
	public static void rightShift(int[] arr, int n) {
		int len = arr.length;
		for (int i = n-1; i < len+n-1; i++) {
			int index = i%len;
			System.out.print(arr[index] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BdAcbCaD";
		int[] arr = {4,5,8,2,1,6,9};
		rightShift(arr,4);
		//arrangeAlphabet(str);
	}

}
