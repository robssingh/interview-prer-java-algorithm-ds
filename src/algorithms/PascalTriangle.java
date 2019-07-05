package algorithms;

import java.util.Arrays;

public class PascalTriangle {

	static void printPascal(int n) {
		
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				//first and last will be 1
				if(j==i || j==0) {
					arr[i][j] = 1;
				}else {
//					remaining will be sum of previous index and current in previous line
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(arr).replaceAll("],", "\n"));
	}
	
	public static void main(String[] args) {
		
		printPascal(5);
	}
	
}
