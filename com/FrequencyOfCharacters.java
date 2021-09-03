package string.com;
import java.util.*;
public class FrequencyOfCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		char c[] = a.toCharArray();
		int f[]=new int[a.length()];
		for(int i=0;i<a.length();i++) {
			f[i]=1;
			for(int j=1+i;j<a.length();j++) {
				if(c[i]==c[j] && c[j]!=' ') {
					f[i]++;
					c[j]='0';
				}
			}
		}
		for(int i=0;i<a.length();i++) {
			if(c[i]!='0' && c[i]!=' ') {
				System.out.println(c[i]+" - "+f[i]);
			}
		}
	}

}
