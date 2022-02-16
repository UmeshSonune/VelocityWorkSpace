package Assignment_7;

//2. Design method public int getNumberCube(int num), return int value to that
//		method and result should be into main method.
import java.util.Scanner;

public class CubeProgram 
{
	public static void main(String[]args) 
	{
		Scanner inpt = new Scanner(System.in);
		System.out.println("input number");
		int num = inpt.nextInt();
		CubeProgram obj = new CubeProgram();
		num=obj.getNumberCube(num);
		System.out.println(num);
		inpt.close();
	}
	
	public int getNumberCube(int num) 
	{
		return num*num*num;
	}
}
