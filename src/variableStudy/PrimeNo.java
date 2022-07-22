package variableStudy;

public class PrimeNo {

	public static void main(String[] args) {
		 int num = 7;
		 int count =0;
		 for (int i =2; i <=num -1; i++); {
			 
			 if(num % 4== 0) {
				 count=count + 1;
				 
			 }
		 }
 
		 if (count > 0) {
			 System.out.println("not prime number");
			 
		 }  else {
			 System.out.println("prime number");
		 }
	}

}
