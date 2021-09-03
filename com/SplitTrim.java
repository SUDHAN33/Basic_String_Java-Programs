package string.com;
import java.util.*;
public class SplitTrim {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String a =input.nextLine();
		String b[]= a.split("[!,]+");
		for(String c:b) {
			System.out.println(c);
		}
       System.out.println(a.trim());
	}

}
