package algorithms;

public class KnapsackProblem {
	static int[] weight, value;
	public static int getMaxValue(int[] wt, int[] val, int capacity) {
		weight = wt;
		value = val;
		int result=0;
		int len = wt.length;
		result = knapsack(len, capacity);
		return result;
	}
	
	//recursive method for knapsack
	static int knapsack(int n, int C) {
		int result=0;
		if(n==0 || C==0) {
			result=0;
		}else if(weight[n-1]>C) {
			result = knapsack(n-1, C);		//if weight is more that remaining capacity
		}else {
			int tmp1 = knapsack(n-1, C);		//don't consider n-1 index so call for n-1 length
			int tmp2 = knapsack(n-1, C-weight[n-1]) + value[n-1];  //include weight of n added by 
			result = Math.max(tmp1, tmp2);							//knapsack of remaining
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] w = {22, 20, 15, 30};
		int[] v = {4, 2, 3, 5};
		
		System.out.println(getMaxValue(w, v, 55));
		
	}
	
}
