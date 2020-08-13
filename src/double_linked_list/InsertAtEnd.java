package double_linked_list;

public class InsertAtEnd {

	public static DNode insert(DNode head, int data) {
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		
		if(head == null) {
			head = newNode;
			return head;
		}
		DNode temp = head;

		while(temp.next !=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		return head;
	}
}
