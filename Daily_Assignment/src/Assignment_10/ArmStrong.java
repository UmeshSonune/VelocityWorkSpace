//3. Write java program to check whether number is Armstrong or not.
//(A positive number is called armstrong number if it is equal to the 
//sum of cubes of its digits for example 0, 1, 153, 370, 371, 407 etc. 

//Armstrong number.

package Assignment_10;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[]args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("Give number");
		boolean check = getReverseNumber(cin.nextInt());
		if(check==true) {
			System.out.println("is a armstrong number");
			
		}
		else {
			System.out.println("No");
		}
		
		
	}
	static public boolean getReverseNumber(int num) {
		int newNum=0;
		int raw = num;
		
	
		while(num>0) 
		{
			int rem =num%10;
			 num=num/10;
			 
			 newNum= newNum + (rem*rem*rem);
		}
		if(newNum==raw) {
			return true;
		}
		else
			return false;
		
		
	}
	
	
}

