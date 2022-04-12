package Assignment_12;

public class ICICIBank extends Bank{
	
	
	double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double Interest = (principleAmount*tenure*rateOfInterest)/100;
		return Interest;
		
		
	
	}
	void getICICIBankDetails(){
		System.out.println("--------ICICI-----------");
		getBank();
		
	}
}
