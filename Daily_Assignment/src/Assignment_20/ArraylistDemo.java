
//1. Write program to add the five students mobile number 
//into arraylist and iterate that elements using iterator. 
package Assignment_20;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArraylistDemo  {
	public static void main(String[]args) {
		ArrayList a = new ArrayList();
		a.add("Umesh");
		a.add(1234);
		a.add('Q');
		a.add("Arnav Ashish Bahekar");
		a.add(56789);
		
		ListIterator li = a.listIterator();
		System.out.println(a);
	
		
		li.add("6th element");
		while(li.hasNext()) {
			System.out.println(li.next()+" "+li.hashCode());
		}
	
	}
}
