package string.com;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String a=input.nextLine();
	String b=input.nextLine();
	String c=a.toLowerCase();
    String d=b.toLowerCase();
    boolean anagram= true;
    boolean visit[]= new boolean[c.length()];
    for(int i=0;i<c.length();i++) {
    	anagram=false;
    	for(int j=0;j<d.length();j++) {
    		if(c.charAt(i)==d.charAt(j) && !visit[j]) {
    			anagram=true;
    			visit[j]=true;
    			break;
    		}
    	}
    	if(!anagram) {
    		break;
    	}
    }
    if(anagram) {
    	System.out.println("Anagram");
    }
    else {
    	System.out.println("Not anagram");
    }
	}

}
