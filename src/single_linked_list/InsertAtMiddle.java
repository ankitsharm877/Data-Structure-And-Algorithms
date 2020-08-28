package single_linked_list;

public class InsertAtMiddle {
	
	public static Node insert(Node head, int data) {
		if(head != null) {
			Node node = head;
			Node nodeNext = head.next.next;
			
			while(nodeNext !=null && nodeNext.next != null) {
				node = node.next;
				nodeNext = nodeNext.next.next;
			}
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = node.next;
			node.next = newNode;
		}else {
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = null;
			head = newNode;
		}
		return head;
	}

}
