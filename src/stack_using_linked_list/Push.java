package stack_using_linked_list;

public class Push {
	
	public static StackLL serve(StackLL top, int data) {
		StackLL node = new StackLL();
		node.data = data;
		node.next = null;
		
		if(top == null)
			return node;
		else {
			node.next = top;
			top = node;
		}
		return top;
	}

}
