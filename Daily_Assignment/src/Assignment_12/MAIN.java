package Assignment_12;

import java.util.Scanner;

public class MAIN {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		
		
		SavingAccount sa = new SavingAccount();
		System.out.println("give account number");
		int acc = cin.nextInt();
		
		System.out.println("give account Name");
		String name = cin.next();
		
		sa.setAccountDetails(acc,name);
		
		
		System.out.println("Give Account Type");
		String type = cin.next();
		System.out.println("Give Account balance");
		long bal = cin.nextLong();
		sa.setSavingAccountDetails(type,bal);
		
		sa.getAccountInformation();
		sa.getSavingAccountInformation();
		
		cin.close();
		
		

	}

}
