package com.collectionFw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList();
		
		/*
		 * l.add("rama"); l.add(100); l.add(true); l.add(3.4); l.add(100); l.add(null);
		 * l.add(null);
		 */
		
		for(int i=1;i<=10;i++) {
			l.add(i);
		}
		
		
		
		System.out.println(l);//[rama, 100, true, 3.4, 100, null, null]
		
		System.out.println("size is: " + l.size());//7
		
		System.out.println("element at 0th index: " + l.get(0));//rama
		
		
		System.out.println("======using for loop===========");
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("======using foreach loop===========");
		
		for(Integer temp:l)
		{
			if(temp%2==0) {
				System.out.println(temp);
			}
		}

	}
}
