package double_linked_list;

public class DeleteFromBeginning {
	
	public static DNode delete(DNode head) {
		DNode node = head;
		
		head = node.next;
		head.prev = null;
		node = null;
		
		return head;
	}

}
