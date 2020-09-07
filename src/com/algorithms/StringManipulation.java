package com.algorithms;
import java.util.*;
import java.util.Map.Entry;

public class StringManipulation {

	public static void main(String args[]) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
//		String input2 = sc.next();
		HashMap<Character, Integer> output = stringMaxRepetativeChar(input);
		System.out.println(output);
		int max = 0;
		char ch = 0;
		Set<Character> keySet = output.keySet();
		for (Character character : keySet) {
			if(output.get(character)>max){
				max = output.get(character);
				ch=character;
			}
		}
		System.out.println("Maximum repeated char: " + ch);
//		Entry<Character, Integer> entry = null;
//		int max = 0;
//		for (Entry<Character, Integer> entry1 : output.entrySet()) {
//			if (entry == null || entry1.getValue() > max) {
//				max = entry1.getValue();
//				entry = entry1;
//			}
//		}
//		System.out.println("Maximum repeated char: " + entry.getKey() + " " + entry.getValue());
		stringMaxRepetativeChar(input);
		//removeDuplicateCharacter(input);
		//firstNonRepeatingChar(input);
//		boolean output = anagram(input1,input2);
//		System.out.println(output);
		
	}
	
	public static boolean anagram(String str1, String str2){
		
		int len1 = str1.length();
		int len2 = str2.length();
		boolean isAnagram = false;
		if(len1==len2){
			char[] chArr1 = str1.toCharArray();
			char[] chArr2 = str2.toCharArray();
			Arrays.sort(chArr1);
			Arrays.sort(chArr2);
			if(String.valueOf(chArr1).equalsIgnoreCase(String.valueOf(chArr1))){
				isAnagram = true;
			}
		}
		return isAnagram;
	}
	
	public static void anagramList(){
		
	}

	public static void removeDuplicateCharacter(String str) {

		char[] charArr = str.toCharArray();
		ArrayList<Character> al = new ArrayList<Character>();
		StringBuilder builder = new StringBuilder();
		boolean isRepeated;
		for (int i = 0; i < charArr.length; i++) {
			isRepeated=false;
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j]) {
					isRepeated=true;
					break;
				} 
			}
			if(!isRepeated){
				builder.append(charArr[i]);
			}

		}
		System.out.println("Removed duplicate character string: " + builder.toString());

	}

	public static HashMap<Character, Integer> stringMaxRepetativeChar(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] chArr = str.toCharArray();
		for (char c : chArr) {
			if (hm.containsKey(c)) {
				int count = hm.get(c);
				hm.put(c, count + 1);
			} else {
				hm.put(c, 1);
			}
		}
		return hm;
	}
	
	public static void firstNonRepeatingChar(String str){
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		char[] charr = str.toCharArray();
		for (char c : charr) {
			if(lhm.containsKey(c)){
				int count = lhm.get(c);
				lhm.put(c, count+1);
				
			}else {
				lhm.put(c, 1);
			}
		}
		
		char output = 0;
		for(Entry<Character, Integer> entry1 : lhm.entrySet()){
			if(entry1.getValue()==1){
				output = entry1.getKey();
				break;
			}
		
		}
		System.out.println("First non-repeated character: "+ output);
		
	}
	
}
