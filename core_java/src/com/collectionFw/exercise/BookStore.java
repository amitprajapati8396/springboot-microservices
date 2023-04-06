package com.collectionFw.exercise;

public class BookStore {
	
	private int bookId;
	private String bookName;

	public BookStore(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}

	public BookStore() {
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
   
	@Override
	public String toString() {
		return  "Book Id : "+bookId+"  Book Name : "+bookName;
	}
}
