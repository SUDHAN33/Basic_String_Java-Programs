package string.com;
import java.util.*;
public class RotationofString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		String b =input.nextLine();
		if(a.length() != b.length()) {
			System.out.println("They cannot be rotated");
		}
		else {
		  a=a.concat(b);
			if(a.indexOf(b) !=-1) {
				System.out.println("They  be rotated");
			}
			else {
				System.out.println("They cannot be rotated");
			}
		}
		
	}

}
