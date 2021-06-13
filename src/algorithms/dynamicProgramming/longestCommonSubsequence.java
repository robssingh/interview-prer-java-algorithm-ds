package algorithms.dynamicProgramming;

public class longestCommonSubsequence {
    // Dynamic Programming method to calculate longest common subsequence
    /*
     * Create dp[i][j] 2D array with i 1st string length +1 and j for 2nd String.
     * current value dp[i][j] represents result if strings are taken till ith and
     * jth length. In 2d array i and j denotes natural index of strings, but for
     * accessing value use 0 index. If current indexes are same then fill array with
     * (result without i and j values + 1). If not same then result is maximum of
     * values. 1. ith from 1st string is not taken(i-1) and 2nd string till jth.
     * 2.1st string till ith and 2nd string till j-1 th.
     * 
     */
    public int lcsDynamic(char str1[], char str2[]) {
        int DP[][] = new int[str1.length + 1][str2.length + 1];
        String result = "";
        for (int i = 1; i <= str1.length; i++) {
            for (int j = 1; j <= str2.length; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    DP[i][j] = DP[i - 1][j - 1] + 1;
                    result = result + str1[i - 1];
                } else {
                    DP[i][j] = Math.max(DP[i][j - 1], DP[i - 1][j]);
                }
            }
        }
        System.out.println("longestCommonSubsequence---" + result);
        return result.length();
    }

    public static void main(String args[]) {
        longestCommonSubsequence lcs = new longestCommonSubsequence();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        // answer is ADHR
        int result = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
        System.out.print("length of lcs---" + result);
    }
}
