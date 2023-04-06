package com.string;

public class StringTest {
   
	public static String reverseString(String str) {
		String rev="";
		
		for(int i=0;i<str.length();i++){
			rev = str.charAt(i)+rev;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseString("Amit"));
	}
}
