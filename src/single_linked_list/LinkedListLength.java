package single_linked_list;

public class LinkedListLength {
	
	public static int ListLength(Node head) {
		int length = 0;
		while(head != null) {
			++length;
			head = head.next;
		}
		
		return length;
	}

}
