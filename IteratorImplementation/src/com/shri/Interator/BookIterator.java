package com.shri.Interator;

import java.util.List;
import java.util.NoSuchElementException;

public class BookIterator {
	int curr=0;
	List<Book> list;
	BookIterator(List<Book> list){
		this.list=list;
		
	}
	public boolean hasNext() {
        return curr < list.size();
    }


    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return list.get(curr++);
    }

}
