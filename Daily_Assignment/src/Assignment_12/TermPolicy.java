package Assignment_12;

public class TermPolicy extends LifeInsurance {
	int duration;
	void setTermPolicyDetails(int duration) {
		this.duration=duration;
		
	}
	void getTermPolicyInformation() {
		getInsuranceInformation();
		getLifeInsuranceInformation();
		System.out.println("Duration for Term-->>  "+duration);
	}

}
