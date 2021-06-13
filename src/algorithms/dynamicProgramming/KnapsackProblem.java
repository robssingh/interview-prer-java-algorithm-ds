package algorithms.dynamicProgramming;

public class KnapsackProblem {

	/*
	 * Given set of objects with weights and values Container with fixed capacity
	 * Find maximum value achievable Object can either be taken or not taken,
	 * partial not allowed(called as 0/1 Knapsack problem)
	 */

	static int[] weight, value;

	// RECURSIVE method for knapsack
	/*
	 * Start from last item, either the item is included in result or not. Recursive
	 * call to check both cases. Math.max gives result. Exit condition: When last
	 * item is reached(n=0) or capacity is zero(fully reached). Extra condition: If
	 * item weight is more than capacity, start checking from next item onwards.
	 */
	static int knapsack(int c) {
		return knapsackRec(weight.length, c);
	}

	static int knapsackRec(int n, int c) {
		int result = 0;
		if (n == 0 || c == 0) {
			result = 0;
		} else if (weight[n - 1] > c) {
			// if item weight is more that remaining capacity
			result = knapsackRec(n - 1, c);
		} else {
			// don't consider n-1 index(nth) item so call for n-1 length
			int tmp1 = knapsackRec(n - 1, c);
			// include value of nth item added by knapsack of remaining
			int tmp2 = knapsackRec(n - 1, c - weight[n - 1]) + value[n - 1];
			result = Math.max(tmp1, tmp2);
		}
		return result;
	}

	// DP- dynamic programming method
	/*
	 * i*j matrix with i for weight(length of given array+1) and j for
	 * capacity(length equal to capacity+1) dp[i][j] = knapsack result for weiths
	 * till ith index and capacity of j its calculated by Math.max of 1. if ith item
	 * is included, its value value[i-1] + already calculated value of remaining
	 * weight (j- weight[i-1]) and items so far covered without current one(i-1). 2.
	 * current item is not included. Already calculated value in matrix with
	 * capcaity j and items till i-1 Answer is last calculated result with all
	 * items(length of given items array) and complete weight(c) i and j are real
	 * number indexes for weight and capacity respectively(created by us this way
	 * for ease and dealing with edge case with 0 values for no items no capacity) .
	 * i-1 index for value array is taken since its 0 based index (given that way).
	 */
	static int knapsackDP(int c) {
		int dp[][] = new int[value.length + 1][c + 1];
		for (int i = 1; i < value.length + 1; i++) {
			for (int j = 1; j < c + 1; j++) {
				if (j < weight[i - 1]) {
					dp[i][j] = dp[i - 1][j];
				} else {
					dp[i][j] = Math.max(value[i - 1] + dp[i - 1][j - weight[i - 1]], dp[i - 1][j]);
				}
			}
		}
		return dp[value.length][c];
	}

	public static void main(String[] args) {
		weight = new int[] { 22, 20, 15, 30 };
		value = new int[] { 4, 2, 3, 5 };

		System.out.println(knapsackDP(55));
		System.out.println(knapsack(55));

	}

}
