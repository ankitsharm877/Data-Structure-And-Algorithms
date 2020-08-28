package double_linked_list;

public class InsertAtMiddle {
	
	public static DNode insert(DNode head, int data){
		DNode slow_node, fast_node;
		slow_node = head;
		fast_node = head.next.next;
		while(fast_node != null && fast_node.next != null) {
			slow_node = slow_node.next;
			fast_node = fast_node.next.next;
		}
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		
		slow_node.next.prev = newNode;
		newNode.next = slow_node.next;
		slow_node.next = newNode;
		newNode.prev = slow_node;
		
		return head;
	}

}
