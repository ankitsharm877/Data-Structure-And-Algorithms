package single_linked_list;

public class DeleteFromMiddle {

	public static Node delete(Node head) {
		
		Node temp = head;
		Node node = head;
		Node node2 = head.next.next;
		
		while(node2!= null) {
			node = node.next;
			node2 = node2.next.next;
		}
		temp = node.next;
		node.next = temp.next;
		temp = null;
		
		return head;
	}
}
