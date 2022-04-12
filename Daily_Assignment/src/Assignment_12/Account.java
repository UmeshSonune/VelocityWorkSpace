package Assignment_12;

public class Account {
	int  accountNumber;
	String accountName;
	public void setAccountDetails(int  accountNumber ,String accountName ) {
		
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		
	}
	
	 public void getAccountInformation() {
		 System.out.println("Account Number-->    "+accountNumber);
		 System.out.println("Account Name-->  "+accountName);
		 
		 
	 }


}
