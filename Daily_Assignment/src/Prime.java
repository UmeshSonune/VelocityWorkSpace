import java.util.Scanner;
public class Prime {
	public static void main(String[]args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("nnumber");
		int num = cin.nextInt();
		 boolean prime = method(num);
		 if(prime==true) {
			 System.out.println("number is prime");
		 }
		 else {
			 System.out.println("number is not prime");
		 }
	}
	static boolean method(int num) {
		if(num==1) {
			return false;}
		else if(num==2) {
			return true;
		}
		else {
			int a=2;
			while(num%a!=0) {
				a++;
			}
			if(a==num) {
				return true;
			}
			else {
				return false;
			}
		}	
	}
}
