package double_linked_list;

public class InsertAtMiddle {
	
	public static DNode insert(DNode head, int data){
		DNode temp,tempD;
		temp = head;
		tempD = head.next.next;
		while(tempD != null) {
			temp = temp.next;
			tempD = tempD.next.next;
		}
		DNode newNode = new DNode();
		newNode.data = data;
		newNode.next = null;
		newNode.prev = null;
		
		temp.next.prev = newNode;
		newNode.next = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
		
		return head;
	}

}
