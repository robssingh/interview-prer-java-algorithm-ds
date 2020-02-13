package practice;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int nt=sc.nextInt();
		while(nt>0){
		    int m=sc.nextInt();
		    int n=sc.nextInt();
		    int[]A=new int[m];
		    int[]B=new int[n];
		    for(int i=0;i<m;i++)
		        A[i]=sc.nextInt();
		    for(int j=0;j<n;j++)
		        B[j]=sc.nextInt();
		    method(A, B, m, n);
		    nt--;
		}
		// sc.close();
	}
	
	public static void method(int[] A, int[] B, int m, int n){
		for(int i=n-1; i>=0; i--){
			int lastA = A[m-1];
			int j;
			for(j=m-2; j>=0 && A[j]>B[i]; j--){
				A[j+1]=A[j];
			}
			if(j!=m-2 || lastA>B[i]){
				A[j+1]=B[i];
				B[i]=lastA;
			}
		}
		System.out.println();
		for(int k=0; k<m; k++){
			System.out.print(A[k]+" ");
		}
		for(int k=0; k<n; k++){
			System.out.print(B[k]+" ");
		}
		System.out.println();
	}
}