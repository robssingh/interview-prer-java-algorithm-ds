package datasturctures.geeksForGeeks.array;

public class MergeTwoSortedArrays {

   /*
    * Merge two sorted arrays.
    * Iterate over 2nd array from last element. For every element find the next highest number in 1st array.
    * While doing so, keep shifting elements in 1st array to the right. Last element stored in variable.
    * Put 1st array's last element in 2nd array last(current) index, and replace in 1st array.
    */
    public static void merge(int[] A, int[] B, int m, int n){
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
    
    /*
    * Merge two sorted arrays. Better Solution.
    * Take gap of n/2, keep swapping start and end elements(in inner loop) like selection sort algo.
    * Keep reducing the gap by n/2 in outer loop.
    * 
    */
    public static void mergeGap(int[] A, int[] B, int m, int n){
        
    }    

}
