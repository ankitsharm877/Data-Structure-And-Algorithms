package circular_linked_list;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CLLNode node = CreateLinkedList.create(new int[] {1,4,7,9}, 4);
		System.out.println(LinkedListLength.ListLength(node));
		PrintAllData.print(node);
		
		CLLNode nodeIB = InsertAtBeginning.insert(node,5);
		PrintAllData.print(nodeIB);
		
		CLLNode nodeIE = InsertAtEnd.insert(nodeIB,6);
		PrintAllData.print(nodeIE);
		
		

	}

}
