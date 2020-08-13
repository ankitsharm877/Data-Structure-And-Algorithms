package single_linked_list;

public class CreateLinkedList {
	
	public static Node create(int arr[],int n) {
		Node head = null;
		Node newNode = null;
		for(int i = 0; i < n ;++i) {
			if(head == null) {
				Node node = new Node();
				node.data = arr[i];
				node.next = null;
				head = node;
				newNode = head;
			}else {
				Node node = new Node();
				node.data = arr[i];
				node.next = null;
				newNode.next = node;
				newNode = newNode.next;
			}
		}
		return head;
	}

}
