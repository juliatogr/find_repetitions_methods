package find_repetitions_methods;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		String s1 = "hola";
		String s2 = "esternon";
		String s3 = "ventilador";
		String s4 = "rara";
		
		firstRepeated(s1);
		firstRepeated(s2);
		firstRepeated(s3);
		firstRepeated(s4);
		
		System.out.println();
		
		firstNotRepeated(s1);
		firstNotRepeated(s2);
		firstNotRepeated(s3);
		firstNotRepeated(s4);
	
	}
	
	public static void firstRepeated(String s) {
		
		Character c = null, comp = null;
		int length = s.length();
		boolean found = false;
		int counter = 0;
		
		while (!found && counter < length-1) {
			
			c = s.charAt(counter);
			
			int compCounter = counter+1;
			
			while (!found && compCounter < length) {
				
				comp = s.charAt(compCounter);

				if (c == comp) {
					found = true;
				}
				compCounter++;	
			}
			counter++;
			
		}
		
		if (!found) {
			System.out.println("There is no repeated character on string '" + s + "'");
		} else {
			System.out.println("The first repeated character on string '" + s + "' is '" + c +"'" );
		}
	}

	public static void firstNotRepeated(String s) {
		
		Character c = null, comp = null;
		int length = s.length();
		boolean found = false;
		int counter = 0;
		ArrayList<Character> repeateds = new ArrayList<Character>();
		
		while (!found && counter < length-1) {
			c = s.charAt(counter);
			
			boolean repeated = false;
			int num_repeateds = repeateds.size();
			int repCounter = 0;
			
			while (!repeated && repCounter < num_repeateds) {
				if (c == repeateds.get(repCounter)) {
					repeated = true;
				}
				repCounter++;
			}
			
			if (!repeated) {
				
				int compCounter = counter+1;
				
				while(!repeated && compCounter < length) {
					comp = s.charAt(compCounter);
					
					if (c == comp) {
						repeated = true;
						repeateds.add(c);
					}
					compCounter++;
				}
				if (!repeated) {
					found = true;
				}
			}

			counter++;
		}
			
		if (!found) {
			System.out.println("There is no not repeated character on string '" + s + "'");
		} else {
			System.out.println("The first not repeated character on string '" + s + "' is '" + c +"'" );
		}
	}
	

}
