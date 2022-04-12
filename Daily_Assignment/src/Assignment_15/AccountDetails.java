package Assignment_15;

import java.util.Scanner;

public class AccountDetails{
	public void getAccountDetails() {
		
		
		Scanner cin = new Scanner(System.in);
		SavingAccount obj = new SavingAccount();
		
		System.out.println("Give id");
		obj.id = cin.nextInt();
		
		
		System.out.println("Account Number");
		obj.accountNumber = cin.nextInt();
		
		System.out.println("Account Balance");
		obj.balance = cin.nextInt();
		
		
		obj.balance=getWithdrawDetails(obj);
		
		System.out.println("__________________________________________________________");
		System.out.println("ID------>>  "+obj.id);
		System.out.println("Account Number---->  "+obj.accountNumber);
		System.out.println("Balance REmained---> "+obj.balance);
		System.out.println("---------------------------------------------------");
		
		
	
		
		
	} 
	public static int getWithdrawDetails(Object account){
		Scanner cin = new Scanner(System.in);
		SavingAccount saveObj  = (SavingAccount)account;
		System.out.println("Give Withdraw number");
		
		saveObj.withdrawAmount=cin.nextInt();
		
		return saveObj.balance-saveObj.withdrawAmount;
		
		
		
		
		
		
	} 


}
