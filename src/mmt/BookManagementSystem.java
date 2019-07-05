package mmt;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class BookManagementSystem {
	//List of book categories
	static HashSet<String> categories = new HashSet<>();
	static ArrayList<Book> books = new ArrayList<>();
	static ArrayList<IssueRecords> records = new ArrayList<>();
	static int BookId=0;
	
	
	//add category
	public void addCategory(String categoryName) {
		categories.add(categoryName);
	}
	
	//add book to category
	public static void addBookToCategory(int id, String category) {
		Book book;
		if(!categories.contains(category)) {
			categories.add(category);
		}
		boolean searchFlag = false;
		int counter = 0;
		while(searchFlag==false) {
			book = books.get(counter);
			if(book.bookId == id) {
				book.category = category;
				searchFlag = true;
			}
			counter++;
		}
	}
	
	//List all books
	static void listBooks() {
		System.out.println("---List of available books---");
		for(Book b: books) {
			System.out.println(b.bookId+"  "+b.name+"  "+b.category);
		}
	}
	
	//issue Book
	@SuppressWarnings({ "deprecation", "deprecation" })
	public void issueBook(int id) {
		Book b = books.get(id);
		if(b.issuedFlag==false) {
			System.out.println("Issuing book with id "+b.bookId+" Name:"+b.name);
		}
		b.issuedFlag = true;
		//create record
		IssueRecords ir = new IssueRecords();
		ir.bookId = id;
		ir.issueDate = new Date(2018, 11, 17);  //assign current date
//		records.add(ir);
	}
	
	//submit book
	public void submitBook(int id) {
		Book b = books.get(id);
		b.issuedFlag = false;
		
	}
	
	
	//driver method for Book Management system---------------
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		categories.add("science");
		categories.add("novel");
		
		Book b1 = new Book("ABC", "Churchil");
		Book b2 = new Book("XYZ", "Kalam");
		
		addBookToCategory(0, "Novel");
		addBookToCategory(1, "Story");
//		listBooks();
		SearchBooks.searchBook("ABC", "Kalam", "");
		
	}

}
