package practice;
import java.util.*;
//import java.lang.*;
//import java.io.*;
public class testClass {
	/*package whatever //do not write package name here */

	static boolean checkPalin(String ip) {
		ip = ip.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
		System.out.println(ip);
	    char[] arr = ip.toCharArray();
	    int len = arr.length;
	    int start = 0;
	    int end = len-1;
	    boolean flag = true;
	    while(start < end){
	        if(arr[start]!=arr[end]){
	            flag = false;
	            break;
	        }else{
	            start++;
	            end--;
	        }
	    }
	    return flag;
	}
	
public void hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
	int ta = 0;
	int tb= 0;
	int[] C = new int[2*K-1];
	int n = 2*arrive.size();
	for(int i=0; i<n; i++) {
		if(arrive.get(ta)<depart.get(tb)) {
			C[i]=arrive.get(ta);
			ta++;
		}else {
			C[i]=depart.get(tb);
			tb++;
		}
	}
	
    }


public static int isPower(int A) {
    int flag = 1;
    // System.out.println(maxPower(96, 2));
    HashMap<Integer, Integer> map = new HashMap<>();
    int poWCount = 0;
    while(A%2 == 0){
        poWCount++;
        A /= 2;
    }
    map.put(2, poWCount);
    
    for(int i=3; i<Math.sqrt(A); i+=2){
        poWCount = 0;
        while(A%i == 0){
            poWCount++;
            A /= i;
        }
        if(poWCount>0){
            map.put(i, poWCount);
        }
    }
    int commonPower = 0;
    for(Map.Entry entry:map.entrySet()){
        int power = (int)entry.getValue();
         System.out.println(entry.getKey() + " : " + entry.getValue()+" ");
        if(commonPower==0){
            commonPower = power;
        }
        if(power!=commonPower){
            flag=0;
        }
    }
    if(commonPower==1)
        flag=0;
    return flag;
}

public static void maxset(int[] A) {
    
	 int[] maxArr = new int[A.length];
     int[] maxSumArr = new int[A.length];
 int maxLen = 0;
 int maxInd = 0;
 int maxSum = 0;
 if(A[0]>=0){
     maxArr[0]=1;
     maxLen=1;
     maxSumArr[0]=A[0];
 }
 
 for(int i=1; i<A.length; i++){
     if(A[i]>=0){
         maxArr[i] = maxArr[i-1]+1;
         maxSumArr[i] = maxSumArr[i-1]+A[i];
     }else if(A[i]<0){
         maxArr[i]=0;
         maxSumArr[i]=0;
     }
     if(maxSum<=maxSumArr[i] ) {
         maxSum = maxSumArr[i];
         maxLen=maxArr[i];
         maxInd=i;
     }
 }
   System.out.println(Arrays.toString(maxArr)+"  \n"+Arrays.toString(maxSumArr)+" "+maxLen+" "+maxInd+" "+maxSum); 
  int[] result = new int[maxLen];
  for(int j=maxLen-1; j>=0; j--) {
      result[j]= A[maxInd--];
  }
     
     System.out.println(Arrays.toString(result));
     
}

 class ListNode {
	      public int val;
	    public ListNode next;
	     ListNode(int x) { val = x; next = null; }
	  }
public ListNode deleteDuplicates(ListNode A) {
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
    ListNode temp = A;
    while(temp.next!=null){
        set.add(temp.val);
        temp = temp.next;
    }
    
    Iterator<Integer> iterator = set.iterator();
    ListNode ans = null;
    while(iterator.hasNext()) {
    	ListNode node = new ListNode(iterator.next());
    	if(ans==null) {
    		ans = node;
    	}else {
    		ans.next = node;
    	}
    }
    
    return ans;
}

		public static void main (String[] args) {
//			System.out.println(isPower(1024000000));
			
			maxset(new int[] {1, 2, 5, -7, 2, 3, 5, 6, -3, 1, 4});
			maxset(new int[] {0, 0, -1, 0});
			
		}
}
