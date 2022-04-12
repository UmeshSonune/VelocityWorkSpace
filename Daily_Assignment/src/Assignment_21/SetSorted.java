package Assignment_21;

import java.util.*;

public class SetSorted {
	public static void main(String[] args) {
		Tejaswini t = new Tejaswini();
		Collection c = new TreeSet(t);
		c.add(1);
		c.add(5);
		c.add(7);// obj1.compareTo(Obj2)
		c.add(9);
		c.add(7);
		c.add(56);
		c.add(3);
		System.out.println(c);//
	}

}
class Tejaswini implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (int)o1;
		Integer i2 = (int)o2;
		return -i2.compareTo(i1);
	}
	
}
