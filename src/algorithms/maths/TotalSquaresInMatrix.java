package maths;

public class TotalSquaresInMatrix {
	
	/*
	 * for m*m matrix-- total count is sum of square of natural numbers--m(m+1)(2m+1)/6--
	 * for m*n matrix(n>=m) add (n-m)*(--squares added for one extra row=m(m+1)/2--)
	 * so total   count = {m(m+1)(2m+1)/6 + (n-m)m(m+1)/2}   */
	
	static int totalSquares(int m, int n) {
		//assuming n>=m
		
		return m*(m+1)*(2*m+1)/6 + (n-m)*m*(m+1)/2;
	}
	
	public static void main(String[] argss) {
		int m = 4, n = 3; 
        System.out.println("Count of squares is " +  
        		totalSquares(m, n)); 
	}
	
}
