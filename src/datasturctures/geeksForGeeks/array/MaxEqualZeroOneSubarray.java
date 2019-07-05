package datasturctures.geeksForGeeks.array;

import java.util.HashMap;

public class MaxEqualZeroOneSubarray {
	 static void maxLen(int arr[], int n)  {
		 HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		 int i, sum =0, maxlen=0, endingindex=0, difference =0, max=0, min=0, equalflag=0;
		 for(i=0; i<n; i++)
		 {
			 if(arr[i] == 0)
				arr[i] = -1;
			 else 
				 arr[i] = 1;
		 }
		 for(i=0; i<n; i++)
			{
				sum = sum + arr[i];
				if (hs.containsKey(sum))
				{
					max = i;
					min = i-1;
					difference = max-min;
					
//				if(difference>maxlen) {
//					max = i;
//				
//				}
				
				
				min = hs.get(sum) + 1;
				}
				else {
					hs.put(sum, i);
				}
				
			}
		 System.out.println("min"+min+ "max"+max);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,0,0,1,1,1,0,1,0,1,0,1,0};
        int n = arr.length; 
  
        maxLen(arr, n); 
	}
}
