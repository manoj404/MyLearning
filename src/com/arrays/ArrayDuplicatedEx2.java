package com.arrays;

import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayDuplicatedEx2 {
	
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
	int count = 0;
	
	public void findDuplicates(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			} else{
				hm.put(arr[i], hm.get(arr[i])+1);
			}			
		}		
		for (Entry<Integer, Integer> entry1 : hm.entrySet() ) {
			if(entry1.getValue()>1){
				System.out.println(entry1.getKey());
			}
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,2,4,3};
		ArrayDuplicatedEx2 obj = new ArrayDuplicatedEx2();
		obj.findDuplicates(arr);
	}

}
