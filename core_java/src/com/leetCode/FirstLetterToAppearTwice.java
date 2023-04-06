package com.leetCode;

public class FirstLetterToAppearTwice {  
	 
	public static char repeatedCharacter(String s) {
	        int i;
	        for(i=0;i<s.length();i++){
	            for(int j=0;j<i;j++){
	                if(s.charAt(i)==s.charAt(j)){
	                    return s.charAt(i);
	                   
	                 }
	            }
	        }
	        
	        return s.charAt(i);
	    }
	
	
	public static void main(String[] args) {
	
		System.out.println(repeatedCharacter("regzueqr"));
	}
}
