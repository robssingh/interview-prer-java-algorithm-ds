package datasturctures.tree;

import java.util.*;
import java.util.LinkedList;

public class Traversal {
	
	
//Level order traversal
	/*create a queue--start from root--loop till queue is non empty
	 * ---poll out head--print value-- add left and right to queue*/
	public void bfsTraverse(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.key);
			if(tempNode.left!=null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue.add(tempNode.right);
			}
		}
		};

		
//class ends
}
