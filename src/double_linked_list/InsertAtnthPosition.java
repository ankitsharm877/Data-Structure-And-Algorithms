package double_linked_list;

public class InsertAtnthPosition {

	public static DNode insert(DNode head, int data, int position) {
		DNode temp = head;
		DNode temp2 = head;
		int k = 1;
		
		if(head == null) {
			return head;
		}
		
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		
		if(position == 1) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}else {
			while(temp != null && k < position) {
				k++;
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = newNode;
			newNode.next = temp;
			newNode.prev = temp2;
			temp.prev = newNode;
		}
		return head;
	}
}
