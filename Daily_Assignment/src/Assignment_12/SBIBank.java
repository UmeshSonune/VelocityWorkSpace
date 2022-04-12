package Assignment_12;

public class SBIBank extends Bank{
	double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double Interest = (principleAmount*tenure*rateOfInterest)/100;
		return Interest;
	}
	void getSBIBankDetails(){
		System.out.println("--------SBI-----------");
		getBank();
		//System.out.println("Interest For ICICI bank"+Interest);
		
	}

}
