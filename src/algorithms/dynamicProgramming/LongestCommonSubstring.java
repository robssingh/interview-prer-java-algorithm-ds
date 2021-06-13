package algorithms.dynamicProgramming;

public class LongestCommonSubstring {

    /*
     * Create dp[i][j] 2D array with i 1st string length +1 and j for 2nd String.
     * current value dp[i][j] represents result if strings are taken till ith and
     * jth length. If str1[i] and str2[j] are same. result will be 1+ remaining
     * substrings till i-1 and j-1.
     */
    public int longestCommonSubstring(char str1[], char str2[]) {
        int T[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        int ind = 0;
        for (int i = 1; i <= str1.length; i++) {
            for (int j = 1; j <= str2.length; j++) {
                if (str1[i - 1] == str2[j - 1]) {
                    T[i][j] = T[i - 1][j - 1] + 1;
                    if (max < T[i][j]) {
                        max = T[i][j];
                        ind = i;
                    }
                }
            }
        }
        System.out.println(String.valueOf(str1).substring((ind - max), (ind)));
        return max;
    }

    public static void main(String args[]) {
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        char str1[] = "abcdef".toCharArray();
        char str2[] = "zcdemf".toCharArray();

        System.out.println("length of lcs---" + lcs.longestCommonSubstring(str1, str2));
    }

}
