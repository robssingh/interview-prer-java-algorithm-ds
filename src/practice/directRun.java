package practice;

/*package whatever //do not write package name here */

import java.util.*;

class directRun {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int nt = sc.nextInt();
		while(nt-->0){
		    String ip = sc.nextLine();
		    ip = ip.replaceAll("[^a-zA-Z0-9]","").toUpperCase();
		    char[] arr = ip.toCharArray();
		    int len = arr.length;
		    int start = 0;
		    int end = len -1;
		    boolean flag = true;
		    while(start < end){
		        if(arr[start]!=arr[end]){
		            flag = false;
		            break;
		        }
		        start++;
		        end--;
		    }
		    if(flag==true){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
		sc.close();
	}
}