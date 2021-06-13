package datasturctures.strings;

import java.util.Arrays;

public class longestPalindromeSubstring {
	/* Method 1 -  Brute Force
	Run 3 loops. 2 for getting all sub string. 3rd loop in the substring to check if palindrome (by reversing)
	Method 2 - DP
	Form 2d Array with boolean values
	i,j element of 2d array will be true/1 if string from i to j index is palindrome
	fill diagonal elements with true since all character in itself is a palindrome
	all diagonal down elements will be false/0
	*/

	static String longestPalindrome(String str){
		    int n = str.length();
		    int[][] arr = new int[n][n];
		    int maxL = 1;
		    int start = 0;
		    //fill all diagonal with true
		    for(int i=0; i<n; i++){
		        arr[i][i] = 1;
		    }
		    
		    //for all substring of length 2
		    for(int j=0; j<n-1; j++){
		        if(str.charAt(j)==str.charAt(j+1)){
		            arr[j][j+1] = 1;
		            start = j;
		            maxL = 2;
		        }
		    }
		    
		    //for all substring of length more than 2, k is length of substring
		    for(int k=3; k<=n; k++){
				//fix a start index
		        for(int l=0; l<n-k+1; l++){
		            int m = l+k-1;		//end index
		            if((str.charAt(l)==str.charAt(m)) && arr[l+1][m-1] == 1 ){
		                arr[l][m] = 1;
		                maxL = Math.max(maxL, k);
		                start = l;
		                break;
		            }
		        }
		    }
		    System.out.println(maxL+"  "+start);
			System.out.println(Arrays.deepToString(arr).replace("],", "],\n"));
		    return str.substring(start, (start+maxL));
		}
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("annabbaacaab"));
		
		
	}
}
