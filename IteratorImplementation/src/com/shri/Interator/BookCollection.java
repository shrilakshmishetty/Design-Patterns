package com.shri.Interator;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
	List<Book> list;
	BookCollection(){
		this.list=new ArrayList<>();
	}
	
	void addBook(Book book) {
		list.add(book);
	}
	
	BookIterator createIterator() {
		return new BookIterator(list);
	}

}
