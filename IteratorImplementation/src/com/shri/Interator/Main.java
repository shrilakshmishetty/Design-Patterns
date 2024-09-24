/*Implement a library system where you have a collection of books. You need to provide a way to iterate over the collection of books without exposing the underlying implementation of the collection. Use the Iterator design pattern to solve this problem.
1. Book: A simple class representing a book with a title and an author.
2. BookCollection: A collection of books.
3. BookIterator: An iterator for the BookCollection.
4. Main: A class to demonstrate the usage of the iterator.
*/
package com.shri.Interator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		BookCollection b=new BookCollection();
		b.addBook(new Book("Inferno","Dan Brown"));
		b.addBook(new Book("Twilight","Stepheny"));
		b.addBook(new Book("maths","ncert"));
		
		
		BookIterator bi=b.createIterator();
	while (bi.hasNext()) {
        Book book=bi.next();
        System.out.println(book.getTitle()+" written by "+book.getAuthor());
    }
	

}
}
