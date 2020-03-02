package datasturctures.tree;

public class MaximumPathSum {
	static int res = Integer.MIN_VALUE;

	static int maxPathSum(Node root) {
		maxPathSumRec(root);
		return res;
	}
	
	static int maxPathSumRec(Node node){
		if(node==null){
			return 0;
		}
		int l = maxPathSumRec(node.left);
		int r = maxPathSumRec(node.right);
		int maxSingle = Math.max(Math.max(l, r)+node.key, node.key);
		int maxTop = Math.max(maxSingle, l+r+node.key);
		res = Math.max(res, maxTop);
		return maxSingle;
	}
	
	public static void main(String[] args) {

	}

}
