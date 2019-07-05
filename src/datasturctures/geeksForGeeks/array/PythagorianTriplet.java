package datasturctures.geeksForGeeks.array;

import java.util.Arrays;
import java.util.Scanner;

public class PythagorianTriplet {
	
		/*given a array check if pythagorian trip exists in it
		 * sort the array
		 * fron index n-1 to 0--- two vars left and right--- left to zero index-- right to i-1 index
		 * check pythagorian sum-- if l^2 + r^2 == i^2*/
	
		static void checkPythagorian(int[] A) {
			int n = A.length;
			 Arrays.sort(A);  
			 boolean flag = false;
				 for(int i=n-1; i>=0; i--){
				     int l=0; 
				     int r=i-1;
				     while(l<r){
				         int ls = A[l]*A[l];
				         int rs = A[r]*A[r];
				         int ns = A[i]*A[i];
				         if(ls + rs == ns){
				             flag = true;
				             break;
				         }else if(ls+rs<ns){
				             l++;
				         }else{
				             r--;
				         }
				     }
				}
			   	if(flag==true){	
			   	System.out.println("Yes");
			   	}else{
			   	System.out.println("No");
			   	};
		}
	
	
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int nt = sc.nextInt();
		while(nt-->0){
		    int n = sc.nextInt();
		    int[] A = new int[n];
		    for(int t=0; t<n; t++){
		        A[t]=sc.nextInt();
		    }
		    checkPythagorian(A);
	}
		sc.close();
	}
	
}
