package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
  static List<Integer> list = new ArrayList<Integer>();
	static void finduplicates(int[] nums){
         for(int i=0 ; i<nums.length ; i++){
        	for(int j=i+1; j<nums.length ; j++){
        		if(nums[i] == nums[j]){
        		  list.add(nums[i]);
        		}
        	}
        	
         }	
         System.out.println(list);
	 }
	
	public static void main(String[] args) {
		finduplicates(new int[]{1,2,3,1,2,4,5,4});
	}
}
