package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;
import pkgException.BookException;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	

	
	public Book getBook(String ID) throws BookException{
		for (Book b : this.getBooks()){
			if (b.getId().equals(ID)){
				return b;
			}
		} throw new BookException(ID, this);
	}
	
	public void AddBook(Book book) throws BookException{
		for (Book b : this.getBooks()){
			if (b.getId().equals(book.getId())){
				// Can't add two books with the same ID / one that already exists
				throw new BookException(book, this);
			}
		}this.getBooks().add(book);
	}

	
	
	
	
	}
