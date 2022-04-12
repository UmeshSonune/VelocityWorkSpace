//Assignments 22
//1. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna and value is 
//3,2,1,6,5 now I want to sort the value from map and print it

package Assignment_22;

import java.util.*;

public class Assign {
 public static void main(String[] args) {
	Map<Integer,String> m = new HashMap<>();
	m.put(3,"Ram");
	m.put(2,"Sohan");
	m.put(1,"Ashok");
	m.put(6,"Ajay");
	m.put(7,"Ajay");
	m.put(6,"Prasanna");
	System.out.println(m);
	System.out.println();
	System.out.println();
	
	Collection c = m.values();
	Tejaswini t = new Tejaswini();
	TreeMap ts = new TreeMap(m);
	TreeMap ts1 = new TreeMap(t);
	ts1.putAll(m);
	//for(int i =0;i<ts.size();i++) {
		
	//}
	System.out.println(ts1);
	System.out.println(ts);
	System.out.println();
	//System.out.println(s);
	System.out.println();
	//System.out.println(s1);
	System.out.println();
}
}
class Tejaswini implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -1;
	}
	
}









