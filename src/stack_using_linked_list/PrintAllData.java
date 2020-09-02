package stack_using_linked_list;

public class PrintAllData {
	
	public static void print(StackLL top) {
		while(top != null) {
			System.out.print(top.data+",");
			top = top.next;
		}
		System.out.println("");
	}

}
