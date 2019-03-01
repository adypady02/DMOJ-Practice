import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	Scanner keyboard = new Scanner(System.in);
    	
    	int n = keyboard.nextInt();
    	for(int i = 0; i < n; i++) {
    		
    		long a = 0;
    		long b = 0;
    		long c = 1;
    		
    		while(keyboard.hasNext()) {

    			a = keyboard.nextLong();
    			b = keyboard.nextLong();
        		c = keyboard.nextLong();
    		}
    		
    		
    		if(a * b == c) {
    			System.out.println("POSSIBLE DOUBLE SIGMA");
    		}
    		else {
    			System.out.println("16 BIT S/W ONLY");
    		}
    	}
    }
}