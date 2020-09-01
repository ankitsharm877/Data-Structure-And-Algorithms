package circular_linked_list;

public class InsertAtBeginning {
	
	public static CLLNode insert(CLLNode head, int data) {
		CLLNode temp  = head;
		CLLNode newNode = new CLLNode();
		newNode.data = data;
		newNode.next = null;
	
		if(head == null) {
			 head = newNode;
		}else {
			do {
				temp = temp.next;
			}while(temp.next != head);
			
			newNode.next = head;
			
			temp.next = newNode;
			head = newNode;
		}
		return head;
	}

}
