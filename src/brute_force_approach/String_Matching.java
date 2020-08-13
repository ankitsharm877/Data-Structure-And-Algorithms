package brute_force_approach;

public class String_Matching {
	
	public static int match(String input, String pattern) {
		int m, n;
		n = input.length();
		m = pattern.length();
		
		for(int i = 0; i < n - m; ++i) {
			if(pattern.equals(input.substring(i,i+m))) {
				return (i);
			}
		}
		return (-1);
	}

}
