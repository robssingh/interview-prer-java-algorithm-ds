package datasturctures.geeksForGeeks.array;


public class KthSmallestNumber {
	
	/*
	 * use selection sort for only k first loops*/
	
	static int kthSmallestElement(int[] A, int kth) {
		int n = A.length;
		
		 for(int i=0; i<kth; i++){
		        int min = i;
		        for(int j=i+1; j<n; j++){
		            if(A[j]<A[min]){
		                min=j;
		            }
		        }
		        int temp = A[min];
		        A[min] = A[i];
		        A[i] = temp;
		    }
		 
		 return A[kth-1];
	}
	public static void main (String[] args) {
		//code
		
	}
}
