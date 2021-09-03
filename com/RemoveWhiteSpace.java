package string.com;
import java.util.*;
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String a =input.nextLine();
		System.out.println(a.replaceAll("\\s+", ""));
		
		String b = input.nextLine();
		System.out.println(b.replaceAll("\\s", "-"));
	}

}
