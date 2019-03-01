import java.util.Scanner;

public class UpsideDown {
	public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        
        int m = keyboard.nextInt();
        int n = keyboard.nextInt();
        
        int total = 0;
        for(int i = m; i <= n; i++) {
            
            if(sameUpsideDown(i)) {
                total ++;
            }
        }
        System.out.println(total);
    }
    
    public static boolean sameUpsideDown(int num) {
        
    	if(num < 10) {
    		
    		switch (num) {
            case 0 : return true;		//works
            case 1 : return true;
            case 8 : return true;
    		}
            return false;	
        }
    	
    	String s = String.valueOf(num);
    	System.out.println(s);
    	
    	for(int i = 0; i < s.length(); i++) {
    		
    		if(!(s.charAt(i) == 1 && s.charAt((s.length() - i - 1)) == 1)) {
    			System.out.println(s.charAt(i) + " : " + s.charAt(s.length() - i - 1));
    			
    			if(!(s.charAt(i) == 0 && s.charAt((s.length() - i - 1)) == 0)) {
        			
    				if(!(s.charAt(i) == 8 && s.charAt((s.length() - i - 1)) == 8)) {
    	    			
    					if(!(s.charAt(i) == 6 && s.charAt((s.length() - i - 1)) == 9)) {
    		    			
    						if(!(s.charAt(i) == 9 && s.charAt((s.length() - i - 1)) == 6)) {
    			    			System.out.println("not flippable");
    			    			return false;
    				        }
    			        }
    		        }
    	        }
	        }
    		
    	}
    return true;
    }
}