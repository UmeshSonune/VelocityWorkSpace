package Assignment_20;

import java.util.ArrayList;
import java.util.ListIterator;

public class CityList {
	public static void main(String[] args) {
		ArrayList<String> as = new ArrayList<>();
		as.add("Mumbai");
		as.add("Banglore");
		as.add("Pune");
		as.add("Mumbai");
		as.add("Hydrabad");
		for(String s:as) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println();
		as.remove(3);
		
		
		
		
		for(String s:as) {
			System.out.println(s);
		}
	}
}
