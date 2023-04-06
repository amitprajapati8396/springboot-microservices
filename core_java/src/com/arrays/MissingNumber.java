package com.arrays;

public class MissingNumber {
    
	public static void missingNumbers(int nums[],int top){
		
		
		for(int i=0; i<nums.length ; i++){
		 	
		  if(nums[i]<top) {
			  
			if(nums[i]+1 !=nums[i+1]){
				System.out.println("missing number is : "+ (nums[i]+1));
			}
		  } 	
		}
	}
	
	public static void main(String[] args) {
	   int[] arr = new int[]{11,12,13,15,16,17,19};	
	   missingNumbers(arr,19);
	}
}


