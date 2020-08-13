package single_linked_list;

public class InsertAtEnd {
	
	public static Node insert(Node head, int data) {
		Node node = head;
		while(node.next != null) {
			node = node.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		node.next = newNode;
		
		return head;
	}

}
