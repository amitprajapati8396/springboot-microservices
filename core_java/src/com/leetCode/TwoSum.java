package com.leetCode;

import java.util.Arrays;

public class TwoSum {
   
	public static int[] twoSum(int[] nums ,int target ){
		 
		int[] result = new int[2];
	   
		for(int i = 0 ; i<nums.length ; i++){
		    
			for(int j = i+1 ; j<nums.length; j++) {	 
			 
				//if(i+1<nums.length && j<nums.length){
					
					if(nums[i] + nums[j] == target){
						result[0]=i;
						result[1]=j;
					}
				//}
		    }
		}  
      return result; 
    }
	
	
	public static void main(String[] args) {
		int[] sum = twoSum(new int[]{3,2,3,7,9,21},24);
	    System.out.println(Arrays.toString(sum));
	}
}
