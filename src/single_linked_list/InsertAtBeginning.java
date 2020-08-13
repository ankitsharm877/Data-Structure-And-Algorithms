package single_linked_list;

public class InsertAtBeginning {

	public static Node insert(Node head, int data) {
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		return head;
	}
}
