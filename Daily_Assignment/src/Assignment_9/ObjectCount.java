//1. Write the Java program in which create the multiple objects and 
//display the count of number of objects created into class.

package Assignment_9;

public class ObjectCount {
	public static void main(String[]args)
	{
		Object obj0 = new Object();
		Object obj1 = new Object("umesh");
		Object obj2 = new Object('F');
		Object obj3= new Object(777);
		Object obj4 = new Object(23.69);
		Object obj5 = new Object(23.69);
		Object obj6 = new Object(45.32);
		Object obj7 = new Object();
		
		
		System.out.println("Number of objects: "+Object.objcounter);
	}

}
class Object
{
	static int objcounter=0;
	{objcounter=objcounter+1;}
	
	
	public Object() {}
    public Object(int c) {}
	public Object(char c) {}
	public Object(String s) {}
	public Object(double d) {}

}