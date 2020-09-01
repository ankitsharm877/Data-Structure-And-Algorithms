package circular_linked_list;

public class DeleteFromEnd {
	
	public static CLLNode delete(CLLNode head) {
		CLLNode temp = head, temp1 = head;
		if(head == null) {
			return head;
		}else {
			do {
				temp1 = temp;
				temp = temp.next;
			}while(temp.next != head);
			
			temp1.next = head;
			temp = null;
		}
		return head;
	}

}
