package Assignment_12;

import java.util.Scanner;

public class MainBank {
	public static void main(String[]args) {
		Scanner cin = new Scanner(System.in);
		
		ICICIBank i = new ICICIBank();
		SBIBank s = new SBIBank();
		HDFCBank h = new HDFCBank();
		
		
		System.out.println("give Amount");
		double principleAmount = cin.nextDouble();
		System.out.println("Give Time");
		int tenure = cin.nextInt();
		System.out.println("RAte OF Interest");
		float rateOfInteres  =cin.nextFloat();
		
		i.setBank(principleAmount,tenure,rateOfInteres);
		double interesti = i.getCalculateInterest(principleAmount,tenure,rateOfInteres);
		
		i.getICICIBankDetails();
		System.out.println("For ICICI BANK  "+interesti);
		
		
		h.setBank(principleAmount,tenure,rateOfInteres);
		double interesth = h.getCalculateInterest(principleAmount,tenure,rateOfInteres);
		h.getHDFCBankDetails();
		System.out.println("FOR HDFC BANK  "+interesth);
		
		s.setBank(principleAmount,tenure,rateOfInteres);
		double interests = s.getCalculateInterest(principleAmount,tenure,rateOfInteres);
		s.getSBIBankDetails();
		System.out.println("FOR SBI BANK  "+interests);
		
		
		
		
		
		
	}

}
