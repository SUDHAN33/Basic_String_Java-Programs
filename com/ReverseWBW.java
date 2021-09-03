package string.com;
import java.util.*;
public class ReverseWBW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		int n = a.length()-1;
		String ans ="";
		int c=0;
		for(int i=n;i>=0;i-=c) {
			if(a.charAt(i)==' ') {
				c=i;
			}
			if(c!=0) {
			for(int j=i;j>=0;j--) {
				if(ans.isEmpty()) {
					ans = ans.concat(a.substring(c+1,j+1));
				}
				else {
					ans = ans.concat(" "+a.substring(c+1,j+1));
				}
			}
		}
		}
		System.out.println(ans);
	}
	

}
