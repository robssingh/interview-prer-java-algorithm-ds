package datasturctures.tree;

public class BSTCreationPreorderTraversal {
	
	Node root; 
	class Index {
	 
	    int index = 0;
	}
	static int size ; 
	 
	    Index index = new Index();
	     
	    Node constructTreeUtil(int pre[], Index preIndex,
	            int low, int high) {
	         
	        if (preIndex.index >= size || low > high) {
	            return null;
	        }
	 
	        // The first node in preorder traversal is root. So take the node at
	        // preIndex from pre[] and make it root, and increment preIndex
	        Node root = new Node(pre[preIndex.index]);
	        preIndex.index = preIndex.index + 1;
	 
	        // If the current subarry has only one element, no need to recur
	        if (low == high) {
	            return root;
	        }
	 
	        // Search for the first element greater than root
	        int i;
	        for (i = low; i <= high; ++i) {
	            if (pre[i] > root.key) {
	                break;
	            }
	        }
	 
	        root.left = constructTreeUtil(pre, preIndex, preIndex.index, i - 1);
	        root.right = constructTreeUtil(pre, preIndex, i, high);
	 
	        return root;
	    }
	 
	    // The main function to construct BST from given preorder traversal.
	    // This function mainly uses constructTreeUtil()
	    Node constructTree(int pre[], int n) {
	    	size = n;
	        return constructTreeUtil(pre, index, 0, size - 1);
	    }
	 
	   //traverse inorder 
	    void printInorder(Node node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.key + " ");
	        printInorder(node.right);
	    }
	 
	    // Driver program to test above functions
	    public static void main(String[] args) {
	    	BSTCreationPreorderTraversal tree = new BSTCreationPreorderTraversal();
	        int pre[] = new int[]{10, 5, 1, 7, 40, 50};
	        int size = pre.length;
	        Node root = tree.constructTree(pre, size);
	        System.out.println("Inorder traversal of the constructed tree is ");
	        tree.printInorder(root);
	    }
}
