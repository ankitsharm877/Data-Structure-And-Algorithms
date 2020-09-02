package stack;

public class CreateStack {
	
	public static Stack create() {
		Stack s = new Stack();
		s.top = -1;
		s.capacity = Stack.MAX_SIZE;
		s.data = new int[s.capacity];
		return s;
	}

}
