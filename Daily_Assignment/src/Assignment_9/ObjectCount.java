//1. Write the Java program in which create the multiple objects and 
//display the count of number of objects created into class.

package Assignment_9;

public class ObjectCount {
	public static void main(String[]args)
	{
		Object obj = new Object();
		Object obj1 = new Object("umesh");
		Object obj2 = new Object('F');
		Object obj3= new Object(777);
		Object obj4 = new Object(23.69);
		
		System.out.println("Number of objects: "+Object.objcounter);
	}

}
class Object
{
	static int objcounter=0;
    public Object() {objcounter=objcounter+1;}
	public Object(int c) {objcounter=objcounter+1;}
	public Object(char c) {objcounter=objcounter+1;}
	public Object(String s) {objcounter=objcounter+1;}
	public Object(double d) {objcounter=objcounter+1;}

}