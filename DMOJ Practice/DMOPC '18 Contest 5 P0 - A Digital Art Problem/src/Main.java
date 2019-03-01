import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    	Scanner keyboard = new Scanner(System.in);
    	String type = keyboard.next();
    	
    	double[] rgb1 = new double[3];
    	double[] rgb2 = new double[3];
    	
    	for(int i = 0; i < 3; i++) {
    		
    		rgb1[i] = keyboard.nextDouble();
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		
    		rgb2[i] = keyboard.nextDouble();
    	}
    	
    	if(type.equals("Multiply")) {
    		
    		for(int i = 0; i < 3; i++) {
    			System.out.printf("%.6f", rgb1[i] * rgb2[i]);
    			if(i != 2) {
    				System.out.print(" ");
    			}
    		}
    	}
    	else if(type.equals("Screen")) {
    		
    		for(int i = 0; i < 3; i++) {
    			System.out.printf("%.6f", 1 - ((1 - rgb1[i]) * (1 - rgb2[i]) ));
    			if(i != 2) {
    				System.out.print(" ");
    			}
    		}
    	}
    	
    	else if(type.equals("Overlay")) {
    		
    		for(int i = 0; i < 3; i++) {
    			if(rgb1[i] < 0.5) {
	    			System.out.printf("%.6f", 2 * (rgb1[i] * rgb2[i]));
	    		}
    			else {
    				System.out.printf("%.6f", 1 - (2 * (1 - rgb1[i]) * (1-rgb2[i])));
    			}
    		}
	    		
	    }
    	System.out.println(Arrays.toString(rgb2));
    }
}