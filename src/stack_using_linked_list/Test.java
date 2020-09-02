package stack_using_linked_list;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLL stack = CreateStack.create();
		stack = Push.serve(stack, 1);
		PrintAllData.print(stack);
		
		stack = Push.serve(stack, 4);
		PrintAllData.print(stack);
		DeleteStack.delete(stack);

	}

}
