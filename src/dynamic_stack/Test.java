package dynamic_stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynStack stack = CreateStack.create();
		PrintAllData.print(Push.serve(stack, 4));
		PrintAllData.print(Push.serve(stack, 3));
		PrintAllData.print(Push.serve(stack, 1));
		PrintAllData.print(Push.serve(stack, 8));
		PrintAllData.print(Push.serve(stack, 5));
		PrintAllData.print(Push.serve(stack, 6));
		PrintAllData.print(Push.serve(stack, 8));
		PrintAllData.print(Push.serve(stack, 9));
		PrintAllData.print(Push.serve(stack, 10));
		PrintAllData.print(Push.serve(stack, 11));
		Push.serve(stack, 12);
		DynStack stackD = DoubleStack.doubleSize(stack);
		PrintAllData.print(Push.serve(stackD, 12));
		PrintAllData.print(Push.serve(stackD, 13));
		PrintAllData.print(Push.serve(stackD, 14));
		PrintAllData.print(Pop.serve(stackD));
		DeleteStack.delete(stackD);

	}

}
