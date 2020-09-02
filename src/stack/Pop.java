package stack;

public class Pop {
	
	public static Stack serve(Stack s) {
		if(IsEmptyStack.check(s)) {
			System.out.println("Stack is empty");
		}else {
			--s.top;
		}
			
		return s;
	}

}
