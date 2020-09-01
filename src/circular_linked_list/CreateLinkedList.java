package circular_linked_list;

public class CreateLinkedList {
	
	public static CLLNode create(int arr[], int n) {
		CLLNode head = null;
		CLLNode newNode = null;
		
		for(int i = 0;i < n;i++) {
			CLLNode node = new CLLNode();
			node.data = arr[i];
			node.next = null;
			if(head == null) {
				newNode = node;
				head = newNode;
			}else {
				newNode.next = node;
				newNode = newNode.next;
			}
		}	
		newNode.next = head;
		return head;
	}

}
