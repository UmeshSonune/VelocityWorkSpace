package Assignment_12;

public class Insurance {
	int id;
	String personName;
	
	void setInsuranceDetails(int id, String personName) {
		this.id=id;
		this.personName=personName;
		
	}
	void getInsuranceInformation() {
		System.out.println("ID of Person-->  "+id);
		System.out.println("Name of Person-->  "+personName);
	}


}
