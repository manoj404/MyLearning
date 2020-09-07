package com.trying;

public class NumberToWords {

	public static String converter(int num) {
		String str = "";
		if(num<100)
			str = oneToHundred(num);
		else if(num>=100 && num<1000) {
			str = oneToHundred(num/100) + "hundred" + converter(num%100);
		}
		else if(num>=1000 && num<100000) {
			str = oneToHundred(num/1000) + "thousand" + converter(num%1000);
		}
		return str;
	}

	public static String oneToHundred(int num) {
		String str = "";
		String[] units = { "zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		if(num>=0 && num<20) {
			str =  units[num];
		} else if(num>=20 && num < 100){
			str =  tens[num/10] + units[num%10];
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 52001;
		System.out.println(converter(num));

	}

}
