
package datasturctures.geeksForGeeks;

import java.util.Arrays;

public class Test{
 
	static void doThing() {
		char count[] = new char[256];
		String s = "geeks";
		char c = s.charAt(3);
		count[c]++;
		System.out.println(count[c]);
	}
	
	void doSomethingElse() {
		System.out.println("Do something else--");
		
	}
	
	public static void main(String[] args) {
		Test.doThing();
//		Test obj = null;
//		obj.doSomethingElse();
//		Test ts = new Test();
//		int myNum = new Test().mynum();
//		System.out.println(0.8%8 == 0);
	}
}
