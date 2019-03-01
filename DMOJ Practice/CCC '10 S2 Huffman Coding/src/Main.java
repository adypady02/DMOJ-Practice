import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
    	int k = keyboard.nextInt();
    	Map<String,String> code = new TreeMap<>();
    	
    	while(k > 0) {
    		String letter = keyboard.next();
    		String binary = keyboard.next();
    		code.put(binary,letter);
    		k--;
    	}
    	String decode = keyboard.next();
    	
    	String snip = "";
    	String output = "";
    	
    	for(int i = 0; i < decode.length(); i++) {
    		
    		snip += decode.charAt(i);
    		if(code.containsKey(snip)) {
    			output += code.get(snip);
    			snip = "";
    		}
    	}
    	System.out.println(output);
    	
    }
}
	//completed
		
