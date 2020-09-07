package com.algorithms;

public class QuickSort {
	
	public void swap(int[] arr, int start, int end){
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
	}
	
	public int partition(int[] arr, int li, int ui){
		int pivot = arr[li];
		int start = li;
		int end = ui;
		while(start<end){
			while(arr[start] <= pivot) 
				start++;
			while(arr[end] > pivot)
				end--;
			if(start<end){
				swap(arr,start,end);
			}
		}
		swap(arr,li,end);
		return end;
	}
	
	public int[] quickSort(int[] arr, int li, int ui){
		if(li<ui){
			int location = partition(arr,li,ui);
			quickSort(arr,li,location-1);
			quickSort(arr, location+1,ui);
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,10,5,9,2,1,15,7};
		QuickSort obj = new QuickSort();
		int[] sortedArr = obj.quickSort(arr, 0, (arr.length-1));
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i] + " ");
		}
	}

}
