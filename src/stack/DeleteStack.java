package stack;

public class DeleteStack {

	public static void delete(Stack s) {
		s.top = -1;
		s.capacity = 0;
		s.data = null;
	}
}
