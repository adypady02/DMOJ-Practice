import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		String str1 = keyboard.next();
		String str2 = keyboard.next();
		
		Map<Character,Integer> letters = new TreeMap<>();
		
		for(int i = 0; i < str1.length(); i++) {
			
			if(letters.containsKey(str1.charAt(i))) {
				
				letters.put(str1.charAt(i), letters.get(str1.charAt(i)) + 1);
			}
			else {
				letters.put(str1.charAt(i), 1);
			}
		}
				
		String output = "A";
		
		check:
		for(int i = 0; i < str2.length(); i++) {
			if(letters.containsKey(str2.charAt(i))) {
				
				if(letters.get(str2.charAt(i)) > 0) {
					letters.put(str2.charAt(i), letters.get(str2.charAt(i)) - 1);
				}
				else {
					output = "N";
					break check;
				}
			
			}
			else if((int)str2.charAt(i) != 42) {
				output ="N";
				break check;
			}
		}
		System.out.println(output);
	}
}
