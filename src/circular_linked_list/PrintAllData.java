package circular_linked_list;

public class PrintAllData {

	public static void print(CLLNode head) {
		CLLNode temp = head;
		do{
			System.out.print(temp.data+",");
			temp = temp.next;
		}while(head != temp);
		System.out.println("");
	} 
}
