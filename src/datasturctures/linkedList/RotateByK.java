package datasturctures.linkedList;

public class RotateByK {
	
	public void rotate(Node head,int k)
    {
		Node current = head;
		int count = 1;
		while(count<k && current!=null) {  
			current = current.next;
			count++;
		}
		if(current==null) {
			return;
		}
		Node kth = current;
		
		while(current.next!=null) {
			current = current.next;
		}
		current.next = head;
		head = kth.next;
		kth.next = null;
		
		Node n = head;
		while(n!=null) {
			System.out.print(n.data+" ");
			n = n.next;
		}
		
    }
	
	
	
	
}
