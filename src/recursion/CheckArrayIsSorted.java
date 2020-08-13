package recursion;

//T.C = O(n), S.C = O(n)
public class CheckArrayIsSorted {
	
	public static int isSorted(int A[],int n) {
		//best case
		if(n == 1)
			return 1;
		//recursive case
		return (A[n-1] < A[n-2])? 0 : isSorted(A, n-1);
			
	}

}
