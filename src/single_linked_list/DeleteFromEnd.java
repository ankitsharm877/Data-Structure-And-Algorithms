package single_linked_list;

public class DeleteFromEnd {
	
	public static Node delete(Node head) {
		
		Node temp = head;
		while(temp.next.next!= null) {
			temp = temp.next;
		}
		temp.next = null;
		temp = null;		
		
		return head;
	}
}
