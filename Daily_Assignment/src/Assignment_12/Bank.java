package Assignment_12;

public class Bank {
	double  principleAmount; 
	int tenure ;
	float rateOfInterest ;
	void setBank(double principleAmount,int t,float r) {
		this.principleAmount = principleAmount;
		tenure = t;
		rateOfInterest=r;
		
	}
	 void getBank() {
		System.out.println("Principle Amount-->"+principleAmount);
		System.out.println("Time-->  "+tenure);
		System.out.println("Rate Of Interest--> "+rateOfInterest);
	}

}
