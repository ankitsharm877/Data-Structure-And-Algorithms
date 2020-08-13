package double_linked_list;

public class PrintAllData {

	public static void print(DNode head) {
		
		while(head != null) {
			System.out.print(head.data+",");
			head = head.next;
		}
		System.out.println("");
	} 
}
