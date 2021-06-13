package datasturctures.linkedList;

import datasturctures.linkedList.LinkedList.Node;

public class Demo {

	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.head = new Node(5);
		llist.push(9);
		llist.push(7);
		llist.push(1);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(8);
		llist.push(5);
		
//		llist.print();
//		llist.findMiddle();
//		llist.reverseList();
//		System.out.print("\n\nLinkedList after reversal:");
//		llist.insert(22, 3);
//		llist.print();
//		llist.printRecursive();
		System.out.println(llist.getLength());
	}
	
}
