package algorithms;

public class Test {
	public static void main(String[] argss) {
	int[] weights = {1,2,4,2,5};
	int[] values = {5,3,5,3,2};
	int result = KnapsackProblem.getMaxValue(weights, values, 10);
	System.out.println(result);
	}
}
