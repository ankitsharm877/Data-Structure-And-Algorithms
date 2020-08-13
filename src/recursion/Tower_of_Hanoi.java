package recursion;

public class Tower_of_Hanoi {

	// Move n disks from A to C, using B as auxiliary
	public static void TowersOfHanoi(int n, char fromT, char toT, char auxT) {
		// best case
		if(n == 1) {
			System.out.println("Move disk 1 from Tower "+fromT+" to Tower "+toT);
			return;
		}
		// recursive case
		
		//Move top n-1 disks from A to B, using C as auxiliary
		TowersOfHanoi(n-1, fromT, auxT, toT);
		
		//Move remaining disks from A to C
		System.out.println("Move disk "+n+" from Tower "+fromT +" to Tower "+toT);
		
		//Move n-1 disks from B to C using A as auxiliary
		TowersOfHanoi(n-1, auxT, toT, fromT);
	}
}
