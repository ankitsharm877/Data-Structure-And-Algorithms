package double_linked_list;

public class CreateLinkedList {
	
	public static DNode create(int arr[],int n) {
		DNode head = null;
		DNode newNode = null;
		for(int i = 0; i < n ;++i) {
			if(head == null) {
				DNode node = new DNode();
				node.data = arr[i];
				node.next = null;
				node.prev = null;
				head = node;
				newNode = head;
			}else {
				DNode node = new DNode();
				node.data = arr[i];
				node.next = null;
				node.prev = null;
				newNode.next = node;
				node.prev = newNode;
				newNode = newNode.next;
			}
		}
		return head;
	}

}
