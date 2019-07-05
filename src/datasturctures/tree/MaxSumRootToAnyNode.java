package datasturctures.tree;

public class MaxSumRootToAnyNode {

	static int max_sum=0;
	Node root;
	static Node target_node = null;
	
	static int maxSum(Node root) {
		if(root==null)
			return 0;
		
		getTargetNode(root, 0);
		printNodes(root, target_node);
		return max_sum;
	}
	
	
	//recursive function
	static void getTargetNode(Node node, int curr_sum) {
		if(node==null)
			return;
		
		curr_sum = curr_sum + node.key;
		
		if(node.left==null && node.right==null) {
			if(curr_sum > max_sum) {
				max_sum = curr_sum;
				target_node = node;
			}
		}
		
		getTargetNode(node.left, curr_sum);
		getTargetNode(node.right, curr_sum);
	}
	
	
	//utility function to print nodes from root to targetnode
	static boolean printNodes(Node root, Node targetNode) {
		if(root==null)
			return false;
		if(root==targetNode || printNodes(root.left, targetNode) || 
				printNodes(root.right, targetNode)) {
			System.out.println(root.key+" ");
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]) 
	{ 
		MaxSumRootToAnyNode tree = new MaxSumRootToAnyNode(); 
		tree.root = new Node(10); 
		tree.root.left = new Node(-2); 
		tree.root.right = new Node(7); 
		tree.root.left.left = new Node(8); 
		tree.root.left.right = new Node(50); 
		System.out.println("Following are the nodes "+ 
						"on maximum sum path"); 
		int sum = maxSum(tree.root); 
		System.out.println(""); 
		System.out.println("Sum of nodes is : " + sum); 
	} 
		
}
