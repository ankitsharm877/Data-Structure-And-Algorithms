package single_linked_list;

public class PrintAllData {

	public static void print(Node head) {
		
		while(head != null) {
			System.out.print(head.data+",");
			head = head.next;
		}
		System.out.println("");
	} 
}
