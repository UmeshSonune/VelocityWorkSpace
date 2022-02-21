package Assignment_10;

import java.util.Scanner;

public class Fibo {
	public static void main(String[]args) {
		int t1 = 0;
		int t2 = 1;
		int num = 0;
		Scanner cin = new Scanner(System.in);
		System.out.println("Number upto");
		int a =cin.nextInt();
		for(int i=1;i<=a;i++) {
			//
			t1=t2;//t1 = 3;     t2 = 3
			
			t2=num;//t2 = ;    num = 7
			
			num = t1+t2; //num = 7
			
			if( num >= a) {
				break;
			}
			System.out.println(num);
			
			cin.close();
			
			
		}
		
		
	}

}
