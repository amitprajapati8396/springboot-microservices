package com.arrays;

public class PalindromeNumbers {
    static boolean isPalindrome(long number){
    	 long tempNum = number;
    	 long reverse=0;
    	 long remainder=0;
    	 
    	while(tempNum !=0){
    		remainder = tempNum % 10;
    		reverse = reverse * 10 + remainder;
    		tempNum = tempNum/10;
    	}
    	if(reverse == number) 
    	 return true;
    	 else return false;
     }
	
     public static void main(String[] args) {
    	 System.out.println("Is this number a palindrome :" + isPalindrome(12231));
     }
	     
}
