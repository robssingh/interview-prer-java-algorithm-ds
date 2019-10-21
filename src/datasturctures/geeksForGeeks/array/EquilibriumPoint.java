package datasturctures.geeksForGeeks.array;


public class EquilibriumPoint {
	
	/*
	 * find index where the left and right sum is equal
	 * calculate array sum--iterate over from index 1
	 * left sum plus previous index
	 * right sum = total sum - left sum - current element*/
	
	static int equilibriumPoint(int[] A) {
		int sum = 0;
		int n = A.length;
	    for(int k=0; k<n; k++){
	        sum = sum+A[k];
	    }
	    int lsum=0;
	    
	    for (int i = 0; i < n; i++) { 
            sum = sum - A[i];
            if (lsum == sum) 
                return i; 
            lsum = lsum + A[i]; 
        } 
	    
	    return -1;
	}
	
	public static void main (String[] args) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		
		System.out.println(equilibriumPoint(arr));
		
	}
}
