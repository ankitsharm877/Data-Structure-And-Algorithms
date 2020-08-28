package double_linked_list;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DNode node = CreateLinkedList.create(new int[] {1,4,7,9}, 4);
		System.out.println(LinkedListLength.ListLength(node));
		PrintAllData.print(node);
		
		DNode nodeIB = InsertAtBeginning.insert(node,5);
		PrintAllData.print(nodeIB);
		
		DNode nodeIE = InsertAtEnd.insert(nodeIB,8);
		PrintAllData.print(nodeIE);
		
		DNode nodeIM = InsertAtMiddle.insert(nodeIE,6);
		PrintAllData.print(nodeIM);
		
		DNode nodeIP = InsertAtnthPosition.insert(nodeIM,2,4);
		PrintAllData.print(nodeIP);
		
		DNode nodeDB = DeleteFromBeginning.delete(nodeIP);
		PrintAllData.print(nodeDB);
		
		DNode nodeDE = DeleteFromEnd.delete(nodeDB);
		PrintAllData.print(nodeDE);
		
		DNode nodeDM = DeleteFromMiddle.delete(nodeDE);
		PrintAllData.print(nodeDM);
		
		DNode nodeDN = DeleteFromnthPosition.delete(nodeDM, 1);
		PrintAllData.print(nodeDN);
		
	
	}

}
