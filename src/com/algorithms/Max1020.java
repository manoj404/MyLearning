package com.algorithms;
public class Max1020 {

	public static int max1020(int a, int b) {
		
		Boolean condition1 = (a >= 10 && a <= 20);
		Boolean condition2 = (b >= 10 && b <= 20);
		if(condition1 && !condition2){
			return a;
		} else if(!condition1 && condition2){
			return b;
		}else if (condition1 && condition2) {
			return (a>b)?a:b;
		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(max1020(11, 19) + " " + max1020(19, 11) + " " + max1020(1, 19) + " " + max1020(10, 20) + " "
//				+ max1020(10, 21)+" " + max1020(1, 21));
		System.out.println(max1020(15, 18));
	}

}
