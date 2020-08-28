package double_linked_list;

public class DeleteFromnthPosition {

	public static DNode delete(DNode head, int position) {
		DNode node = head;
		int k = 1;
		 if(head == null) {
			 return head;
		 }
		 
		 if(position == 1) {
			 head = head.next;
			 head.prev = null;
		 } else {
			 while(node != null &&  k < position) {
				 k++;
				 node = node.next;
			 }
			 DNode temp = node;
			 node.prev.next = node.next;
			 node.next.prev = node.prev;
			 temp = null;
		 }
		return head;
	}
}
