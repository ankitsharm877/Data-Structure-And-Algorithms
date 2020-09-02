package stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = CreateStack.create();
		PrintAllData.print(Push.serve(stack, 4));
		PrintAllData.print(Push.serve(stack, 3));
		PrintAllData.print(Push.serve(stack, 1));
		PrintAllData.print(Push.serve(stack, 8));
		PrintAllData.print(Pop.serve(stack));
		DeleteStack.delete(stack);

	}

}
