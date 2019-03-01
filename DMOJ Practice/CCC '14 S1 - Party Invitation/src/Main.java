import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	int amount = keyboard.nextInt();
    	int rounds = keyboard.nextInt();
    	
    	int[] invitations = new int[amount];
    	for(int i = 0; i < invitations.length; i++) {
    		invitations[i] = i + 1;
    	}
    	System.out.println(Arrays.toString(invitations));
    	
    	for(int i = 0; i < rounds; i++) {
    		
    		int x = keyboard.nextInt();
    		System.out.println("yo");
    		
    		for(int k = 0; k < invitations.length; i++) {
    			if((k+1) % x == 0) {
    				System.out.println("hi");
    				invitations[k] = 0;
    			}
    		}
    	}
    	
    	for(int item: invitations) {
    		if(item != 0) {
    			System.out.println(item);
    		}
    	}
    }
}
