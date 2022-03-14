package viveks;

import java.util.Scanner;

public class Primenumber {
	 public  boolean isPrime(int n) {
		   
		   for (int i = 2; i < n; i++)
			    if (n % i == 0)
			        return false;
			 
			return true;
	  }
	 public int prime(int n) {
		 int count = 0;
		 Primenumber x = new Primenumber();
		 for(int i=2;i<=n;i++) {
				
				
				if(x.isPrime(i)) {System.out.println(i);  
					count++;
				}
				
			}
		 return count;
	 }
		public static void main(String[] args) {
	
		  Scanner scn = new Scanner(System.in);
		  
		  int a= scn.nextInt();
		  Primenumber x = new Primenumber();
			int count = x.prime(a);
			
			System.out.println(count);
		}
}
