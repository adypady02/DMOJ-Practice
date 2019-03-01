import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		
		int n = keyboard.nextInt();
		
		int[] villages = new int[n];
		
		for(int i = 0; i < n; i++) {
			villages[i] = keyboard.nextInt();
		}
		Arrays.sort(villages);
		
		double smallest = ((double)(villages[1] - villages[0]) / 2) + ((double)(villages[2] - villages[1]) / 2);
		
		for(int i = 1; i < villages.length - 1; i++) {
			
			double area = ((double)(villages[i] - villages[i-1]) / 2) + ((double)(villages[i+1] - villages[i]) / 2);
			
			if(area < smallest) {
				smallest = area;
			}
		}
		System.out.printf(df.format(smallest));
	}
	//complete
}
