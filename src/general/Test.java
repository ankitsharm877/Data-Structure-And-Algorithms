package general;


import algorithm.asymptotic_notation.Big_O_notation;
import brute_force_approach.String_Matching;
import recursion.CheckArrayIsSorted;
import recursion.Tower_of_Hanoi;

public class Test {
	
	public static void main(String[] args) {
		Big_O_notation.serve("n4 + 100n2 + 50n");
		
		Tower_of_Hanoi.TowersOfHanoi(2, 'A', 'C', 'B');
		
		System.out.println(CheckArrayIsSorted.isSorted(new int[] {1,2,3,5}, 4));
		
		System.out.println(String_Matching.match("This is hello world", "hello "));
	}

}
