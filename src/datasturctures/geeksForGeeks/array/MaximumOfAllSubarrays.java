package datasturctures.geeksForGeeks.array;

import java.util.Scanner;

public class MaximumOfAllSubarrays {
	
	/*
	 * find maximum element of all contiguous subarrays of size k
	 * first loop n-k+1 times---find max for k elements in second loop
	 * update new array (of size n-k+1) index with max value 
	 * */
	
	static void maxOfSubarray(int[] A, int k) {
		int n = A.length;
		int[] sol= new int[n-k+1];
	    for(int i=0; i<n-k+1; i++){
	        int max = A[i];
	        for(int j=0; j<i+k; j++){
	            if(max<A[j]){
	                max = A[j];
	            }
	        }
	        sol[i]=max;
	    }
	    for(int l=0; l<sol.length; l++){
	        System.out.print(sol[l]+" ");
	    }
	    System.out.println("");
	}
	
	
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int nt = sc.nextInt();
		while(nt-->0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] A = new int[n];
		    for(int t=0; t<n; t++){
		        A[t]=sc.nextInt();
		    }
		    maxOfSubarray(A, k);
		}
		sc.close();
	}

}
