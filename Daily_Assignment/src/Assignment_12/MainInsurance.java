package Assignment_12;

import java.util.Scanner;

public class MainInsurance {
	public static void main(String[] args) {
		
	
	
	Scanner cin = new Scanner(System.in);
	TermPolicy policy = new TermPolicy();
	
	System.out.print("Enter ID");
	int id = cin.nextInt();
	
	System.out.println("Enter Person Name");
	String name  = cin.next();
	policy.setInsuranceDetails(id,name);
	
	
	System.out.print("Enter your Premium Amount");
	int amount = cin.nextInt();
	policy.setLifeInsuranceDetails(amount);
	
	
	System.out.print("Enter Duration");
	int time = cin.nextInt();
	policy.setTermPolicyDetails(time);
	
	policy.getTermPolicyInformation();
	
	cin.close();

	}
}