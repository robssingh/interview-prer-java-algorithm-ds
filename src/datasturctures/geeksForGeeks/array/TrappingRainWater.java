package datasturctures.geeksForGeeks.array;

import java.util.Scanner;

public class TrappingRainWater {
	
	/*
	 * find total rain water in an array A[].. element denotes height of wall at the index
	 * water filled at index will be equal to min of (left max and right max walls)
	 * create left maximum array larr and right maximum array rarr
	 * fill larr-- first element with A[0]--then max of (previous in A or previous in larr)
	 * fill rarr-- from end--- last element A[n-1]-- then max of (next in A or net in rarr)
	 * water at each index equals min of rarr and larr minus value in A*/
	
	static void rainWater(int[] A) {
		int n = A.length;
		int[] larr = new int[n];
	    larr[0]=A[0];
	    int[] rarr = new int[n];
	    rarr[n-1]=A[n-1];
	    int total = 0;
	    for(int i=1; i<n-1; i++){
	        larr[i] = Math.max(A[i-1], larr[i-1]);
	    }
	    for(int j=n-2; j>0; j--){
	        rarr[j] = Math.max(A[j+1], rarr[j+1]);
	    }
	    for(int k=1;k<n-1; k++){
	        int water = Math.min(larr[k], rarr[k]) - A[k];
	        if(water>0){
	            total = total+water;
	        }
	    }
	    System.out.println(total);
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int nt = sc.nextInt();
		while(nt-->0){
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    for(int t=0; t<n; t++){
		        A[t]=sc.nextInt();
		    }
		    rainWater(A);
		}
		sc.close();
	}
}
