public class Main {
	public static void main(String[] args) {
		char[] qwertyuiop = new char[] { 'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'
        };
        for(char letter : qwertyuiop)
        	System.out.print(letter);
        for(int i = 0; i < qwertyuiop.length; i++) {
        	int letter = qwertyuiop.length - (i + 1);
        	System.out.print(qwertyuiop[letter]);
        } 
    }
}
