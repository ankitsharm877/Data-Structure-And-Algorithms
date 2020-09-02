package dynamic_stack;

public class PrintAllData {
	
	public static void print(DynStack s) {
		if(s == null || IsEmptyStack.check(s)) {
			System.out.println("Stack is empty!");
		}else {
			for(int index =0; index <= s.top; index++) {
				System.out.print(s.data[index]+",");
			}
		}
		System.out.println("");
	}

}
