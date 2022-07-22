package variableStudy;

public class Returntype {

	public static void main(String[] args) {
		int x=1234;
		int reminder=0;
		int rev =0;
		
		 while (x!=0)  {
			 
			 reminder=x%10;
			 
			rev=rev*10+reminder;
		x=x/10;
		
			
		 }
		 
  System.out.println(rev);
  
  		
  
	}

}
