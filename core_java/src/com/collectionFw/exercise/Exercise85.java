package com.collectionFw.exercise;

import java.util.Set;
import java.util.TreeSet;

public class Exercise85 {
	public static void main(String[] args) {
       
		BookStore book1 = new BookStore();
		
		book1.setBookId(101);
        book1.setBookName("The Indian");
        
        BookStore book2= new BookStore();
        
        book2.setBookId(102);
        book2.setBookName("The Fire Man");
		
        Set<BookStore> list = new TreeSet<BookStore>(new BookSorting());
        list.add(book1);
        list.add(book2);
        
        System.out.println(list);
	}
}
