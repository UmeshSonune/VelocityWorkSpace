package Assignment_21;

import java.util.*;

public class Decend {
	public static void main(String[] args) {
		Decend d = new Decend();
		Collection<String> l = new ArrayList<>();
		 l.add("Ram");
		 l.add("Sohan");
		 l.add("Ajay");
		 l.add("Prasnna");
		 l.add("Zathura");
		 l.add("Xenon");
		 l.add("Welb");
		 l.add("Quality");
		 System.out.println(l);
		 System.out.println();
		 System.out.println();
		 l =  d.SortName(l);
		 System.out.println(l);
		 
		
		
	}
	public List SortName(Collection c) {
		TreeSet t = new TreeSet(c);
		TejaswiniG tg = new TejaswiniG();
		TreeSet t1 = new TreeSet(tg);
		Iterator it =  t.iterator();
		
	 for(int i=0;i<t.size();i++ ) {
			t1.add(it.next());
		}
		
		c=(Collection)t1;
		ArrayList al = new ArrayList(c);
		return al;
	}
}

class TejaswiniG implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		return -1;
	}
} 
