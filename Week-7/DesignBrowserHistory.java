package Tasks;

public class DesignBrowserHistory {

	
	    
	    // Node structure for our doubly linked list
	    class Node {
	        String url;
	        Node prev, next;
	        
	        Node(String url) {
	            this.url = url;
	        }
	    }

	    private Node current;

	    public DesignBrowserHistory(String homepage) {
	        // Initialize the history with the homepage
	        current = new Node(homepage);
	    }
	    
	    public void visit(String url) {
	        // Create a new node and link it to the current one
	        Node newNode = new Node(url);
	        current.next = newNode;
	        newNode.prev = current;
	        
	        // Move current to the new page and clear forward history
	        current = newNode;
	    }
	    
	    public String back(int steps) {
	        // Move backward until we hit the start or finish steps
	        while (steps > 0 && current.prev != null) {
	            current = current.prev;
	            steps--;
	        }
	        return current.url;
	    }
	    
	    public String forward(int steps) {
	        // Move forward until we hit the end or finish steps
	        while (steps > 0 && current.next != null) {
	            current = current.next;
	            steps--;
	        }
	        return current.url;
	    }
	}
