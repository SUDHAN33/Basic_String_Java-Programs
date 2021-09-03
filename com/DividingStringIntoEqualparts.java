package string.com;
import java.util.*;
public class DividingStringIntoEqualparts {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();
		int n=input.nextInt();
		int temp=0,chars=a.length()/n;
		if(a.length()%n !=0) {
			System.out.println("It cannot be divided");
		}
		else {
		String eqparts[]=new String[n];
		for(int i=0;i<a.length();i=i+chars) {
			String part=a.substring(i,i+chars);
			eqparts[temp]=part;
			temp++;
		}
		for(int i=0;i<eqparts.length;i++) {
			System.out.println(eqparts[i]);
		}
	}
	}

}
