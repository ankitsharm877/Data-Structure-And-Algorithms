package dynamic_stack;

public class CreateStack {
	
	public static DynStack create() {
		DynStack s = new DynStack();
		s.top = -1;
		s.capacity = DynStack.MAX_SIZE;
		s.data = new int[s.capacity];
		return s;
	}

}
