package string.com;
import java.util.*;
public class SubsetsInString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a = input.nextLine();
		int len = a.length();
		String part[] = new String[len*(len+1)/2];
        int temp =0;
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
					String equal=a.substring(i, j+1);
					part[temp]= equal;
					temp++;
				}
			}
		for(int i=0;i<part.length;i++) {
			System.out.println(part[i]);
		}
	}

}
