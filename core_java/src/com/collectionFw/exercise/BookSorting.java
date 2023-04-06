package com.collectionFw.exercise;

import java.util.Comparator;

public class BookSorting implements Comparator<BookStore> {
	
	public int compare(BookStore o1, BookStore o2) {
	
	   return  ((Integer)(o1.getBookId())).compareTo((Integer)o2.getBookId());
	}


}
