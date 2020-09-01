package circular_linked_list;

public class LinkedListLength {

	public static int ListLength(CLLNode head) {
		int length = 0;
		CLLNode startHead = head;
		if(head == null)
			return 0;
		do{
			++length;
			head = head.next;
		}while(head != startHead);
		return length;
	}
}
