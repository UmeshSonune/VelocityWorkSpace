package Assignment_24;

import java.io.IOException;
import java.util.*;

public class Employee implements Comparable{
	String name;
	String city;
		Employee(){
		
		}
		public Employee(String name,String city){
			this.name=name;
			this.city=city;
		}
		
		@Override
		public String toString() {
			
			return name;
		}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Employee e1 = new Employee("Umesh","Buldana");
		Employee e2 = new Employee("Tejaswini","Kolhapur");
		Employee e5 = new Employee("Aditya","Nanded");
		Employee e3 = new Employee("Satyjeet","Latur");
		Employee e4 = new Employee("Harshali","Latur");
		
		ArrayList o = new ArrayList();
		o.add(e1);
		o.add(e2);
		o.add(e5);
		o.add(e3);
		o.add(e4);
		Collections.sort(o);
		Iterator it = o.iterator();
		while(it.hasNext()) {
			Employee e = (Employee)it.next();
			System.out.print(e.name+" "+e.city);
			System.out.println();
			System.out.flush();
			System.out.print("");
			
		
		}
		
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		char c1 =this.name.charAt(0);
		char c2 =e.name.charAt(0);
		if(c1==c2) {
			return 0;
		}
		else if(c1>c2) {
			return 1;
		}
		else {
			return -1;
		}
		
	}
	

	
	//@Override
	//public int compare(Object arg0, Object arg1) {
		//String name1 = arg0.toString();
		//String name2 = arg1.toString();
		
		//return name1.compareTo(name2);
	//}
}
 

