package com.core.exception;

public class ArithmaticEx {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		try {
			 int c = a /b;
			 System.out.println(c);
		} catch (ArithmeticException ae) {
			System.out.println("denominator should not be zero !");
		}

		
	}
}
