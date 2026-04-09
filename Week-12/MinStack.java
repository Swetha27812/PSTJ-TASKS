package Tasks;

import java.util.Stack;
public class MinStack {


	
	
	    private Stack<Integer> stack;
	    private Stack<Integer> minStack;

	    public MinStack() {
	        stack = new Stack<>();
	        minStack = new Stack<>();
	    }

	    public void push(int val) {
	        stack.push(val);

	        if (minStack.isEmpty() || val <= minStack.peek()) {
	            minStack.push(val);
	        }
	    }

	    public void pop() {
	        int removed = stack.pop();   // store popped value

	        if (removed == minStack.peek()) {
	            minStack.pop();
	        }
	    }

	    public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return minStack.peek();
	    }

	    public static void main(String[] args) {
	        MinStack obj = new MinStack();

	        obj.push(5);
	        obj.push(3);
	        obj.push(7);
	        obj.push(2);

	        System.out.println(obj.top());     // 2
	        System.out.println(obj.getMin());  // 2

	        obj.pop();

	        System.out.println(obj.top());     // 7
	        System.out.println(obj.getMin());  // 3
	    }
	}