package datasturctures.tree;

public class LeftViewOfTree {

	
	/*---<2> Print left view----
	 * store level traversed as maxlevel-- keep increasing for every next level
	 * first call left element in recursive call-- then right recursive call
	 * will print only if level is found for first time with below logic*/
			
		static int maxLevel = 0;
		    
		public void printLeftView(Node root) {
			printLeftRec(root, 1);
		}
		
		void  printLeftRec(Node root, int level) {
			if(root==null)
				return;
			if(maxLevel<level) {
				System.out.println(root.key+" ");
				maxLevel=level;
			}
			printLeftRec(root.left, level+1);
			printLeftRec(root.right, level+1);
		}
		
		
		
}
