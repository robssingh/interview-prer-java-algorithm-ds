package mmt;

public class Book {
	public String category;
	public String name;
	public String author;
	public int bookId;
	boolean issuedFlag;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
		this.category = "";
		this.bookId = BookManagementSystem.BookId++;
		BookManagementSystem.books.add(this);
	}
	
	public static void print(Book b) {
		System.out.println("Book Name :"+b.name+"  Author:"+b.author+"  Category:"+b.category);
	}
}
