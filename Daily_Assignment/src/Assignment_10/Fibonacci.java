package Assignment_10;

public class Fibonacci {
	public static void main(String[]rgs) {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.println(sum);
		while(sum<=100) {
		sum = num1 + num2 ;
		System.out.println(sum);
	     num1 =num2;
	     num2=sum;
	     
		}
	     
		
	}
	

}
