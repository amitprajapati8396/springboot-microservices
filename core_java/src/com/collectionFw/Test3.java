package com.collectionFw;

import java.util.TreeSet;

public class Test3 {
public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new MyComparator());
		
		
		ts.add(100);
		ts.add(34);
		ts.add(67);
		ts.add(675);
		ts.add(-8);
	
		  System.out.println(ts.first());//-8 System.out.println(ts.last());//675
		  System.out.println(ts.headSet(67));//[-8, 34]
		  System.out.println(ts.tailSet(67));//[67, 100, 675]
		  System.out.println(ts.subSet(100, 34));//[34, 67]
		 			
		System.out.println(ts);
		
	}
}
