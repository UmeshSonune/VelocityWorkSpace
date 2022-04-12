package Assignment_12;

public class LifeInsurance extends Insurance {
	int premiumAmount;

	void setLifeInsuranceDetails(int premiumAmount) {
		 this.premiumAmount= premiumAmount;
		
	}
	void getLifeInsuranceInformation() {
		System.out.println("Premium Amount-->>"+premiumAmount);
	}


}
