package datasturctures.tree;


public class DeleteNodeInBst {
	
			public Node root;
	
	
	void deleteKey(int key) {
		root = deleteRec(root, key);
	}
	//recursive function
	Node deleteRec(Node root, int key) {
		if(root == null) {
			return root;
		}
		if(key>root.key) {
			root.right = deleteRec(root.right, key);
		}else if(key<root.key) {
			root.left = deleteRec(root.left, key);
		}else {
			if(root.right == null) {
				return root.left;
			}else if(root.left == null) {
				return root.right;
			}
			root.key = findMin(root.right);  //find successor or predecessor for replacing the key
			root.right = deleteRec(root.right, root.key);
		}
		return root;
	}
	//finds in-order successor(min in left subtree)
	int findMin(Node root) {
		int min = root.key;
		while(root.left !=null) {
			min = root.left.key;
			root = root.left;
		}
		return min;
	}
	
}
