package datasturctures.strings;

import java.util.Stack;

public class ParenthesisChecker {

	
	/*for being balanced-- after last opening bracket-- same closing bracket should come
	* store in a stack--insert if found opening bracket-- if found closing-- 
	* pop from stack and check if same type of opening is there
	* at any point if stack becomes empty whilst elements are remaining-- not balanced
	* if stack becomes empty after completing all brackets-- its balanced*/
	public static String method(String str) {
		   
		   if(str.length()%2 !=0 || str.charAt(0)==']' || str.charAt(0)=='}' || str.charAt(0)==')'){
			    return "not balanced";
		   }
		   
		   Stack<Character> stack = new Stack<Character>();
		   
		   for(int i=0; i<str.length(); i++) {
			   char c = str.charAt(i);
			   if(c=='[' || c=='{' ||c=='(') {
				   stack.push(c);
			   }else if(c==']' || c=='}' ||c==')') {
			       if(stack.isEmpty())
			            return "not balanced";
				   char c1 = stack.pop();
				   if(c==']' && (c1=='{' || c1=='('))
					   return "not balanced";
				   else if(c=='}' && (c1=='[' || c1=='('))
					   return "not balanced";
				   else if(c==')' && (c1=='{' || c1=='['))
					   return "not balanced";
			   }
		   }
		   if(!stack.isEmpty()) {
			   return "not balanced";
		   }
		   
		  return "balanced";
	}
	
	public static void main(String[] arg) {
		
		String s = "[()]{}{[()()]()}";
		System.out.println(method(s));
		
	}
	
}
