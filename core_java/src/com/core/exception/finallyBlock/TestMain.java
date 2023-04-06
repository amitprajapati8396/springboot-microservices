package com.core.exception.finallyBlock;

public class TestMain {
	public static void main(String[] args) {
		Test1 test = new Test1();
		
		String str = "Amit";
		
		try {
			
			System.out.println(test.doCapital(str));
			
		} catch (NullPointerException npe) {
			
			System.out.println(npe.getMessage());
			
		} finally {
			str = null;
		}
	}

}
