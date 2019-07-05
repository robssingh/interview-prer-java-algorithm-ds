package datasturctures.geeksForGeeks.array;

import java.util.Scanner;

public class MissingNumberInArray {
	
	
	/*
	 * given array of size n-1 with element from 1 to n and one number missing
	 * create array tarr of size n--iterate through given array and 
	 * fill value at value index in tarr--iterate through tarr and find zero that's the answer*/
	static void findMissing(int[] A) {
		int n = A.length;
		int sol=0;
	    int[] tarr = new int[n];
	    for(int i=0; i<n-1; i++){
	        int ind = A[i]-1;
	        tarr[ind]=A[i];
	    }
	    for(int j=0; j<n; j++){
	        if(tarr[j]==0){
	            sol=j+1;
	        }
	    }
	    System.out.println(sol);
	}
	
	
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
	int nt = sc.nextInt();
	while(nt-->0){
	    int n = sc.nextInt();
	    int[] A = new int[n-1];
	    for(int k=0; k<n-1; k++){
	        A[k]=sc.nextInt();
	    }
	    findMissing(A);
	}
	sc.close();
	}
}
