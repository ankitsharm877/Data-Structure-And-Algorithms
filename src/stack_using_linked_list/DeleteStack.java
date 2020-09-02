package stack_using_linked_list;

public class DeleteStack {
	
	public static void delete(StackLL top) {
		StackLL temp = top;
		while(top != null) {
			top = top.next;
			temp = null;
		}
	}

}
