package practice;

/*package whatever //do not write package name here */

import java.util.*;
//import java.lang.*;
//import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nt = sc.nextInt();
		while(nt-->0){
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    for(int t=0; t<n; t++){
		        A[t]=sc.nextInt();
		    }
		HashMap<Integer, Integer> map  = new HashMap<Integer, Integer>();
		for(int i=0; i<n; i++) {
			if(map.containsKey(A[i]))
				map.put(A[i], map.get(A[i])+1);
			else
				map.put(A[i], 1);
				
		}
		
		
		
		}
		sc.close();
	}
	
	
}