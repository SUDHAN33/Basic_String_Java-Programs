package string.com;
import java.util.*;
public class LongestRepeatingSequence {
     public static String Part(String a,String b) {
    	 int y= Math.min(a.length(),b.length());
    	 for(int i=0;i<y;i++) {
    		 if(a.charAt(i)!=b.charAt(i)) {
    			 return a.substring(0,i);
    		 }
    	 }
    	 return a.substring(0,y);
     }
	public static void main(String[] args) {
    	 
		Scanner input=new Scanner(System.in);
		String a= input.nextLine();
		String part=" ";
		for(int i=0;i<a.length();i++) {
			for(int j=i+1;j<a.length();j++) {
				String x= Part(a.substring(i,a.length()),a.substring(j,a.length()));
				if(x.length() >part.length() ) {
					part =x;
				}
			}
		}
		System.out.println(part);
		
	}

}
