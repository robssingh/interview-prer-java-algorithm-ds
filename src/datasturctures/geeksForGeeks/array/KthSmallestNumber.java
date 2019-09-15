package datasturctures.geeksForGeeks.array;


public class KthSmallestNumber {
	
	/*
	 * use selection sort for only k first loops*/
	
	static int kthSmallestElement(int[] A, int kth) {
		int n = A.length;
		
		 for(int i=0; i<kth; i++){
		        int max = i;
		        for(int j=i+1; j<n; j++){
		            if(A[j]>A[max]){
		                max=j;
		            }
		        }
		        int temp = A[max];
		        A[max] = A[i];
		        A[i] = temp;
		    }
		 
		 return A[kth-1];
	}
	public static void main (String[] args) {
		//code
		int[] arr = {3, 6, 1, 14, 23, 9, -5};
		System.out.println(kthSmallestElement(arr, 1));
	}
}
