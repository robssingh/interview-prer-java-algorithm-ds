package systemDesign.mmtLibrary;

public final class SearchBooks {
	
	//search by name and author
	public static void searchBook(String name, String author, String category) {
		System.out.println("-------Found Books-------");
		for(Book b: BookManagementSystem.books) {
			if(b.name==name && b.author==author && b.category==category) {
				Book.print(b);
			}
			else if(b.name==name || b.author==author || b.category==category) {
				Book.print(b);
			}
		}
	}
	
	
}
