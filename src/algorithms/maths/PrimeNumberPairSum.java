package maths;


public class PrimeNumberPairSum {
	
	
	/* Goldback's conjecture 
	 * any even number greater than 3 can be sum of tow distinct prime numbers
	 * Find the first pair of those two numbers*/
	 public static void primesum(int A) {
	        boolean[] prime = new boolean[A+1];
	        prime[0]=true;
	        prime[1]=true;
	        //false will be prime
	        for(int i=2; i*i<=A; i++){
	            if(prime[i]==false){
	                for(int j=i*2; j<=A; j=j+i){
	                    prime[j]=true;
	                }
	            }
	        }
	        
	        for(int k=0; k<A; k++){
	            if(prime[k]==false && prime[A-k]==false ){
	            	System.out.println(k+"  "+(A-k));
	                break;
	            }
	            
	        }
	    }
	 
	 
	 public static void main(String[] a) {
		 
		 primesum(84);
	 }
}
