package datasturctures.tree;

public class CheckForBst {

	
	/*----<1>  Check for Bst----*/
	 int isBST(Node root)  
	    {
	        // Your code here
	        boolean b;
	        b=isBSTrec(root);
	        if(b==true)
	            return 1;
	        else
	            return 0;
	    }
	 /*its bst if left is smaller than root, right is bigger 
	 * and both left and right are bst*/
	    boolean isBSTrec(Node root)
	    {
	       if(root==null)
	            return true;
	       if(isLesser(root.left, root.key) && isGreater(root.right, root.key)
	       && isBSTrec(root.left) && isBSTrec(root.right)  ) 
	           return true;
	       else 
	           return false;
	    }
	    boolean isLesser(Node root, int data){
	        if(root==null)
	            return true;
	        if(root.key<=data)
	            return true;
	        else
	            return false;
	    }
	    boolean isGreater(Node root, int data){
	        if(root==null)
	            return true;
	        if(root.key>data)
	            return true;
	        else
	            return false;
	    }
	    
	    
	    
}
