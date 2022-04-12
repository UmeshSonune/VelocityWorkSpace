package Assignment_12;

public class HDFCBank extends Bank {
	double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		double Interest = (principleAmount*tenure*rateOfInterest)/100;
		return Interest;
	}
	void getHDFCBankDetails(){
		System.out.println("--------HDFC-----------");
		getBank();
		//System.out.println("Interest For ICICI bank"+Interest);
		
	}

}
