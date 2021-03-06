package datasturctures.tree;

public class LowestCommonAncestor {

	
	//find lowest common ancestor in bst
	// lca is the node between two given nodes, which has lowest value and both given
	// nodes are decedents of the lowest node
	// start traversing from root.
	// First node which is greater than n1(lower node) and lower than n2 (higher node)
	// is the lca node.
			/*if n1 and n2 are less than node key--- call recursive to node.left
			 * if n1 and n2 are greater than node key ---  call recursive to node.right
			 * rest will taken care automatically--
			 * if lca is one of the node or node key lies between n1 and n2*/
		Node lca(Node node, int n1, int n2)
	    {
	        // Your code here
	        if(node==null)
	            return null;
	        
	        if(n1<node.key && n2<node.key)
	            node = lca(node.left, n1, n2);
	        if(n1>node.key && n2>node.key)
	            node = lca(node.right, n1, n2);
	            
	        return node;
	    }	
}
