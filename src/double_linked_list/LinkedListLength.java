package double_linked_list;

public class LinkedListLength {

	public static int ListLength(DNode head) {
		int length = 0;
		while(head != null) {
			++length;
			head = head.next;
		}
		
		return length;
	}
}
