package Assignment_21;

import java.util.*;

public class Dupli {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Red");
		c.add("Blue");
		c.add("Red");
		c.add("Blue");
		c.add("Green");
		c.add("Black");
		c.add("Yellow");
		c.add("Yellow");
		c.add("Black");
		System.out.println(c);
		c = new LinkedHashSet(c);
		System.out.println(c);
		
	}
}
