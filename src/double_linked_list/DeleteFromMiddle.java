package double_linked_list;

public class DeleteFromMiddle {

	public static DNode delete(DNode head) {
		DNode slow_node = head;
		DNode fast_node = head.next.next;
		while(fast_node != null && fast_node.next != null) {
			slow_node = slow_node.next;
			fast_node = fast_node.next.next;
		}
		slow_node = slow_node.next;
		slow_node.prev.next = slow_node.next;
		slow_node.next.prev = slow_node.prev;
		slow_node = null;
		fast_node = null;
		return head;
	}
}
