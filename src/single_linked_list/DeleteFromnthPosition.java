package single_linked_list;

public class DeleteFromnthPosition {

	public static Node delete(Node head, int position) {
		Node node = head;
		Node temp = head;
		int k = 1;
		
		if(head == null) {
			return head;
		}
		while(temp != null &&  k < position) {
			node = temp;
			temp = temp.next;
			++k;
		}
		node.next = temp.next;
		temp = null;
		
		return head;
	}
}
