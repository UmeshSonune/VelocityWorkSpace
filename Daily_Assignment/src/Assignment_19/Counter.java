package Assignment_19;

import java.util.Scanner;

public class Counter {
	static int num = 0;
	static char[] cht;
	public static void main(String[] args) {
		// cht = new char[100];
		Scanner cin = new Scanner(System.in);
		System.out.println("Give String");
		String s = cin.next();
		do {
		System.out.println("Enter Option");
		System.out.println("1  Alphabet");
		System.out.println("2  Vowels");
		System.out.println("3  Number");
		num = cin.nextInt();
		
		switch(num) {
		case 1:{
			 alphabet(s);
			 
			break;
		}
		case 2:{
			vowels(s);
			break;
		}
		case 3:{
			number(s);
			break;
		}
		default:{
			System.out.println("wrong choice");
		}
		}
		}while(true);
		
		
	}
	public static void  alphabet(String s) {
		int counter=0;
		char[] ch = s.toCharArray();
		for(int i = 0;i < s.length();i++) {
			
			if(ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122) {
				System.out.print(ch[i]+" ");
				 counter++;
				
			}
			
		}
		System.out.println();
		System.out.println("number of alpha "+counter);
	}
	
	public static void vowels(String s) {
		int counter=0;
		char[] ch = s.toCharArray();
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		for(int j=0;j<vowels.length;j++) {
			for(int i = 0;i < s.length();i++) {
				if(ch[i]==vowels[j]) {
					System.out.println(ch[i]);
					counter++;
				}
				
			
			}
		}
		System.out.println("Number of Vowels "+counter);
	}
	
	public static void number(String s) 
	{
		int counter=0;
		char[] ch = s.toCharArray();
		char[] num = {'1','2','3','4','5','6','7','8','9','0'};
		for(int j=0;j<num.length;j++) 
		{
			for(int i = 0;i < s.length();i++) 
			{
				if(ch[i]==num[j]) 
				{
					System.out.print(" "+ch[i]);
					counter++;
				}
				
			
			}
			
		}
		System.out.println();
		System.out.println("Number of Numbers "+counter);
		
	
			
		
		
	
	
	
	
	
	}
}

