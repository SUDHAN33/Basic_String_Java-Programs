package string.com;
import java.util.*;
public class SmallestAndLargestWord {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		String string = input.nextLine();
		 String word = "", small = "", large=""; 
		 int c=1;
		 for(int i=0;i<string.length();i++) {
				if(string.charAt(i)==' ') {
					c++;
				}
		 }
	      String[] words = new String[c];    
	      int length = 0; 
	      string = string + " ";  
	      for(int i1 = 0; i1 < string.length(); i1++){  
	          if(string.charAt(i1) != ' '){    
	              word = word + string.charAt(i1);    
	          }    
	          else{       
	              words[length] = word; 
	              length++; 
	              word = "";    
	          }    
	      }            
	      small = large = words[0];    
	      for(int k = 0; k < length; k++){    
	          if(small.length() > words[k].length())    
	              small = words[k];     
	          if(large.length() < words[k].length())    
	              large = words[k];    
	      }    
	      System.out.println("Smallest word: " + small);    
	      System.out.println("Largest word: " + large);    
	  }  
	}  

