package string.com;
import java.util.*;
public class ReverseWordByWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		int i = a.length()-1;
		String ans ="";
		while(i>=0) {
			while(i>=0 && a.charAt(i) == ' ') i--;
			
			int j = i;
			
			while(i>=0 && a.charAt(i) != ' ') i--;
			if(ans.isEmpty()) {
				ans = ans.concat(a.substring(i+1,j+1));
			}
			else {
				ans = ans.concat(" "+a.substring(i+1,j+1));
			}
		}
		System.out.println(ans);
	}

}
