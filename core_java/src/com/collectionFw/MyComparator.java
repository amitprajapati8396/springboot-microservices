package com.collectionFw;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return -o1.compareTo(o2);
	}

}
