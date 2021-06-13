package algorithms;

import java.util.Arrays;

public class PascalTriangle {
	/*
	 * Pascal's triangle every entry is sum of above 2 values, top element starts
	 * with 1 and in each row end elements are also 1 Solution: Create 2D array fill
	 * first and last element with 1 remaining will be sum of curret and previous
	 * index in last row
	 */
	static void printPascal(int n) {

		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i || j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
		System.out.println(Arrays.deepToString(arr).replace("],", "\n"));
	}

	public static void main(String[] args) {

		// printPascal(5);
		int i;
		for (i = 1; i < 5; ++i) {
			System.out.println(i);
		}
		System.out.println(i);
	}

}
