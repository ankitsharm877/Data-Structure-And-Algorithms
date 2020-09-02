package stack;

public class PrintAllData {
	
	public static void print(Stack s) {
		if(IsEmptyStack.check(s)) {
			System.out.println("Stack is empty!");
		}else {
			for(int index =0; index <= s.top; index++) {
				System.out.print(s.data[index]+",");
			}
		}
		System.out.println("");
	}

}
