package viveks;

import java.util.Scanner;

public class palidrome {

	 public static boolean prime(int n) {
	     int x = n;
	     int r=0;
	     int rev=0;
	     while(n>0){
	       r=n%10;
	       rev=(rev*10)+r;
	       n=n/10;
	     }
	     if(rev==x)
	       return true;
	     else
	       return false;
   }
   
   public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     
     boolean flag = prime(n);
     if(flag == true) {
    	 System.out.print("number is palindrome");
     }else {
    	 System.out.print("number is not palindrome");
     }
   }
}
