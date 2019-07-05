package datasturctures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoisonousPlant {

	/*
	 * given array denoting pesticide put on each plant-- 
	 * if plant has more pesticide than its left one it dies in one day
	 * Find number of days after which no plant will die*/
	
	/*SOLUTION
	 * iterate through array and make value zero if its greater than previous value-- increase dead plant count
	 * create new array with zeroes removed and repeat the process in while loop
	 * exit when there are no dead plants in one iteration*/
	 static int poisonousPlants(int[] p) {
	        boolean flag = true;
	        int days = 0;
	        
	        while(flag){
	        	days++;
	        	int deadPlant = 0;
	        	int[] temp = new int[p.length];
	        	for(int j=0; j<p.length; j++) {
	        		temp[j] = p[j];
	        	}
	        	for(int i=1; i<temp.length; i++) {
	        		System.out.println(temp[i]+"  "+temp[i-1]);
	        		if(temp[i]>temp[i-1]) {
	        			p[i]=0;
	        			deadPlant++;
	        		}
	        	}
	        	p=removeZero(p);
	        	if(deadPlant==0) {
	        		flag=false;
	        	}
	        }
	        return days-1;
	    }
	 
	 
	 //function to remove zeroes from the array and return the remaining array
	 static int[] removeZero(int[] arr) {
		 List<Integer> list = new ArrayList<Integer>();
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]!=0) {
				 list.add(arr[i]);
			 }
		 }
		 int[] tarr = new int[list.size()];
		 for(int j=0; j<list.size(); j++) {
			 tarr[j]= list.get(j);
		 }
		 return tarr;
	 }
	 
	 public static void main(String[] args) {
		 int[] p = {3, 6, 2, 7, 5};
		 System.out.println("\nAnswer---"+poisonousPlants(p));
		 
//		 System.out.println(Arrays.toString(removeZero(new int[] {3,1,0,0,5})));
	 }
}
