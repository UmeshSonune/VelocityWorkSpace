//2. Design the generics arraylist for string and add five 
//cities into it and iterate that using for each loop.

package Assignment_20;

import java.util.ArrayList;

public class GenericsDemo {
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<>();
		as.add("Buldana");
		as.add("Aurangabad");
		as.add("Pune");
		as.add("Mumbai");
		as.add("kopargaon");
		
		for(String s:as) {
			System.out.println(s);
		}
		
		
	}

}
