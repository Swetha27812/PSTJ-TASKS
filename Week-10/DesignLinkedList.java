package Tasks;

// Node definition
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

private Node head;
private int size;

// Initialize

public class DesignLinkedList {

	

	    
	        head = null;
	        size = 0;
	    }

	    // Get value at index
	    public int get(int index) {
	        if (index < 0 || index >= size) return -1;

	        Node current = head;
	        for (int i = 0; i < index; i++) {
	            current = current.next;
	        }
	        return current.val;
	    }

	    // Add at head
	    public void addAtHead(int val) {
	        Node node = new Node(val);
	        node.next = head;
	        head = node;
	        size++;
	    }

	    // Add at tail
	    public void addAtTail(int val) {
	        Node node = new Node(val);

	        if (head == null) {
	            head = node;
	        } else {
	            Node current = head;
	            while (current.next != null) {
	                current = current.next;
	            }
	            current.next = node;
	        }
	        size++;
	    }

	    // Add at index
	    public void addAtIndex(int index, int val) {
	        if (index < 0 || index > size) return;

	        if (index == 0) {
	            addAtHead(val);
	            return;
	        }

	        Node node = new Node(val);
	        Node current = head;

	        for (int i = 0; i < index - 1; i++) {
	            current = current.next;
	        }

	        node.next = current.next;
	        current.next = node;
	        size++;
	    }

	    // Delete at index
	    public void deleteAtIndex(int index) {
	        if (index < 0 || index >= size) return;

	        if (index == 0) {
	            head = head.next;
	        } else {
	            Node current = head;
	            for (int i = 0; i < index - 1; i++) {
	                current = current.next;
	            }
	            current.next = current.next.next;
	        }
	        size--;
	    }
	}
