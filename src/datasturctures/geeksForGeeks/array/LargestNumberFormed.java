package datasturctures.geeksForGeeks.array;

import java.util.Arrays;

public class LargestNumberFormed {
/*
 * sort the array but while comparing use a function
 * comparison function-- given a and b --append in string format one by one--
 * check ab>ba-- accordingly return*/
	
	 public static String largestNumber( int[] arr) {
	    	String larNum = "";
	        int n = arr.length;
	        
	        //applying sort
	        for (int i = 0; i < n-1; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	            	if(compare(arr[j], arr[min_idx])==-1)
	            		min_idx = j;
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	        
	        System.out.println(Arrays.toString(arr));
	        for(int k=n-1; k>=0; k--){
	            larNum = larNum +Integer.toString(arr[k]);
	        }
	        return larNum;
	        
	        
	        
	    }
	 public static void main(String[] args) {
//		 int[] A = {3, 30, 35, 4, 9};
		 int[] A = {250, 74, 659, 931, 273, 545, 879, 924};
		 System.out.println(largestNumber(A));
	 }
	 //method to compare two numbers
	    public static int compare(int m, int n){
	    	int result=0;
	        String mn = Integer.toString(m) +Integer.toString(n);
	        String nm = Integer.toString(n) +Integer.toString(m);
	        int mni = Integer.parseInt(mn);
	        int nmi = Integer.parseInt(nm);
	        if(mni>nmi){result = 1;};
	        if(mni<nmi){result = -1;};
	        return result;
	    }
}
