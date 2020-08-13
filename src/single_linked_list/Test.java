package single_linked_list;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = CreateLinkedList.create(new int[] {1,4,7,9}, 4);
		System.out.println(LinkedListLength.ListLength(node));
		
		PrintAllData.print(node);
		Node newNodeB = InsertAtBeginning.insert(node, 2);
		PrintAllData.print(newNodeB);
		
		Node newNodeE = InsertAtEnd.insert(newNodeB, 8);
		PrintAllData.print(newNodeE);
		
		Node newNodeM = InsertAtMiddle.insert(newNodeE, 3);
		PrintAllData.print(newNodeM);
		
		Node newNodeNth = InsertAtnthPosition.insert(newNodeM, 5,3);
		PrintAllData.print(newNodeNth);
		
		Node newNodeDB = DeleteFromBeginning.delete(newNodeNth);
		PrintAllData.print(newNodeDB);
		
		Node newNodeDE = DeleteFromEnd.delete(newNodeDB);
		PrintAllData.print(newNodeDE);
		
		Node newNodeDM = DeleteFromMiddle.delete(newNodeDE);
		PrintAllData.print(newNodeDM);
		
		Node newNodeDN = DeleteFromnthPosition.delete(newNodeDM,4);
		PrintAllData.print(newNodeDN);
		
	}
	
	

}
