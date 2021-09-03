package string.com;
import java.util.*;
public class PatternSearchingProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String txt = input.nextLine();
		String pat = input.nextLine();
		int pos = txt.indexOf(pat);
		
		while(pos>=0) {
			System.out.println(pos+" ");
			pos = txt.indexOf(pat,pos+1);
			//System.out.println(pos);
		}
		//System.out.println(txt.substring(0,0));
	}

}
