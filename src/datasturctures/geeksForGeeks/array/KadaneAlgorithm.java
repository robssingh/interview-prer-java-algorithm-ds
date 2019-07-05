package datasturctures.geeksForGeeks.array;


public class KadaneAlgorithm {
	
	/*
	 * contiguous sub-array with maximum sum
	 * create new array-- start from index 1 to last
	 * till that index max sum will be max of that element or
	 * that element plus max sum till previous index
	 * */
	
	static int kadane(int[] iarr) {
		int n = iarr.length;
		int maxVal=iarr[0];
	    int[] maxArr = new int[n];
	    maxArr[0] = iarr[0];
        
        for(int i=1; i<n; i++){
            maxArr[i] = Math.max(iarr[i], iarr[i]+maxArr[i-1]);
            if(maxVal<maxArr[i]){
                maxVal = maxArr[i];
            }
        }
        return maxVal;
	}
	
	
	public static void main (String[] args) {
		//code
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		
		System.out.println(kadane(arr));
	}
}
