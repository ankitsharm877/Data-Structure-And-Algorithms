package single_linked_list;

public class DeleteFromBeginning {
	
	public static Node delete(Node head) {
		
		Node temp = head.next;
		head = temp;
		temp = null;
		
		return head;
	}

}
