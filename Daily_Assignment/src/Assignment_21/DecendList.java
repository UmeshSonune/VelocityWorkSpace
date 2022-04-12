//1. Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna
//now I want to sort that element based on descending order.
package Assignment_21;

import java.util.*;

public class DecendList {
	public static void main(String[] args) {
		DecendList dl = new DecendList();
		Collection<String>l = new ArrayList<String>();
		 l.add("Ram");
		 l.add("Sohan");
		 l.add("Ashok");
		 l.add("Ajay");
		 l.add("Prasnna");
		 System.out.println(l);
		 System.out.println(dl.Arrange(l));
		 
	}
	public List Arrange(Collection l) {
		MyComparator c = new MyComparator();
		TreeSet t = new TreeSet(l);
		Iterator it = t.iterator();
		TreeSet t1 = new TreeSet(c);
		for(int i =0;i<t.size();i++) {
			t1.add(it.next());
		}
	
		
		ArrayList ll = new ArrayList(t1);
		
		return ll;
		
	}
	
	
}
class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return -1;
	}
}
