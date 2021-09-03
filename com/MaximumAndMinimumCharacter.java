package string.com;
import java.util.*;
public class MaximumAndMinimumCharacter {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String a = input.nextLine();
		char b[]=a.toCharArray();
		char minchar=a.charAt(0);
		char maxchar=a.charAt(0);
		int max,min;
		int f[]=new int[a.length()];
		for(int i=0;i<a.length();i++) {
			f[i] = 1;
			for(int j=1+i;j<a.length();j++) {
				if(b[i]==b[j] && b[i]!=' ' && b[i] !='0' ) {
					f[i] +=1;
					b[j ]='0';
				}
			}
		}
		max=min=f[0];
		for(int i=0;i<a.length();i++) {
			if(min>f[i] && f[i]!=0) {
				min=f[i];
				minchar=b[i];
			}
			if(max<f[i]) {
				max =f[i];
				maxchar=b[i];
			}
		}
       System.out.println("The maximum repeating letter is "+maxchar+" and is repeated "+max+" times");
       System.out.println("The minimum repeating letter is "+minchar+" and is repeated "+min+" times");
	}

}
