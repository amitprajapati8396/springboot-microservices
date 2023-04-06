package com.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
    
	public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
 
        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
 
        temp[j++] = a[n - 1];
 
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
 
        return j;
    }
	
	public static int[] removeDuplicates(int[] nums) {
		int[] arr = new int[nums.length - 1];
		for (int i = 0, k = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] != nums[j]) {
					arr[k] = nums[i];
				}
			}
		}
		return arr;
	}
    
	public static void main(String[] args) {
		
		int[] arr= new int[]{1,1,2,0,1,2,5,3,5,4};
		
		int n= removeduplicates(arr, arr.length);
		System.out.println(n);
		
		// Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    
		
		//System.out.println(Arrays.toString(removeDuplicates(arr)));
	}
}
