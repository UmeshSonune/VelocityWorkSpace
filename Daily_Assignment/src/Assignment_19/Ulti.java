package Assignment_19;

import java.util.Scanner;

public class Ulti {
	static String s; 
	public static void main(String[] args) {
		s = new String();
		Scanner cin = new Scanner(System.in);
		System.out.println("Give String");
		String s = cin.next();
		System.out.println(s);
		System.out.println();
		System.out.println(getReverseString(s));
		
	}
	
	
	 public static String getReverseString(String reverse) {
		 for(int  i=reverse.length()-1; i>=0; i--) {
			 char c = reverse.charAt(i);
			 //System.out.print(c+" ");
			 s=s+c;

		 }
		 System.out.println();
		 return s;
	 }
}
