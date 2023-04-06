package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class SortArray {
   
	public static void sortArray(int[] arr){
		
		int temp = 0;
		List<Integer> sorted = new ArrayList<>();
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			}
		   sorted.add(arr[i]);	
		}
		
	   	
	System.out.println("Smallest number : "+arr[0]+"\nLargest number : " + arr[arr.length-1]);	
	System.out.println(sorted);
		
//	 for(int i : arr)	
//	  System.out.println(i);	
	}
	
	public static void smallestAndLargest(int[] arr) {
		int MIN_VALUE = Integer.MIN_VALUE;
		int MAX_VALUE = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] > MAX_VALUE){
				MAX_VALUE = arr[i];
			}
			else if(arr[i] < MIN_VALUE)
				MIN_VALUE = arr[i];
		}
		
		System.out.println(MIN_VALUE +"    "+ MAX_VALUE);
	}
	
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,4,2,6,5,0};
		//sortArray(arr);
		smallestAndLargest(arr);
	}
}
