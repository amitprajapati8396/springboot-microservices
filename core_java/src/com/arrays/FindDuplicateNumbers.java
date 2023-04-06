package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumbers {
   
	public static void duplicateNumbers(int[] arr){
		
		List<Integer> list = new ArrayList<>(); 
		for(int i=0; i<arr.length ; i++){
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[i] == arr[j]){
					list.add(arr[i]);
				}
			}
		}
		System.out.println("List of duplicate numbers : "+list);
		
	}
	
	public static void main(String[] args) {
		int[] arr= new int[]{1,2,3,4,2,1,6,3,4,7,6,1,2,4};
		duplicateNumbers(arr);
	}
}
