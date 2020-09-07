package com.algorithms;

public class StringPalindrom1CharChange {

	public static String oneCharChangePalndrm(String st) {

		int len = st.length();
		int countEquals = 0;
		int countNotEquals = 0;
		int mid = len/2;
		for (int i = 0; i < mid; i++){
			if (st.charAt(i) != st.charAt(len - i - 1)){
				countNotEquals++;
			}
		}
		if(countNotEquals==1)
			return "YES";
		else
			return "No";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "abb";
		System.out.println(oneCharChangePalndrm(st));
	}
}
