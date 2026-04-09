package Tasks;
import java.util.LinkedList;
import java.util.Queue;


public class ImplementStackUsingQueues {

	
	

	    // Internal class representing the Stack logic
	    static class MyStack {
	        private Queue<Integer> queue;

	        public MyStack() {
	            queue = new LinkedList<>();
	        }

	        // Push element x to the top of the stack.
	        // Time Complexity: O(n)
	        public void push(int x) {
	            queue.add(x);
	            int size = queue.size();
	            
	            // Rotate the queue so the newest element moves to the front
	            while (size > 1) {
	                queue.add(queue.remove());
	                size--;
	            }
	        }

	        // Removes the element on the top of the stack and returns it.
	        // Time Complexity: O(1)
	        public int pop() {
	            return queue.remove();
	        }

	        // Get the top element.
	        // Time Complexity: O(1)
	        public int top() {
	            return queue.peek();
	        }

	        // Returns whether the stack is empty.
	        // Time Complexity: O(1)
	        public boolean empty() {
	            return queue.isEmpty();
	        }
	    }

	    // Main method to test the implementation in Eclipse
	    public static void main(String[] args) {
	        MyStack myStack = new MyStack();
	        
	        myStack.push(1);
	        myStack.push(2);
	        
	        System.out.println("Top element: " + myStack.top());   // Returns 2
	        System.out.println("Popped element: " + myStack.pop()); // Returns 2
	        System.out.println("Is empty: " + myStack.empty());     // Returns false
	    }
	}
