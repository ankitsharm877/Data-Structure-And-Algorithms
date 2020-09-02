package stack_using_linked_list;

public class Pop {
	
	public static StackLL serve(StackLL top) {
		if(IsEmptyStack.check(top)) {
			System.out.println("Stack is empty");
			return top;
		}else {
			StackLL temp = top;
			top = temp.next;
			temp = null;
		}
		return top;
	}

}
