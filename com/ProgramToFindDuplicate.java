package string.com;
import java.util.*;
public class ProgramToFindDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char b[]=a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			int count =0;
			for(int j=1+i;j<a.length();j++) {
				if(b[i]==b[j] && b[i]!=' ' ) {
					count++;
					b[j]='0';
				}
			}
			if(count>0 && b[i]!='0') {
				System.out.println(b[i]);
			}
		}
	}

}
