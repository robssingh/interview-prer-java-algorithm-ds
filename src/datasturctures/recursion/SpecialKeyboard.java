package datasturctures.recursion;

public class SpecialKeyboard {
		/*
		 * given 4 keys 'A' ctrl+a to select all
		 * ctrl+c to copy current selection
		 * ctrl+v to paste 
		 * find maximum number of As that can be printed with N keystrokes*/
	
	/*Trick--
	 * there exist a point for maximum As
	 * after which need to press ctrl+a -- then copy and continue pasting
	 * for n less than 7 total number will be n*/
	
	static int specialKeyboard(int N) {
		if(N<=6) {
			return N;
		}
		// for others find maximum out of all possibilities
		int max = 0;
		
		//let b be the point
		int b;
		for(b=N-3; b>=1; b--) {
			int curr = (N-b-1)*specialKeyboard(b);
			if(max<curr)
				max=curr;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		System.out.println(specialKeyboard(8));
	}
}
