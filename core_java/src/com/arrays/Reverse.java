package com.arrays;

public class Reverse {
    static void reverseStr(String str){
    	String res="";
    	char ch;
        for(int i=0 ; i<str.length() ; i++) {
        	ch = str.charAt(i);
        	res =ch + res;  
        }  
        System.out.println(res);
    }
	public static void main(String[] args) {
		 reverseStr("Amit");
	}
}
