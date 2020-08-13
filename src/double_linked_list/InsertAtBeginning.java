package double_linked_list;

public class InsertAtBeginning {
	
	public static DNode insert(DNode head, int data) {
		
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		if(head == null) {
			head = newNode;
			return head;
		}
		
		newNode.next = head;
		head.prev = newNode;
		
		head = newNode;
		return head;
	}

}
