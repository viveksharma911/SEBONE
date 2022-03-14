package viveks;

import java.util.Scanner;

public class prg {
    public void Frequency(String s1 ,String s2 ) {
    	String temp = "";        
    	for(int i=0;i<s2.length();i++) {
    		temp += s2.charAt(0);
    		if(s2.charAt(0)==' ') {
    			System.out.println(temp);
    			temp = " ";
    		}
    	}
    	
    }  
	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
          String word = sc.nextLine();
          String paragraph = sc.nextLine();
          
          prg a = new prg();
          
          a.Frequency(word,paragraph);
//          System.out.println(count);
	}

}
