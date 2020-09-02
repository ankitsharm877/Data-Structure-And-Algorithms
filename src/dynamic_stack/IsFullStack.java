package dynamic_stack;

public class IsFullStack {
	
	public static boolean check(DynStack s) {
		return (s.top == s.capacity - 1);
	}

}
