import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	
        int modifier = 0;
        
    	Scanner theScanner = new Scanner(System.in);
        
		char[] qwertyuiop = new char[] { 'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'
        };
        
        
        if(theScanner.hasNextInt()) {
        int input = theScanner.nextInt();
        modifier = input;
        
        /*if(theScanner.hasNextInt())
        	modifier = theScanner.nextInt();*/
            
        switch(modifier) {
        	case 1: {
        		for(char letter : qwertyuiop)
        			System.out.print(letter);
           		break;
        	}
        	case 2: {
        		for(int i = 0; i < qwertyuiop.length; i++) {
        			int letter = qwertyuiop.length - (i + 1);
        			System.out.print(qwertyuiop[letter]);
                }
            	break;
        	}
            default: {
				System.out.print("errror, int not parsed");
            }
        }
        }
    }
}
