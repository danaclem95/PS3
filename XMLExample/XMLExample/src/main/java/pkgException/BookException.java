package pkgException;

import pkgLibrary.Book;
import pkgLibrary.Catalog;

public class BookException extends Exception{
	
	private String BookID;
	private Book b;
	private Catalog cat;
	
	public BookException(String BookID, Catalog cat){
		super();
		this.BookID = BookID;
		this.cat = cat;
	}
	
	public BookException(Book b, Catalog cat){
		super();
		this.b = b;
		this.cat = cat;
	}

	
}
