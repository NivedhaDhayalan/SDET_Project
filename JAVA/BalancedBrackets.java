package javaprograms;
import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter input value--->");
		String brackets = input.nextLine();
        // Function call
        if (brace(brackets)) {
            System.out.println("Balanced ");
	    } else {
            System.out.println("Not Balanced "); 
        }
    }
		
		// method 
		public static boolean brace(String brackets) {  // {,[,(,},],}
		
		 Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<brackets.length();i++) { 
	        char braces = brackets.charAt(i);
	        if(braces == '{' || braces == '[' ||  braces == '(' ) {                 
		       stack.push(braces);   // (,[,{
	           continue;
	        } 
	        else if(braces == ']') {
	            if(stack.pop() != '[') {   //       }
	                return false;
	            }
	        } else if(braces == ')') {
	            if(stack.pop() != '(') {  // (       ],}
	                return false;
	            }           
	        } else if(braces == '}') {
	            if( stack.pop() != '{') {   // (   
	                return false;
	            }
	        }

          }
         return stack.isEmpty();
          
      }
}
	