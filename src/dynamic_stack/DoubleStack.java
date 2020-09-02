package dynamic_stack;

public class DoubleStack {
	
	public static DynStack doubleSize(DynStack s) {
		DynStack dynStack = new DynStack();
		dynStack.top = s.top;
		dynStack.capacity = s.capacity * 2;
		dynStack.data = new int[dynStack.capacity];
		for(int index=0; index<=s.top; ++index) {
			dynStack.data[index] = s.data[index];
		}
		return dynStack;
	}

}
