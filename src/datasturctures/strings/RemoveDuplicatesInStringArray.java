package datasturctures.strings;

import java.util.*;

public class RemoveDuplicatesInStringArray {
	 public static String[] dupClean(String[] inputStrings,int n){
	        String[] result = new String[n];
	        
	        System.out.println(Arrays.toString(inputStrings));
	        for(int i=0; i<inputStrings.length; i++){
	            String str = inputStrings[i];
	            String str1 = removeDuplicate(str);
	             System.out.println(str1);
	            result[i] = str1;
	            
	        }
	        return result;
	    }
	    
	    static String removeDuplicate(String str){
	        LinkedHashSet<Character> hash = new LinkedHashSet<Character>();
	        char[] arr = str.toCharArray();
	        for(int i=0; i<arr.length; i++){
	            hash.add(arr[i]);
	        }
	        Character[] arr1 = new Character[hash.size()];
	        hash.toArray(arr1);
	        String s = "";
	        for(char c : arr1) {
	        	s+=c;
	        }
	        return s;
	    }
	    
	    public static void main(String[] args) { 
	        int n = 5;
	       // extract input string
	       String input = "myy name iss robbin singh";
	       String[] inputStrings = input.split("\\s+");
	       String[] result = dupClean(inputStrings,n);
	       // print array elements
	       for(int i=0; i<result.length;i++){
	           System.out.print(result[i] + " ");
	       }
	    } 
}
