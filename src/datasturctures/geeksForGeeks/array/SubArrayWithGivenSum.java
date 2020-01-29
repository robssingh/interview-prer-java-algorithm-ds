package datasturctures.geeksForGeeks.array;


public class SubArrayWithGivenSum {
	/*
	 * find starting and ending index for subarray with given sum
	 * simple n square solution
	 * for each index find sum till sum matches gsum and return ans or exit if exceeds
	 * */
	static void subArray(int[] A, int gsum) {
		int n = A.length;
		int fi=0;
		int si=0;
		    for(int i=0; i<n; i++){
		    	fi = i;
		        int tsum=A[i];
	            for(int j=i+1; j<=n; j++) {
	            	if(tsum == gsum) {
	            		si = j-1;
	            		System.out.println(fi+1+" "+(si+1));
	            		return;
	            	}
	            	if(tsum>gsum) {
	            		break;
	            	}
	            	tsum = tsum+A[j];
	            }
		    }
		    System.out.println(-1);
	}
	
	/*
	 * improved solution
	 * take first index as sum--- keep adding next-- if sum matches gsum then return
	 * if exceeds remove first element from sub-array 
	 * */
	
	static void subArrayImproved(int[] A, int gsum) {
		int n = A.length;
		int fi=0;
		int si=0;
		int tsum = A[0];
		for(int i=1; i<=n; i++) {
			while(tsum>gsum && fi<i-1) {
				tsum = tsum-A[fi];
				fi++;
			}
			
			if(tsum==gsum) {
				si=i-1;
				System.out.println(fi+1+" "+(si+1));
				return;
			}

			if(i<n)
				tsum= tsum+A[i];
		}
	}
	
	/*
	 * max length subarray with given sum
	 * first loop for all elements
	 * second loop keep adding numbers i to array length
	 * if sum==gsum  update maxLen and endInd
	 * */
	
	public static int maxSubarray(int[] A, int gsum) {
		int maxLen = 0;
		int endInd = 0;
		int n = A.length;
		
		for(int i=0; i<n; i++) {
			int sum = 0;
			for(int j=i; j<n; j++) {
				sum = sum+A[j];
				if(sum==gsum) {
					int len = j-i+1;
					if(maxLen<len) {
					endInd = j;
					maxLen = len;
					}
				}
			}
		}
		
		System.out.println(maxLen+" "+endInd);
		return maxLen;
	}
	
	public static void main (String[] args) {
		//code
//		Scanner sc = new Scanner(System.in);
//		int nt = sc.nextInt();
//		while(nt-->0){
//		    int n = sc.nextInt();
//		    int gsum = sc.nextInt();
//		    int[] A = new int[n];
//		    for(int k=0; k<n; k++){
//		        A[k]=sc.nextInt();
//		    }
//		    subArray(A, gsum);
//		}
//		sc.close();
		
//		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
//		subArray(arr, 23);
//		subArrayImproved(arr, 23);
		
		int[] A = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		System.out.println(maxSubarray(A, 8));
	}
}
