package algorithm.asymptotic_notation;

public class Big_O_notation {
	
	// input = n4 + 100n2 + 50
	// output = O(n4)
	public static String serve(String input) {
		String output = "";
		
		String[] inputs = input.split(" "); 
		int pow = 1;
		if(input.indexOf("n") != -1) {
			for(int i = 0; i < inputs.length; ++i) {
				if(inputs[i].contains("n")) {
					int index = inputs[i].indexOf("n");
					if(index+1 < inputs[i].length()) {
						if(pow  < Integer.parseInt(inputs[i].charAt(index+1)+"")) {
							pow = Integer.parseInt(inputs[i].charAt(index+1)+"");
						}
					}
				}
			}
		}else {
			pow = 0;
		}
		
		if(pow != 0)
			output = "O(n" + pow + ")";
		else
			output = "O(1)";
		System.out.println(output);
		
		return output;
	}

}
