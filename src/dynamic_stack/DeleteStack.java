package dynamic_stack;

public class DeleteStack {

	public static void delete(DynStack s) {
		s.top = -1;
		s.capacity = 0;
		s.data = null;
	}
}
