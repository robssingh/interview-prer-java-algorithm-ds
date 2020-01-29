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
		sc.close();
	}
	
	public static void method(int[] A, int[] B, int m, int n){
		int[] maxArr = new int[n];
		maxArr[0] = A[0];
		int maxVal = A[0];
		for(int i=1; i<n; i++){
			maxArr[i] = Math.max(A[i], maxArr[i-1]+A[i]);
			if(maxVal<maxArr[i]){
				maxVal = maxArr[i];
			}
		}
		System.out.println(maxVal);
	}
}