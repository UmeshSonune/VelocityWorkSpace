package Assignment_16;

public class Product {
	 void productCheck(int weight) {
		 try {
		 if(weight<100) {
			 throw new ProductException("The weight is very very lowwwwww");
		 }
		 else {
			 System.out.println("weight is good");
		 }
		 }
		 catch(ProductException e) {
			 System.out.println("Weight is catched");
		 }
		 catch(RuntimeException e) {
			 System.out.println("next excp");
		 }
		 finally {
			 System.out.println("Finally Run");
		 }
		 
	 }

}
