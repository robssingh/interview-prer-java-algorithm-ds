package datasturctures.tree;

import java.util.*;
import java.util.LinkedList;

public class Traversal {

	// Level order traversal or Breadth First BFS
	/*
	 * create a queue--start from root--loop till queue is non empty ---poll out
	 * head--print value-- add left and right to queue
	 */
	public void bfsTraverse(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll(); // removes head
			System.out.println(tempNode.key);
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	};

	/*
	 * 1 2 3 4 5 6
	 */

	// Depth FIrst traversals: Inorder, Preorder, Postorder
	// Inorder (left, root, right) - 4 2 5 1 3 6
	// Preorder (root, left, right) - 1 2 4 5 3 6
	// Postorder (left, right, root) - 4 5 2 6 3 1
	public void printInOrder(Node root) {
		if (root == null) {
			return;
		}
		// change the order here for different orders of traversal
		printInOrder(root.left);
		System.out.println(root.key);
		printInOrder(root.right);
	}
}
