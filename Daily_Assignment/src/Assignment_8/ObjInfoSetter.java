package Assignment_8;
import java.util.Scanner;

public class ObjInfoSetter {
	Scanner data=new Scanner(System.in);
	
	public void getUserInput()
	{
		Student s1=new Student();
		
		System.out.print("Give RollNo for student  :");
		s1.setRoll(data.nextInt());
		
		System.out.print("Give First Name  :");
		s1.setFName(data.next());
		
		System.out.print("Give Last Name  :");
		s1.setLName(data.next());
		
		System.out.print("Give city name  :");
		s1.setC(data.next());
		
		System.out.print("give mobile no  :");
		s1.setM(data.next());
		
		Student s2=new Student();
		
		System.out.print("Give RollNo for student  :");
		s2.setRoll(data.nextInt());
		
		System.out.print("Give First Name :");
		s2.setFName(data.next());
		
		System.out.print("Give Last Name :");
		s2.setLName(data.next());
		
		System.out.print("Give city name :");
		s2.setC(data.next());
		
		System.out.print("give mobile no :");
		s2.setM(data.next());
		
		System.out.println(" ---PRINTING INFORMATION--- ");
		s1.getStudentInformation();
		s2.getStudentInformation();
	}
//--
}
