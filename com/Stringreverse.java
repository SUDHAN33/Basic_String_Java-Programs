package string.com;
import java.util.*;
public class Stringreverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ori =input.nextLine();
        String rev=" ";
        for(int i=ori.length()-1;i>=0;i--) {
        	rev = rev+ori.charAt(i);
        }
        System.out.println(rev);
	}

}
