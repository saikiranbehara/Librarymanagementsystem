package library;
import java.util.*;

public class Library {
	private ArrayList<book> books;
	
	public Library() {
		books=new ArrayList<>();
	}
	public void addBook(book book1) {
		books.add(book1);
		System.out.println("Book added successfully!");	
		}
	public void viewbooks() {
		if(books.isEmpty()) {
			System.out.println("No books available..");
			//return;
		}
	
	System.out.println("\n====== BOOK LIST =======");
	    for(book book:books) {
	    	System.out.println(book);
	    }
	}
	
}
