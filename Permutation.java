package viveks;

import java.util.Scanner;

public class Permutation {
	
	 public void printpermutations(String str,String ans) {
	      if(str.length()==0) {
		     System.out.println(ans);
		     return;
	      }
	    for(int i=0;i<str.length();i++) {
		   char ch=str.charAt(i);
		   String sl=str.substring(0,i);
		   String sr=str.substring(i+1);
		   String res=sl+sr;
		   printpermutations(res,ans+ch);
		
	         }
	    
	    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Permutation p=new Permutation();
		System.out.println("enter any string = ");
		String s=sc.next();
		p.printpermutations(s,"");
		sc.close();
		
	}
   
    
    
}
