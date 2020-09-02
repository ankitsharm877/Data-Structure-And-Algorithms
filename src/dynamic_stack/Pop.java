package dynamic_stack;

public class Pop {
	
	public static DynStack serve(DynStack s) {
		if(IsEmptyStack.check(s)) {
			System.out.println("Stack is empty");
		}else {
			--s.top;
		}
			
		return s;
	}

}
