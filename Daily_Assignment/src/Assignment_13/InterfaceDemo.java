package Assignment_13;

import java.util.Scanner;

interface Account{
	public void getSavingAccount();
	public void setUserDetails(String name,float balance);
}

abstract class AccountImpl implements Account{
	public String name;
	public float balance;
	
	
	public void getSavingAccount() {
		System.out.println("Name of User-->  "+name);
		System.out.println("Balance of User-->  "+balance);
		
		
	}
	
	abstract public void setUserDetails(String name,float balance);
	
}

class AccountImpl2 extends AccountImpl{
	
	
	 public void setUserDetails(String name,float balance) {
		 super.name=name;
		 super.balance=balance;
		
	}
	
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		AccountImpl2 obj = new AccountImpl2();
		System.out.print("Please enter Name");
		String name = cin.next();
		
		System.out.print("Enter Balance");
		float balance = cin.nextFloat();
		obj.setUserDetails(name,balance);
		obj.getSavingAccount();
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
