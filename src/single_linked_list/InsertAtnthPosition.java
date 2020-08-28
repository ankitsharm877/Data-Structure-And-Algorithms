package single_linked_list;

public class InsertAtnthPosition {
	
	public static Node insert(Node head, int data, int position) {
		Node node = head;
		Node node2 = head;
		int k = 1;
		
		Node newNode  = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null) {
			return head;
		}else {
			while(node != null && k < position) {
				++k;
				node2 = node;
				node = node.next;
			}
			node2.next = newNode;
			newNode.next = node;
			
		}
		return head;
	}

}
