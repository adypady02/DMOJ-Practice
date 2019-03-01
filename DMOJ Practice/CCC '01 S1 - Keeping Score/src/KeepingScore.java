import java.io.*;
import java.util.*;

public class KeepingScore {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String hand = keyboard.next();
        
        List<Character> clubs = new ArrayList();
        List<Character> diamonds = new ArrayList();
        List<Character> hearts = new ArrayList();
        List<Character> spades  = new ArrayList();
        
        int i = 0;
        int total = 0;
        int cPoints = 0;
        int dPoints = 0;
        int hPoints = 0;
        int sPoints = 0;
        
        while(i < hand.length()) {
        	if(hand.charAt(i) == 'C') {
                suit:
                for(int x = i + 1; x < hand.length(); x++) {
               	 	if(hand.charAt(x) == 'C' || hand.charAt(x) == 'D' || hand.charAt(x) == 'H' || hand.charAt(x) == 'S') {
               	 			
                           break suit;
                       }
                       switch(hand.charAt(x)) {
                           case 'A' : total += 4; cPoints += 4;
                           break;
                           
                           case 'K' : total += 3; cPoints += 3;
                           break;
                           
                           case 'Q' : total += 2; cPoints += 2;
                           break;
                           
                           case 'J' : total += 1; cPoints += 1;
                           break;
                       }
                       clubs.add(hand.charAt(x));
                   }
               }
               
            else if(hand.charAt(i) == 'D') {
                   suit: 
                   for(int x = i + 1; x < hand.length(); x++) {
                       if(hand.charAt(x) == 'C' || hand.charAt(x) == 'D' || hand.charAt(x) == 'H' || hand.charAt(x) == 'S') {                      
                           break suit;
                       }
                       switch(hand.charAt(x)) {
                           case 'A' : total += 4; dPoints += 4;
                           break;
                           
                           case 'K' : total += 3; dPoints += 3;
                           break;
                           
                           case 'Q' : total += 2; dPoints += 2;
                           break;
                           
                           case 'J' : total += 1; dPoints += 1;
                           break;
                       }
                       diamonds.add(hand.charAt(x));
                   }
               }
               
               else if(hand.charAt(i) == 'H') {
                   suit: 
                   for(int x = i + 1; x < hand.length(); x++) {
                       if(hand.charAt(x) == 'C' || hand.charAt(x) == 'D' || hand.charAt(x) == 'H' || hand.charAt(x) == 'S') {                     
                           break suit;
                       }
                       switch(hand.charAt(x)) {
                           case 'A' : total += 4; hPoints += 4;
                           break;
                           
                           case 'K' : total += 3; hPoints += 3;
                           break;
                           
                           case 'Q' : total += 2; hPoints += 2;
                           break;
                           
                           case 'J' : total += 1; hPoints += 1;
                           break;
                       }
                       hearts.add(hand.charAt(x));
                   }
               }
               
               else if(hand.charAt(i) == 'S') {
                   suit: 
                   for(int x = i + 1; x < hand.length(); x++) {
                       if(hand.charAt(x) == 'C' || hand.charAt(x) == 'D' || hand.charAt(x) == 'H' || hand.charAt(x) == 'S') {
                           break suit;
                       }
                       switch(hand.charAt(x)) {
                           case 'A' : total += 4; sPoints += 4;
                           break;
                           
                           case 'K' : total += 3; sPoints += 3;
                           break;
                           
                           case 'Q' : total += 2; sPoints += 2;
                           break;
                           
                           case 'J' : total += 1; sPoints += 1;
                           break;
                       }
                       spades.add(hand.charAt(x));
                    }
                }
        	i++;
            }
        System.out.println(total);
        }
    }

