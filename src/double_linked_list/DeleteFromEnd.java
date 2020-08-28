package double_linked_list;

public class DeleteFromEnd {
	
	public static DNode delete(DNode head) {
		DNode node = head;
		while(node.next != null) {
			node = node.next;
		}
		node.prev.next = null;
		node = null;
		
		return head;
	}

}
