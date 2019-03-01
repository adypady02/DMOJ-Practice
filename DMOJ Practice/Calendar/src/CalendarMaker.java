import java.io.*;
import java.util.*;

public class CalendarMaker {
    public static void main(String[] args) {
    
        String[][] calendar = new String[6][7];
        calendar[0][0] = "Sun";
        calendar[0][1] = "Mon";
        calendar[0][2] = "Tue";
        calendar[0][3] = "Wed";
        calendar[0][4] = "Thu";
        calendar[0][5] = "Fri";
        calendar[0][6] = "Sat";
        
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        
        calendar[1][n-1] = "1";
        
        int day = 2;
        for(int i = n; i < calendar[1].length; i++) {
            calendar[1][i] = String.valueOf(day);
            day ++;
        }
        
        for(int i = 2; i < calendar.length; i++) {
            
            for(int k = 0; k < calendar[i].length; k++) {
                calendar[i][k] = String.valueOf(day);
                day ++;
            }
        }
        for(int i = 0; i < calendar.length; i++) {
            
            for(int k = 0; k < calendar[i].length; k++) {
                if(!(k == calendar[i].length - 1)) {
                    System.out.print(calendar[i][k] + " ");
                }
                else {
                    System.out.println(calendar[i][k]);
                }
            }
        }
        keyboard.close();
    }
}
