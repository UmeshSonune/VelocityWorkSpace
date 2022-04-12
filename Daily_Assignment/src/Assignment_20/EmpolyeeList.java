package Assignment_20;

import java.util.ArrayList;
import java.util.ListIterator;

class Employee{
	String name;
	int id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return this.name+" "+this.id;
	}
}
public class EmpolyeeList {
	public static void main(String[] args) {
		Employee e1 = new Employee("Umesh",1);
		Employee e2 = new Employee("Arnav",2);
		Employee e3 = new Employee("harshali",3);
		Employee e4 = new Employee("Tejaswini",4);
		Employee e5 = new Employee("Satyajeet",5);
		
		
		ArrayList<Employee> le = new ArrayList<>(); 
		le.add(e1);
		le.add(e2);
		le.add(e3);
		le.add(e4);
		le.add(e5);
		
		EmpolyeeList e = new EmpolyeeList();
		e.printEmployee(le);
		
	}
	
	public void printEmployee(ArrayList l) {
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}
		
}
	
	

