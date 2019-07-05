package datasturctures.geeksForGeeks.array;

import java.util.Scanner;

public class MaxSumIncreasingSubsequence {
	
	/*
	 * create one copy array msis
	 * first loop from 1 to n-1
	 * second loop--j--0 to i--- if current element is greater than j
	 * && max sum till j plus ith element is greater than msis[i]--update msis[i]
	 * iteratre through msis array find max value*/
	static void maxSumIncreasingSubsequence(int[] A) {
		int n = A.length;
		int maxsum=0;
		   int[] msis = new int[n];
		   for(int l=0; l<n; l++) {
			   msis[l]=A[l];
		   }
		    for(int i=1; i<n; i++){
		        for(int j=0; j<i; j++) {
		        	if(A[i]>A[j] && msis[i]<A[i]+msis[j]) {
		        		msis[i]=msis[j]+A[i];
		        	}
		        }
		    }
		    for(int m=0; m<n; m++) {
		    	if(maxsum<msis[m]) {
		    		maxsum=msis[m];
		    	}
		    }
		    System.out.println(maxsum);
	}
	
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int nt = sc.nextInt();
		while(nt-->0){
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    for(int k=0; k<n; k++){
		        A[k]=sc.nextInt();
		    }
		    maxSumIncreasingSubsequence(A);
		}
		sc.close();
	}
}
