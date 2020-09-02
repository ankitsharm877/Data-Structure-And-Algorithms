package dynamic_stack;

public class Push {
	
	public static DynStack serve(DynStack s, int data) {
		if(IsFullStack.check(s)) {
			System.out.println("Stack is full");
			return s;
		}else {
			s.data[++s.top] = data;
		}
		return s;
	}

}
