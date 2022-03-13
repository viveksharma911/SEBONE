package viveks;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	
                public static void main(String[] arg) {
                	
                	Scanner sc= new Scanner(System.in); 
                    String str = sc.nextLine();
                    String str1 = sc.nextLine();
                    if(str.length() == str1.length()) {
                    char[]arr = str.toCharArray();
                    Arrays.sort(arr);
                    
                    char[]arr2 = str1.toCharArray();
                    Arrays.sort(arr2);
                    
                    boolean flag = Arrays.equals(arr, arr2);
                    System.out.println(flag);
                    }

                	
                }
}
