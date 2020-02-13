package datasturctures.strings;

public class FormPalindrome {
	/*
	 * find minimum number of characters to be inserted to change the string to palindrome
	 * --Recursive Solution--
	 * write base cases properly as below
	 * pass string , first index fi and last index li
	 * */
	
	static int formPalindrome(String s, int fi, int li) {
		//this will apply in last stack when both indexes merge
		if(fi==li)
			return 0;	
		//this will apply when two characters r remaining
		if(fi==li-1) {		//eg ab -- solution -> bab or aba
			if(s.charAt(fi)==s.charAt(li))
				return 0;
			else
				return 1;
		}
		//if chars at indexes are equal check for remaining string
		if(s.charAt(fi)==s.charAt(li)) {
			return formPalindrome(s, fi+1, li-1);
		}else {
			//else min of (either keep right index or keep left index). +1 because add
			return Math.min(formPalindrome(s, fi+1, li), formPalindrome(s, fi, li-1))+1;
		}
		
	}
	
	
	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(formPalindrome(s, 0, s.length()-1));
		
	}
	
}
