package stack;

public class IsFullStack {
	
	public static boolean check(Stack s) {
		return (s.top == s.capacity - 1);
	}

}
