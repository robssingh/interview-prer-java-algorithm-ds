package datasturctures.geeksForGeeks.array;

import java.util.Arrays;

public class WaveArray {
	
	/*
	 * convert integer array in the form of wave.. starting from increasing 
	 * next smaller againg next greater.. so on...*/

	static void waveArray(int[] A) {
		int n = A.length;
		boolean alternateFlag = true;  //true for decreasing false for increasing
		for(int i=0; i<n-2; i++) {
			if(alternateFlag) {
				//check for decreasing
				if(A[i+1]>A[i]) {
				int temp = A[i+1];
				A[i+1] = A[i];
				A[i] = temp;
				}
			}else {
				//check for increasing
				if(A[i+1]<A[i]) {
					int temp = A[i+1];
					A[i+1] = A[i];
					A[i] = temp;
				}
			}
			alternateFlag = !alternateFlag;
		}
		System.out.println(Arrays.toString(A));
	}
	
	
	public static void main(String [] a) {
		waveArray(new int[] {5,7,3,2,8, 11, 12, 13, 14, 20, 9, 7});
	}
	
}
