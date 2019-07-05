package datasturctures.geeksForGeeks.array;

public class LeaderInArray {
	
	/*
	 * leader is element which is larger or equal to all elements on right
	 * iterate from right-- keep track of maximum value
	 * when maximum changes print the value
	 * */
	
	static void leaderInArray(int[] A) {
		int n = A.length;
		int max = A[n-1];
		int count = 1;
		int[] arr = new int[n];
		arr[0] = max;
		    for(int i=n-2; i>=0; i--){
		        if(A[i]>=max) {
		        	max=A[i];
		        	arr[count] = max; 
		        	count++;
		        }
		    }
		for(int j=count-1; j>=0; j--) {
				System.out.print(arr[j]+" ");
		}
	}
		
	public static void main (String[] args) {
		//code
		int[] input = {5, 4, 5, 3, 7};
		   leaderInArray(input);
	
	}
}
