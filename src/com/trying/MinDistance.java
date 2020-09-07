package com.trying;

public class MinDistance {

	    // Returns the distance between the two closest numbers.
	    static int distClosestNumbers(int[] numbers) { 
	        // try to implement it!
	        int minDistance = numbers[0];
	        for(int i = 0; i< numbers.length-1; i++){
	            for(int j=i+1; j< numbers.length; j++){
	                int curDiff = Math.abs(numbers[i] - numbers[j]);
	                if(minDistance>curDiff){
	                    minDistance = curDiff;
	                }
	            }
	        }
	        return minDistance;
	    }
	    
	    public static void main(String[] args) {
	        int[] testArray = {3, 9, 50, 15, 99, 7, 98, 65};
	        int result = distClosestNumbers(testArray);
	        System.out.println(result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
	    }

}
