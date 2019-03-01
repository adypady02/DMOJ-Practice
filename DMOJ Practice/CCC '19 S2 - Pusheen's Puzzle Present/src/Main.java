import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[][] board = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++) {
                board[i][k] = keyboard.nextInt();
            }
        }
        int x = board[0][0] - 1;
        int maxDistance = 1;
        
       search: 
        for(int[] row : board) {
        	
        	int distance = 0;
        	for(int value : row) {
        		if(value == x + 1) {
        			x++;
        			if(distance > maxDistance) {
                		maxDistance = distance;
                	}
        		}
        		else {
        			distance ++;
        		}
        	}
        	
        }
        System.out.println(maxDistance);
    }
}
