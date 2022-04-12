package Assignment_15;

import java.util.Scanner;

class Policy{
	 public int policy_id; 
	 public String policy_name; 
	 public String policy_type; 
	 public int Preminum_Amount;
	 
	 public Policy getPolicyDetails() {
		 
		 
		 Scanner cin = new Scanner(System.in);
		 
		 Policy obj = new Policy();
		 System.out.print("Give Policy ID ");
		 obj.policy_id = cin.nextInt();
		 System.out.println("Give Policy Name");
		 obj.policy_name = cin.next();
		 
		 System.out.println("Give Policy Type");
		 obj.policy_type = cin.next();
		 System.out.println("Give Policy Amount");
		 obj.Preminum_Amount = cin.nextInt();
		 
		 return obj;
		 }

	@Override
	public String toString() {
		return "Policy [policy_id=" + policy_id + ", policy_name=" + policy_name + ", policy_type=" + policy_type
				+ ", Preminum_Amount=" + Preminum_Amount + "]";
	}
	  
}


public class MAIN {

	public static void main(String[] args) {
		Policy call = new Policy();
		Policy obj =call.getPolicyDetails();
		System.out.println("Policy ID--->  "+obj.policy_id);
		System.out.println("Policy Name---> "+obj.policy_name);
		System.out.println("Policy Type-->  "+obj.policy_type);
		System.out.println("Preminum_Amount-->"+obj.Preminum_Amount);
		//System.out.println(obj);
		System.out.println(obj.toString());
		
		
		
		}
	

}
