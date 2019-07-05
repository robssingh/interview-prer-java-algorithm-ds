package datasturctures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayProblemsInterviewBit {
/* brute force to find max sub arr	 
 * for each element in outer loop--find sum for remaining elements in second loop
 * --store max sum found in another array sumArr-- return max of sumArr*/ 
	    public int maxSubArray(int[] A) {
	        int maxSum=Integer.MIN_VALUE;
	        int n = A.length;
	        int[] sumArr = new int[n];
	        
	        for(int i=0; i<n; i++){
	            int tempSum=A[i];
	            int tempSum1=A[i];
	            for(int j=i+1; j<n; j++){
	                tempSum = tempSum+A[j];
	                if(tempSum1<tempSum){
	                    tempSum1=tempSum;
	                }
	            }
	            sumArr[i]=tempSum1;
	            if(maxSum<sumArr[i]){
	                maxSum=sumArr[i];
	            }
	        }
	        System.out.println(Arrays.toString(sumArr));
	        
	        return maxSum;
	    }
	    
/*Kadane's algo to find max sum sub array*/	    
	    public int Kadane( int[] A) {
            int n=A.length;
            int maxVal=A[0];
            int[] maxArr = new int[n];
            maxArr[0] = A[0];
            
            for(int i=1; i<n; i++){
                maxArr[i] = Math.max(A[i], (A[i]+maxArr[i-1]));
                if(maxVal<maxArr[i]){
                    maxVal = maxArr[i];
                }
            }
            return maxVal;
        }
	    
/*find max sum of subarr with positve integers*/
	    public int[] maxset(int[] A) {
            int ind = 0;
            int n = A.length;
	    	long maxSum=A[0];
            long[] sumArr = new long[n];
            for(int k=0; k<n; k++){
                sumArr[k]=0;
            }
            
            long[] maxArr = new long[n];
            if(A[0]>0) {
            maxArr[0] = A[0];
            }
            for(int i=1; i<n; i++){
                if(A[i]<0) {
                    maxArr[i]=0;
                }else {
                maxArr[i] = A[i]+maxArr[i-1];
                }
                if(maxSum<=maxArr[i]){
                    maxSum = maxArr[i];
                    ind = i;
                }
            }
            System.out.println(maxSum);
            System.out.println(Arrays.toString(maxArr));
            System.out.println(ind);
            int cntr=0;
            for(int k=ind; k>=0; k--) {
            	if(A[k]>0) {
                sumArr[k]=A[k];
                };
                if(A[k]<0) {
                    break;
                }
                cntr++;
            }
            System.out.println(Arrays.toString(sumArr));
            if(cntr==0) {
            	return new int[0];
            }
            System.out.println(cntr);
            int[] finalarr = new int[cntr];
            int finalctr =0;
            for(int k=0; k<sumArr.length; k++) {
            	      if(sumArr[k]!=0) {
            	    	  finalarr[finalctr]=(int)sumArr[k];
            	    	  finalctr++;
            	      }
            }
            return finalarr;
	    }

/* 1 to n numbers.. find missing and duplicate.. only one missing and one duplicate*/
	    public int[] repeatedNumber(final int[] A) {
	        int[] sol = new int[2];
	        int n = A.length;
	        long[] tempArr = new long[n];
	        for(int j=0; j<n; j++){ tempArr[j]=0;};
//	        System.out.println(Arrays.toString(tempArr));
	        for(int i=0; i<n; i++){
	            int a = A[i];
		            if(tempArr[a-1]==0){
		            tempArr[a-1]=a;
		            }else{
		                sol[0]=a;
		            }
//		            System.out.println(a+"   "+tempArr[a-1]+"  "+tempArr[i]);
	        }
	         System.out.println(Arrays.toString(tempArr));
	        for(int k=0; k<n; k++){
	            if(tempArr[k]==0){
	                sol[1]=k+1;
	            }
	        }
	        
	        return sol;
	    }
	    
/*form largest number from given array*/
	    public String largestNumber(final int[] A) {
	    	String larNum = "";
	        int n = A.length;
	        
	        for(int k=1; k<n; k++){
	            int flag=0;
	            for(int i=0; i<n-k; i++){
	                int com = compare(A[i], A[i+1]);
	                if(com==1){
	                    int temp = A[i];
	                    A[i]=A[i+1];
	                    A[i+1]=temp;
	                    flag=1;
	                }
	                if(flag==0){
	                    break;
	                }
	            }
	        }
	        
	        for(int j=0; j<n; j++){
	            larNum = larNum +Integer.toString(A[j]);
	        }
	        return larNum;
	        
	        
	        
	    }
	    public int compare(int m, int n){
	    	int result=0;
	        String mn = Integer.toString(m) +Integer.toString(n);
	        String nm = Integer.toString(n) +Integer.toString(m);
	        int mni = Integer.parseInt(mn);
	        int nmi = Integer.parseInt(nm);
	        if(mni>nmi){result = 1;};
	        if(mni<nmi){result = -1;};
	        return result;
	    }
	    
/* min steps to cover points in 2d space*/
	    public int coverPoints(int[] A, int[] B) {
	        int n = A.length;
	        int minStep=0;
	        for(int i=1; i<n; i++){
	            int x = Math.abs(A[i]-A[i-1]);
	            int y = Math.abs(B[i]-B[i-1]);
	            if(x==0 && y!=0){
	                minStep=minStep+y;
	            }else if(y==0 && x!=0){
	                minStep=minStep+x;
	            }else if(x==y){
	                minStep=minStep+x;
	            }else{
	            	int diff=Math.abs(x-y);
	            	minStep= minStep+Math.min(x, y)+diff;
	            }
	        }
	        return minStep;
	    }

/*first missing positive integer from array  with O(n) and constant space*/
	    public int firstMissingPositive(int[] A) {
	        int n= A.length;
	        int ind=0;
	        int[] B = new int[n];
	        for(int i:B){
	            B[i]=0;
	        }
	        for(int j=0; j<n; j++){
	            if(A[j]>0 && A[j]<=n){
	                B[A[j]-1]=A[j];
	            }
	        }
	        System.out.println(Arrays.toString(B));
	        for(int k=0; k<n; k++){
	            if(B[k]==0){
	                ind = k+1;
	                break;
	            }else {
	            	ind = n+1;
	            }
	        }
	        return ind;
	    }
/*find repeating number*/ 
	    public int repeatedNumber( List<Integer> a) {
	        int val = 0;
	        int[] arr = new int[a.size()];
	        
	        Iterator<Integer> itr = a.iterator();
	        while(itr.hasNext()) {
	        	int tmp = itr.next();
	        	System.out.println(tmp);
	        	if(arr[tmp-1]==-1) {
	        		val=tmp;
	        		break;
	        	}
	        	else {
	        	arr[tmp-1]=-1;
	        	};
	        	
	        }
	        System.out.println(Arrays.toString(arr));
	        
	        return val;
	    }
	
	    /*find integer with more than n/3 occurrence*/
	    public int repeatedNumber2(final List<Integer> a) {
	    	int val = 0;
	    	double factor = a.size()/3;
	    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    	
	    	Iterator<Integer> itr = a.iterator();
	    	while(itr.hasNext()) {
	    		int tmp = itr.next();
	    		if(!map.containsKey(tmp)) {
	    			map.put(tmp, 1);
	    		}else {
	    			map.put(tmp, map.get(tmp)+1);
	    		}
	    	}
	    	for(Integer i: map.keySet()) {
	    		if(map.get(i)>factor) {
	    			val = map.get(i);
	    		}
	    	}
	    	
	    	return val;
	    }
	    
	/*noble number-- number of values greater than p equals p-- p is noble number
	 * */
	    public int nobleNumber(int[] A) {
	        Arrays.sort(A);
	        int count=0;
	        int ans=-1;
	        
	        for(int i=0; i<A.length-1; i++){
	            count=0;
	            for(int j=i+1; j<A.length; j++){
	                if( A[j]>A[i]){
	                    count++;
	                }
	            }
//	            System.out.println(A[i]+"  "+count);
	            if(A[i]==count ){
	                ans=1;
	                break;
	            }
	        }
	        
	        return ans;
	    }
	/*  max diff j-i of index where A[j]>=A[i]
	 * in two loops calculate difference of each pair and update 
	 * maximum gap value if difference is more than last value*/
	    public int maximumGap(final int[] A) {
	        
	        int max = -1;
	        int n = A.length;
	        
	        for(int i=0; i<n-1; i++){
	            for(int j=i+1; j<n; j++){
	                if(A[j]>=A[i]){
	                    int diff = j-1;
	                    System.out.println(A[i]+" "+A[j]+" "+diff+" "+max);
	                    if(max<diff){
	                        max=diff;
	                        System.out.println(max);
	                    }
	                };
	            }
	        }
	        return max;
	    }
	    
	//main() method    
	public static void main(String[] args) {
		ArrayProblemsInterviewBit sol = new ArrayProblemsInterviewBit();
//		Integer[] arr = {247, 240, 303, 9, 304, 105, 44, 204, 291, 26, 242, 2, 358, 264, 176, 289, 196, 329, 189, 102, 45, 111, 115, 339, 74, 200, 34, 201, 215, 173, 107, 141, 71, 125, 6, 241, 275, 88, 91, 58, 171, 346, 219, 238, 246, 10, 118, 163, 287, 179, 123, 348, 283, 313, 226, 324, 203, 323, 28, 251, 69, 311, 330, 316, 320, 312, 50, 157, 342, 12, 253, 180, 112, 90, 16, 288, 213, 273, 57, 243, 42, 168, 55, 144, 131, 38, 317, 194, 355, 254, 202, 351, 62, 80, 134, 321, 31, 127, 232, 67, 22, 124, 271, 231, 162, 172, 52, 228, 87, 174, 307, 36, 148, 302, 198, 24, 338, 276, 327, 150, 110, 188, 309, 354, 190, 265, 3, 108, 218, 164, 145, 285, 99, 60, 286, 103, 119, 29, 75, 212, 290, 301, 151, 17, 147, 94, 138, 272, 279, 222, 315, 116, 262, 1, 334, 41, 54, 208, 139, 332, 89, 18, 233, 268, 7, 214, 20, 46, 326, 298, 101, 47, 236, 216, 359, 161, 350, 5, 49, 122, 345, 269, 73, 76, 221, 280, 322, 149, 318, 135, 234, 82, 120, 335, 98, 274, 182, 129, 106, 248, 64, 121, 258, 113, 349, 167, 192, 356, 51, 166, 77, 297, 39, 305, 260, 14, 63, 165, 85, 224, 19, 27, 177, 344, 33, 259, 292, 100, 43, 314, 170, 97, 4, 78, 310, 61, 328, 199, 255, 159, 185, 261, 229, 11, 295, 353, 186, 325, 79, 142, 223, 211, 152, 266, 48, 347, 21, 169, 65, 140, 83, 156, 340, 56, 220, 130, 117, 143, 277, 235, 59, 205, 153, 352, 300, 114, 84, 183, 333, 230, 197, 336, 244, 195, 37, 23, 206, 86, 15, 187, 181, 308, 109, 293, 128, 66, 270, 209, 158, 32, 25, 227, 191, 35, 40, 13, 175, 146, 299, 207, 217, 281, 30, 357, 184, 133, 245, 284, 343, 53, 210, 306, 136, 132, 239, 155, 73, 193, 278, 257, 126, 331, 294, 250, 252, 263, 92, 267, 282, 72, 95, 337, 154, 319, 341, 70, 81, 68, 160, 8, 249, 96, 104, 137, 256, 93, 178, 296, 225, 237 };
//		Integer[] arr = {1, 5, 7, 3, 2, 3, 4, 6 };
		//		ans for above arr is 217
		//int[] arr = {-120};
		int[] A = {3, 5, 4, 2};  
//		int[] A = {0, 0, -1, 0 };
//		int[] A = {1, -1, -1, -1, -1};
//		int[] X = {4, 8, 7, 5, -13, 9, -7, 1}; 
//		int[] Y = {4, -15, -10, -3, -13, 12, 8, -8};
		long startTime = System.currentTimeMillis();
//		int maxsum = sol.Kadane(arr);
//		int steps = sol.coverPoints(X, Y );a
		int maxArr = sol.maximumGap(A);
		long endTime = System.currentTimeMillis();
		System.out.println(maxArr);
		System.out.println("Time elapsed : "+(endTime-startTime));
	}

}
