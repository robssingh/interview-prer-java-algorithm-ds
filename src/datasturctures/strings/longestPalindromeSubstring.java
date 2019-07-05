package datasturctures.strings;

public class longestPalindromeSubstring {
	static String longestPalindrome(String str){
		    int n = str.length();
		    boolean[][] arr = new boolean[n][n];
		    int maxL = 1;
		    int start = 0;
		    //fill all diagonal with true
		    for(int i=0; i<n; i++){
		        arr[i][i] = true;
		    }
		    
		    //for all substring of length 2
		    for(int j=0; j<n-1; j++){
		        if(str.charAt(j)==str.charAt(j+1)){
		            arr[j][j+1] = true;
		            start = j;
		            maxL = 2;
		        }
		    }
		    
		    //for all substring of length more than 2
		    for(int k=3; k<=n; k++){
		        for(int l=0; l<n-k+1; l++){
		            int m = l+k-1;
		            if((str.charAt(l)==str.charAt(m)) && arr[l+1][m-1] ){
		                arr[l][m] = true;
		                maxL = Math.max(maxL, k);
		                start = l;
		                break;
		            }
		        }
		    }
		    System.out.println(maxL+"  "+start);
		    return str.substring(start, (start+maxL));
		}
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aaaabbaacaab"));
		
		
	}
}
