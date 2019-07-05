package systemDesign.mmtLibrary;

import java.util.Date;

public class IssueRecords {
	public int bookId;
	Date issueDate;
	Date dueDate;
	Date submitDate;
	Book b;
	
	public IssueRecords() {
		
	}
	
	
	public IssueRecords(int bookId, Date issueDate) {
		this.bookId = bookId;
		this.issueDate = issueDate;
		this.dueDate = this.issueDate;  //due date after 15 days of issue
		BookManagementSystem.records.add(this);
	}
}
