package Assignment_12;

public class SavingAccount extends Account{
	String accountType;
	long balance;
	public void setSavingAccountDetails(String accountType,long balance) {
		this.accountType = accountType;
		this.balance = balance;
		}
	
	 public void getSavingAccountInformation() {
		 System.out.println("Account Type-->  "+accountType);
		 System.out.println("Account Balance-->  "+balance);
		 
		 
	 }



}
