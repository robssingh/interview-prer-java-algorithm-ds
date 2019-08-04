package algorithms;

public class KnapsackProblem {
	
	/*
	 * Given set of objects with weights and values
	 * Container with fixed capacity
	 * Find maximum value achievable
	 * Object can either be taken or not taken, partial not allowed
	 * */
	
	static int[] weight, value;
	
	
	//recursive method for knapsack
	static int knapsack(int c) {
		return knapsackRec(weight.length, c);
	}
	
	static int knapsackRec(int n, int C) {
		int result=0;
		if(n==0 || C==0) {
			result=0;
		}else if(weight[n-1]>C) {
			result = knapsackRec(n-1, C);		//if item weight is more that remaining capacity
		}else {
			int tmp1 = knapsackRec(n-1, C);		//don't consider n-1 index(nth) item so call for n-1 length
			int tmp2 = knapsackRec(n-1, C-weight[n-1]) + value[n-1];  //include value of nth item added by 
			result = Math.max(tmp1, tmp2);							  //knapsack of remaining
		}
		return result;
	}
	
	
	//dynamic programming method
	static int knapsackDP(int c) {
		int dp[][] = new int[value.length+1][c+1];
		for(int i=1; i<value.length+1; i++) {
			for(int j=1; j<c+1; j++) {
				if(j<weight[i-1]) {
					dp[i][j] = dp[i-1][j];
				}else {
					dp[i][j] = Math.max(
										value[i-1]+dp[i-1][j-weight[i-1]], 
										dp[i-1][j]  
										);
				}
			}
		}
		return dp[value.length][c];
	}
	
	
	public static void main(String[] args) {
		weight = new int[]{22, 20, 15, 30};
		value = new int[]{4, 2, 3, 5};
		
		System.out.println(knapsackDP(55));
		System.out.println(knapsack(55));
		
	}
	
}
