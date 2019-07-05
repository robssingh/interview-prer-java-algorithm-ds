package datasturctures.tree;


public class BinaryTree {
	
public Node root;		


/*Print tree inorder, preorder, postorder*/	
		public void printInOrder(Node root) {
			if(root==null) {
				return;
			}
			// change the order here for different orders of traversal
			printInOrder(root.left);
			System.out.println(root.key);
			printInOrder(root.right);
		}
/*Count leaf nodes in a binary tree
 * recursive call to left and right child nodes and add
 * exit when node becomes null i.e. leaf node*/
		
		int countLeaves(Node node) 
	    {
	         // Your code 
	         if(node.left==null && node.right==null)
	            return 1;
	       
	         return countLeaves(node.left) + countLeaves(node.right);
	    }

/* Find height of binary tree 
 * recursive call for left and right-- max of both-- 
 * add one to result for current node and return
 * exit condition when node becomes null i.e. leaf node*/
		 int height(Node node) 
		    {
		         // Your code here
		        if(node==null)
		            return 0;
		        return Math.max(height(node.left), height(node.right))+1;
		    }
		
}
