package datasturctures.tree;

import java.util.Stack;

public class PrintSpiral {

	
	//Print tree in spiral level order
			public void printSpiral(Node root) {
				Stack<Node> s1 = new Stack<Node>();
				Stack<Node> s2 = new Stack<Node>();
				s1.push(root);
				while(!s1.isEmpty() || !s2.isEmpty()) {
					while(!s1.isEmpty()) {
						Node temp = s1.pop();
						System.out.println(temp.key+" ");
						if(temp.right!=null)
							s2.add(temp.right);
						if(temp.left!=null)
							s2.add(temp.left);
					}
					while(!s2.isEmpty()) {
						Node temp = s2.pop();
						System.out.println(temp.key+" ");
						if(temp.left!=null)
							s1.add(temp.left);
						if(temp.right!=null)
							s1.add(temp.right);
					}
				}
			}
			
			
			//------------Main method--------------
			public static void main(String args[])
		    {
		        /* creating a binary tree and entering 
		         the nodes */
		        BinaryTree tree_level = new BinaryTree();
		        tree_level.root = new Node(1);
		        tree_level.root.left = new Node(2);
		        tree_level.root.right = new Node(3);
		        tree_level.root.left.left = new Node(4);
		        tree_level.root.left.right = new Node(5);
		 
		        System.out.println("Level order traversal of binary tree is - ");
		        PrintSpiral ts = new PrintSpiral();
		        ts.printSpiral(tree_level.root);
		    }
	
}
