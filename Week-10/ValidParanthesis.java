package Tasks;
import java.util.Stack;
public class ValidParanthesis {

	

	

	    public static boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {

	            // If opening brackets → push
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } 
	            // If closing brackets → check
	            else {
	                if (stack.isEmpty()) {
	                    return false;
	                }

	                char top = stack.pop();

	                if ((ch == ')' && top != '(') ||
	                    (ch == '}' && top != '{') ||
	                    (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }

	        // If stack empty → valid
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String s = "()[]{}";

	        if (isValid(s)) {
	            System.out.println("Valid Parentheses");
	        } else {
	            System.out.println("Invalid Parentheses");
	        }
	    }
	}
