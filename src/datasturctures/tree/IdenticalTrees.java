package datasturctures.tree;

public class IdenticalTrees {
	
	Node root1, root2;
    Node root;
    // Two trees are identical if they have exactly same structure
    // and arrangement of nodes. In same order
	static boolean identicalTree(Node node1, Node node2) {
		if(node1==null && node2==null) {
			return true;
		}
		if(node1!=null && node2!=null) {
			
			return ((node1.key == node2.key) &&
					identicalTree(node1.left, node2.left) &&
					identicalTree(node1.right, node2.right));
		}
		
		return false;
	}
	
	
	//check if tree is mirror of itself
    //same approach as above. only difference is that 
    //we need to compare left with right
	boolean isMirror(Node root) {
		return symmetricTree(root, root);
    }
    
    static boolean symmetricTree(Node node1, Node node2) {
		if(node1==null && node2==null) {
			return true;
		}
		if(node1!=null && node2!=null) {
			
			return ((node1.key == node2.key) &&
            symmetricTree(node1.left, node2.left) &&
            symmetricTree(node1.right, node2.right));
		}
		
		return false;
	}
	
	
	//Main Method---------------------
	
	public static void main(String[] args) {
		IdenticalTrees tree = new IdenticalTrees();
		
		tree.root1 = new Node(1); 
        tree.root1.left = new Node(2); 
        tree.root1.right = new Node(3); 
        tree.root1.left.left = new Node(4); 
        tree.root1.left.right = new Node(5); 
   
        tree.root2 = new Node(1); 
        tree.root2.left = new Node(2); 
        tree.root2.right = new Node(3); 
        tree.root2.left.left = new Node(4); 
        tree.root2.left.right = new Node(4); 
   
        if (identicalTree(tree.root1, tree.root2)) 
            System.out.println("Both trees are identical"); 
        else
            System.out.println("Trees are not identical");
		
        
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(4); 
        tree.root.right.left = new Node(4); 
        tree.root.right.right = new Node(3); 
        boolean output = tree.isMirror(tree.root); 
        if (output == true) 
            System.out.println("Tree is mirror of itself"); 
        else
            System.out.println("Tree is not mirror of itself"); 
	}
	
	
	
}
