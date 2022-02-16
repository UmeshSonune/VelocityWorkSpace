package Assignment_8;
import java.util.Scanner;

public class EmployeeInformation 
{
	public static void main(String[]args)
	{
		Scanner data=new Scanner(System.in);
		
		ObjInfoSetter getUi=new ObjInfoSetter();
		getUi.getUserInput();
		
		data.close();
		//---
	}

}
