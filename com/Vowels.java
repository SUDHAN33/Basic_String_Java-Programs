package string.com;
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a=input.nextLine();
		int c=0,d=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ') {
			if(a.charAt(i)=='a' ||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U') {
				c++;
			}
			else {
				d++;
			}
			}
		}
		System.out.println("No of Vowels :"+c);
		System.out.println("No of consonants :"+d);
		
	}

}
