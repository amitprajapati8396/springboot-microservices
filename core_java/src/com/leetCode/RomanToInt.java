package com.leetCode;
public class RomanToInt {

	public static int romanToInt(String s) {

		//char[] arr = s.toCharArray();
		int count=0;

		for (int i = 0; i < s.length(); i++) {
			
           if(s.charAt(i) == 'I' || s.charAt(i) == 'i')
           {
        	   if((i+1)<s.length()) { 
	        	   if (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'v') {
	        		   count = count + 4;  
	        		   i++;
	        	   }
	        	    
	        	   else if(s.charAt(i+1) == 'X' || s.charAt(i+1) == 'x') {
	        		   count = count + 9; 
	        		   i++;
	        	   }
	        	   else count = count+1;   
	        	  
        	    }
        	   else count = count+1;   
        	}
           
           else if(s.charAt(i) == 'V' || s.charAt(i) == 'v')count = count+5;
           
           else if(s.charAt(i) == 'X' || s.charAt(i) == 'X') {
        	 if((i+1)<s.length()) {   
	        	  if(s.charAt(i+1) == 'L' || s.charAt(i+1)=='l') {
	        		  count = count+40;     
	        		  i++;
	        	  }
	        	  else if(s.charAt(i+1) == 'C' || s.charAt(i+1)=='c') {
	        		  count = count+90;
	        		  i++; 
	        	  }
	        	  else count = count+10;   
        	  } 
        	 else count = count+10; 
            }
           
           else if(s.charAt(i) == 'L' || s.charAt(i) == 'l')count = count+50;
           
           else if(s.charAt(i) == 'C' || s.charAt(i) == 'c') {
        	   if((i+1)<s.length()) {  
	        	  if(s.charAt(i+1) == 'D' || s.charAt(i+1)=='d') {
	        		  count = count+400; 
	        		  i++;  
	        	  }
	        	  else if(s.charAt(i+1) == 'M' || s.charAt(i+1)=='m') {
	        		  count = count+900;
	        	      i++;
	        	  }
	        	  else count = count+100;  
        	   } 
        	   else count = count+100;  
           }
           
           else if(s.charAt(i) == 'D' || s.charAt(i) == 'd')count = count+500;
           else if(s.charAt(i) == 'M' || s.charAt(i) == 'm')count = count+1000;
           
           
		}
		return count;
	}
   
	public static void main(String[] args) {
		  
		System.out.println(romanToInt("MCM"));
	}
}
