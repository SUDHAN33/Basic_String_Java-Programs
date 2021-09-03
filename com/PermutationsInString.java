package string.com;
import java.util.*;
public class PermutationsInString {
    // private static final String String = null;
	public static void permutation(String a,int st,int en ) {
    	 if(st == en-1) {
    		 System.out.println(a);
    	 }
    	 else {
    		 for(int i=st;i<en;i++) {
    			 a=swap(a,st,i);
    			 permutation( a, st+1, en);
    			 a=swap(a,st,i);
    			 
    		 }
    	 }
     }
     static String swap(String a,int i,int j) {
    	 char b[]=a.toCharArray();
    	 char ch = b[i];
    	 b[i]=b[j];
    	 b[j]=ch;
    	 return String.valueOf(b);
     }
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a=input.nextLine();
		int len = a.length();
		permutation(a,0,len);

	}

}
