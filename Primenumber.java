package viveks;

import java.util.Scanner;

public class Primenumber {
	 static  boolean isprime(int n) {
		   
		   for (int i = 2; i < n; i++)
			    if (n % i == 0)
			        return false;
			 
			return true;
	  }
	 static int prime(int n) {
		 int count = 0;
		 for(int i=2;i<=n;i++) {
				
				
				if(isprime(i)) {System.out.println(i);  
					count++;
				}
				
			}
		 return count;
	 }
		public static void main(String[] args) {
	
		  Scanner scn = new Scanner(System.in);
		  
		  int a= scn.nextInt();
			int count = prime(a);
			
			System.out.println(count);
		}
}
