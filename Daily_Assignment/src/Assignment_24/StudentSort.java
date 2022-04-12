package Assignment_24;

import java.util.*;

public class StudentSort implements Comparator{
	String name;
	int salary;
	StudentSort(){}
	StudentSort(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	public static void main(String[] args) {
		StudentSort s1 = new StudentSort("Umesh",3000);
		StudentSort s2 = new StudentSort("Tejaswini",7000);
		StudentSort s3 = new StudentSort("Satyajeet",5000);
		StudentSort s4 = new StudentSort("Harshali",9000);
		StudentSort s5 = new StudentSort("Arnav",1000);
		
		
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		
		Collections.sort(al,new StudentSort());
		Iterator i = al.iterator();
		while(i.hasNext()) {
			StudentSort e = (StudentSort)i.next();
			
			System.out.println(e.name+" "+e.salary);
		}
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		StudentSort s1=(StudentSort)o1;
		StudentSort s2=(StudentSort)o2;
		int num1 = s1.salary;
		int num2 = s2.salary;
		if(num1==num2) {
			return 0;
		}
		else if(num1>num2) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
}
