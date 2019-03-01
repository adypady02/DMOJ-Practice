import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner keyboard = new Scanner(System.in);
    	int games = keyboard.nextInt();
    	int [] teamOne = new int[games];
    	int []teamTwo = new int[games];
    	
    	for(int i = 0; i < games * 2; i++) {
    		
    		if(i >= games) {
    			teamTwo[i - games] = keyboard.nextInt();
    		}
    		
    		else {
    			teamOne[i] = keyboard.nextInt();
    		}
    		
    	}
    	System.out.println(Arrays.toString(teamOne));
    	System.out.println(Arrays.toString(teamTwo));
    	
    	int k = 0;
    	int teamOnePoints = 0;
    	int teamTwoPoints = 0;
    	
    	for(int i = 0; i < games; i++) {
    		
    		teamOnePoints += teamOne[i];
    		teamTwoPoints += teamTwo[i];
    		
    		if(teamOnePoints == teamTwoPoints) {
    			k = i + 1;
    		}
    	}
    	System.out.println(k);
    }
}