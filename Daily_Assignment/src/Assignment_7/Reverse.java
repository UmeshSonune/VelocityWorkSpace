package Assignment_7;

import java.util.Scanner;

public class Reverse {
	public static void main(String[]args) 
	{
		Scanner inpt = new Scanner(System.in);
		System.out.println("input number");
		int num = inpt.nextInt();
		
		int newNum=getReverseNumber(num);
		System.out.println("Reverse number is "+newNum);
		inpt.close();
	}

	static public int getReverseNumber(int num) {
		int newNum=0;
		
	
		while(num>0) 
		{
			int rem =num%10;
			 num=num/10;
			 newNum= (newNum*10)+rem;
			 
		}
		
		return newNum;
	}
}
