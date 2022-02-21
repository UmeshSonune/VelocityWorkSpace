//1. Write Java program to check whether number is prime or not. ( Prime means  a 
//number which is divisible by only two numbers: 1 and itself. So, if any number is 
//divisible by any other number, it is not a prime number.)
package Assignment_10;

import java.util.Scanner;

public class Prime {
	public static void main(String[]args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = cin.nextInt();
		boolean prime =method(num);
		if(prime==true) {
			System.out.println("giben number is prime Number");
		}
		else {
			System.out.println("The given number is not prime");
		}
	}
	
	
	static boolean method(int num) {
		if(num==2 || num==3) {
			return true;
		}
		else {
			int i=2;
			while(num%i!=0) {
				i++;
			}
			if(i==num) {return true;}
			else {return false;}
		}
			
			
		}
	}
