package Assignment_7;
import java.util.Scanner;

public class FactorProgram {
	public static void main(String[]args) 
	{
		Scanner inpt = new Scanner(System.in);
		System.out.println("input number");
		int num = inpt.nextInt();
		Factor obj = new Factor();
		obj.method(num);
		inpt.close();
	}
}
class Factor
{
	public void method(int num)
	{
		int i=1;
		while(i<=num)
		{
			if(num%i==0) {
				System.out.println(i);
				i++;
				
			}
			else
               i++;
		}
	}
}