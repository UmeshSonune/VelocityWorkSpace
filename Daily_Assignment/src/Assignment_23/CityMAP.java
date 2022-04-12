package Assignment_23;

import java.util.*;

public class CityMAP {
	public static void main(String[]args) {
		List<String> Maharashtra =new ArrayList<>();
		Maharashtra.add("Mumabi");
		Maharashtra.add("Pune");
		Maharashtra.add("Nagpur");
		
		List<String> Karnataka =new ArrayList<>();
		Karnataka.add("Bangalor");
		Karnataka.add("Mysore"); 
		
		List<String> MadhyaPradesh =new ArrayList<>();
		MadhyaPradesh.add("Bhopal");
		MadhyaPradesh.add("Indore");

		List<String> India =new ArrayList<>();
		India.add("Maharashtra");
		India.add("Karnataka");
		India.add("MadhyaPradesh");
		
		HashMap<String,ArrayList<String>> hm = new LinkedHashMap<>();
		
		hm.put("India",(ArrayList<String>) India);
		hm.put("Maharahtra",(ArrayList<String>) Maharashtra );
		hm.put("Pune",(ArrayList<String>)Karnataka);
		hm.put("Nagpur",(ArrayList<String>)MadhyaPradesh);
		System.out.println(hm);
		
		
		System.out.println("this is the bullshit");
		
	
	}
}
