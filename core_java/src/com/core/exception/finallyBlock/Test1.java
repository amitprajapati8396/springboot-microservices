package com.core.exception.finallyBlock;

public class Test1 {
    
	public String doCapital(String str){
		if(str.isEmpty()){
			throw new NullPointerException("string should not be empty.");
		}
		return str.toUpperCase();
	}
}
