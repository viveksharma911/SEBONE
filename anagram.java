package viveks;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	            
	    public boolean bool(String s1, String s2) {
	    	boolean flag = false;
	    	if(s2.length() == s1.length()) {
                char[]arr = s2.toCharArray();
                Arrays.sort(arr);
                
                char[]arr2 = s1.toCharArray();
                Arrays.sort(arr2);
                
               flag = Arrays.equals(arr, arr2);
               
                }
	    	
	    	return flag;
	    }
                public static void main(String[] arg) {
               
                	Scanner sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    String str1 = sc.nextLine();
                     
                    anagram a = new anagram();
                    if(a.bool(str, str1))
                    	
                  {
                    	System.out.println("anagram");
                  }
                    else 
                    	System.out.println("Not Anagram");
                    
                   
                	
                }
}
