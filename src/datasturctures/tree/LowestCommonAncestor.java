package datasturctures.tree;

public class LowestCommonAncestor {

	
	//find lowest common ancestor in bst
			/*if n1 and n2 are less than node key--- call recursive to node.left
			 * if n1 and n2 are greater than node key ---  call recursive to node.right
			 * rest will taken care automatically--
			 * if lcs is one of the node or node key lies between n1 and n2*/
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
