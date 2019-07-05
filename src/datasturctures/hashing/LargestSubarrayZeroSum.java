package datasturctures.hashing;

import java.util.HashMap;

public class LargestSubarrayZeroSum {

	/*
	 * Use hashmap-- add sum for each index store in map as key and index as value
	 * if sum is seen before-- that means after the sum all elements add to zero*/
	static void subArray(int[] A) {
		int maxLen = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		int sum = 0;
		for(int i=0; i<A.length; i++) {
			sum += A[i];
			
			if(map.get(sum)!=null) {
				maxLen = Math.max(maxLen, i-map.get(sum));
			}else {
				map.put(sum, i);
			}
		}
		
		System.out.println(maxLen);
	}
	
	
	public static void main(String[] a) {
		subArray(new int[] {15,  -2,  2,  -8,  1 , 7 , 10 ,23});
		subArray(new int[] {1, -1, 1, 1, -1, -1, -1, -1});
	}
	
}
