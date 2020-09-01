package circular_linked_list;

public class DeleteFromBeginning {
	
	public static CLLNode delete(CLLNode head) {
		CLLNode temp = head;
		if(head == null) {
			return head;
		}else {
			do {
				temp = temp.next;
			}while(temp.next != head);
			
			head = head.next;
			temp.next = head;
		}
		return head;
	}

}
