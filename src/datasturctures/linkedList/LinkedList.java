package datasturctures.linkedList;

public class LinkedList {
	Node head;
	
	static class Node{				// Node Class
		int data;
		Node next;
		Node(int d){		//constructor to create Node
			data = d;
			next = null;
		}
	}
		

	/**
	 * Method to print LinkedList
	 */
	public void print() {		
		Node n = head;
		System.out.println("\n");
		while(n != null) {
			System.out.print(n.data +"-> ");
			n = n.next;
		}
	}
	
	/**
	 * @param n
	 * Method to push entry from start
	 */
	public void push(int n) {		
		Node n1 = new Node(n);
		n1.next = head;
		head = n1;
	}
	
	/**
	 * find middle element
	 */
	public void findMiddle() {		
		int len=0;
		Node n=head;
		Node n1=head;
		while(n != null) {
			len++;
			if(len%2==0 && len>2) { 
				n1=n1.next;
			}
			n=n.next;
		}
		if(len%2==1) {
			n1=n1.next;
		}
		System.out.println("\nMiddle item is : "+n1.data);
		
	}
	
	/**
	 * Reverse linked list
	 */
	public void reverseList() {			
		Node Current = head;
		Node Pre=null; 
		Node next = null;
		while(Current !=null) {
			next = Current.next;
			Current.next = Pre;
			Pre = Current;
			Current = next;
		}
		head = Pre;
	}
	
	/**
	 * @param val
	 * @param index
	 * insert value at index
	 */
	public void insert(int val, int index) {		
		Node node = head;
		Node temp= new Node(val);
		Node temp1 = null;
		if(index==1) {
			temp.next = head;
			head = temp;
			return;
		}
		while(index-2>0) {
			node=node.next;
			index--;
		}
		
		temp1 = node.next;
		node.next = temp;
		temp.next = temp1;
	}
	
	
	/**
	 * print recursively from start or end
	 */
	public void printRecursive() {		
		System.out.println("\n");
		printRecFunc(head);
	}
	//function for recursive call
	public void printRecFunc(Node node) { 
		if(node == null) {
			return;
		}
//		System.out.println(node.data);
		printRecFunc(node.next);
		System.out.println(node.data);
	}
	//get length
	public int getLength() {
		int count=0;
		while(head !=null) {
			count++;
			head = head.next;
		}
		return count;
	}
//End of Class	
}
