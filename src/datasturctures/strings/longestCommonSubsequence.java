package datasturctures.strings;


public class longestCommonSubsequence {
	
	public int lcsDynamic(char str1[],char str2[]){
	    
        int temp[][] = new int[str1.length + 1][str2.length + 1];
        int max = 0;
        String s = "";
        for(int i=1; i <= str1.length; i++){
            for(int j=1; j <= str2.length; j++){
                if(str1[i-1] == str2[j-1]) {
                    temp[i][j] = temp[i - 1][j - 1] + 1;
                    s = s+str1[i-1];
                }
                else
                {
                    temp[i][j] = Math.max(temp[i][j-1],temp[i-1][j]);
                }
                if(temp[i][j] > max){
                    max = temp[i][j];
                }
            }
        }
        System.out.println("longestCommonSubsequence---"+s);
        return max;
    
    }
	
	public static void main(String args[]){
		longestCommonSubsequence lcs = new longestCommonSubsequence();
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";
        
        int result = lcs.lcsDynamic(str1.toCharArray(), str2.toCharArray());
        System.out.print("length of lcs---"+result);
    }
}
