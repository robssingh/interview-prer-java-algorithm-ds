package algorithms.dynamicProgramming;

public class SubsetSumProblem {
    /*
     * Given an array of non negative numbers and a totalSum, is there subset of
     * numbers in this array which adds up to given totalSum.
     */
    static boolean subsetSum(int[] input, int sum) {
        boolean DP[][] = new boolean[input.length + 1][sum + 1];

        for (int i = 0; i <= input.length; i++) {
            DP[i][0] = true;
        }

        for (int i = 1; i <= input.length; i++) {
            for (int j = 1; j <= sum; j++) {
                // If current number is lower than sum in question, it can be in included in
                // result
                if (j - input[i - 1] >= 0) {
                    DP[i][j] = DP[i - 1][j] || DP[i - 1][j - input[i - 1]];
                } else {
                    // if its greater than current sum in question, it can not be included
                    DP[i][j] = DP[i - 1][j];
                }
            }
        }

        return DP[input.length][sum];
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 3, 7, 8 };
        System.out.print(subsetSum(arr1, 12));
    }
}
