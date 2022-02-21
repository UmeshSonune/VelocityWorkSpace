package Assignment_8;

public class Student 
{ 	
	private int Rollno;
	private String FirstName;
	private String LastName;
	private String city;
	private String mobileno;
	static String Country="India";
	
	public void setRoll(int r)
	{	

		Rollno=r;
	}
	public void setFName(String f)
	{
		FirstName=f;
	}
	public void setLName(String l) 
	{
		LastName=l;
	}
	public void setC(String c)
	{
		city=c;
	}
	public void setM(String m)
	{
		mobileno=m;
	}
	
	public void getStudentInformation() 
	{	
			System.out.println("---------------------------------------");
			System.out.println("ROLLNO---> "+Rollno);
			System.out.print("Name--->  "+FirstName);
			System.out.println(" "+LastName);
			System.out.println("City-->    "+city);
			System.out.println("Mobile-->  "+mobileno);
			System.out.println("Country--> "+Country);
	}
	//--
}
