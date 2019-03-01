import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
    	 Scanner keyboard = new Scanner(System.in);
         int x = keyboard.nextInt();
         int y = keyboard.nextInt();
         int amount = Math.abs(y - x) + 1;
         int spiralDimensions = (int) Math.ceil(Math.sqrt(amount));
         int spiral [][] = new int[spiralDimensions] [spiralDimensions];
         int center = 0;
         
         if(spiralDimensions % 2 == 0) {
         	center = (spiralDimensions / 2) - 1;
         }
         else {
         	center = spiralDimensions / 2;
         }
         
         spiral [center] [center] = x;
         x++;
         spiral [center + 1] [center] = x;
         x++;
         int lastX = center;
         int lastY = center + 1;
         String direction = "R";
         
         for(int i = 2; i < amount; i++) {
         	
         	if(direction.equals("R")) {
         		if(lastX + 1 < spiral.length) {
         			
         			if(spiral [lastY] [lastX + 1] == 0) {
	         			if(x <= y) {
	         				spiral [lastY] [lastX + 1] = x;
	         				x++;
	         			}
	         			lastX += 1;
         			}
         		}
         		else {
         			direction = "U";
         			i --;
         		}
         	}
         	if(direction.equals("U")) {
         		if(lastY - 1 >= 0) { 
         			
         			if(spiral [lastY - 1] [lastX] == 0) {	         			
	         			if(x <= y) {
	         				spiral [lastY - 1] [lastX] = x;
		         			x++;
	         			}
	         			lastY -= 1;
         			}
         		}
         		else {
         			direction = "L";
         			i --;
         		}
         	}
         	if(direction.equals("L")) {
             	if(lastX - 1 >= 0) { 
             		
             		if(spiral [lastY] [lastX - 1] == 0) {	             		
	             		if(x <= y) {
	             			spiral [lastY] [lastX - 1] = x;
		             		x++;
	             		}
	             		lastX -= 1;
             		}
             	}
             	else {
             		direction = "D";
             		i --;
             	}
         	}
             if(direction.equals("D")) {
                 if(lastY + 1 < spiral.length) {
                	 
                	if(spiral [lastY + 1] [lastX] == 0 ) {	
	                 	if(x <= y) {
	                 		spiral [lastY + 1] [lastX] = x;
		                 	x++;
	                 	}
	                 	lastY += 1;
                	}
                 }
                 else {
                 	direction = "R";
                 	i --;
                 }
             } 
         //System.out.println("LastX :: " + lastX + "LastY :: " + lastY);
       }
         /*for(int k = 0; k < spiral[0].length; k++) { 
          	for(int n : spiral[k]) {
          		if(n != 0) {
          		 System.out.print(n);
          		}
          		else {
          			System.out.print(" ");
          		}
          	}
             System.out.print("\n");
          }*/
         System.out.println(Arrays.deepToString(spiral));
  	}
  }
