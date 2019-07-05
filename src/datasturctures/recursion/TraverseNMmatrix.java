package datasturctures.recursion;

public class TraverseNMmatrix {

	/*
	 * number of ways to travel n cross m matrix
	 * can go right or down
	 * travel from top left to bottom right corner
	 * one unit at a time*/
	
	static int traverseMatrix(int row, int column) {
		if(row==1 || column==1) {
			return 1;
		}
		
		return traverseMatrix(row-1, column)+traverseMatrix(row, column-1);
		
	}
	
	public static void main(String args[]) {
		
		System.out.println(traverseMatrix(4, 6));
		System.out.println(traverseMatrix(2, 2));
	}
}
