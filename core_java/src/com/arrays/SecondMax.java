package com.arrays;

public class SecondMax {
    
	public static int findSecondMax(int[] arr){
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i : arr){
			if(i>max){
				secondMax = max;
				max = i;
				
			}else if(i>secondMax){
				secondMax = i;
			}
		}
	  return secondMax;
	} 
	
	public static void main(String[] args) {
		int[] arr= new int[]{1,2,3,4,2,1,6,3,4,7,6,1,2,4,67,99};
		System.out.println("second max value :  "+findSecondMax(arr));
		
	}
}
