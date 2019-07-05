package algorithms;

import java.util.Arrays;

public class FloodFill {
	static int[][] ffarr = {{1, 1, 1, 1, 1, 1, 1, 1},
				            {1, 1, 1, 1, 1, 1, 0, 0},
				            {1, 0, 0, 1, 1, 0, 1, 1},
				            {1, 2, 2, 2, 2, 0, 1, 0},
				            {1, 1, 1, 2, 2, 0, 1, 0},
				            {1, 1, 1, 2, 2, 2, 2, 0},
				            {1, 1, 1, 1, 1, 2, 1, 1},
				            {1, 1, 1, 1, 1, 2, 2, 1},
				            };
	static int fCol=8;
	
	public void floodFillAlgo( int x, int y) {
		x--; y--;
		int curr = ffarr[x][y];
		rec(x, y, curr);
	}
	
	
/*recursive function	
 * make recursive call in four directions
 * change value if matches current value
 * return if not matches to current value
  */
	public void rec(int x, int y, int curr ) {
		if(x>=0 && y>=0 && x<8 && y<8) {
		if(ffarr[x][y] != curr){
			return;
		}
		if(ffarr[x][y] == curr) {
			ffarr[x][y] = fCol;
		}
		rec(x+1, y, curr);
		rec(x-1, y, curr);
		rec(x, y+1, curr);
		rec(x, y-1, curr);
		}
	}

	
//main method	
	public static void main(String[] args) {
		
		System.out.println(Arrays.deepToString(ffarr).replace("], ", "]\n"));
		FloodFill ff = new FloodFill();
		ff.floodFillAlgo( 1, 1);
		System.out.println("\n\nReplacing value with "+fCol+"\n");
		System.out.println(Arrays.deepToString(ffarr).replace("], ", "]\n"));
	}
}
