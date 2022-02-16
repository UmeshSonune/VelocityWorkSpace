package Assignment_7;



import java.util.Scanner;

public class InputCheck {
	public static void main(String[]args) 
	{
		Scanner inpt = new Scanner(System.in);
		System.out.println("input Single keyWord");
		int num = inpt.nextInt();
		Fact1 obj = new Fact1();
		int newNum=obj.check(num);
		switch(newNum) 
		{
		case 1:System.out.println("Small Alphabet");
				break;
		case 2:System.out.println("Capital Alphabet");
				break;
		case 3:System.out.println("Symbol");
				break;
		case 4:System.out.println("Sorry Unrecognizable");
				break;
		}
		
		System.out.println("BYE");
		inpt.close();
	}
	

}
class Fact1
{
	public int check(int num) {
		if(num>='a'&& num<='z') {return 1;}
		else if(num>='A'&& num<='Z') {return 2;}
		else if(num>=' '&& num<='/') {return 3;}
		else if(num>='0'&& num<='9') {return 3;}
		else {return 4;}
		
	}
}
