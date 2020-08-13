package double_linked_list;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DNode node = CreateLinkedList.create(new int[] {1,4,7,9}, 4);
		System.out.println(LinkedListLength.ListLength(node));
		PrintAllData.print(node);
		
		DNode nodeIB = InsertAtBeginning.insert(node,5);
		PrintAllData.print(nodeIB);
		
	
	}

}
