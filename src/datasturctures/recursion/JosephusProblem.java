package datasturctures.recursion;

public class JosephusProblem {

	
	/*
	 * n person in circle-- after every k one person is killed
	 * find position where if sat will remain last one surviving
	 * 
	 * call recursively to find position
	 * in every pass one person reduces*/
	
	static int josephus(int n, int k) {
		//base condition when one person is remaining
		if(n==1) {
			return 1;
		}
		//adjustment done to recursive call to adjust for new position
		return (josephus(n-1, k)+k-1)%n+1;
	}
	
	
	public static void main(String[] a) {
		
		System.out.println(josephus(5, 3));
	}
}
