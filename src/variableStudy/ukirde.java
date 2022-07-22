package variableStudy;

public class ukirde {
	
	String name = "pallavi";
	int rollno =24;
	char batch ='B';

	public void variableStudy()            // created method 
	{
		System.out.println( "my name is " + name );
		System.out.println("my rollno is " + rollno );
		System.out.println("my batch is "+ batch );    	  
		
		
	}

	public static void main(String[] args) {
	
		ukirde uk = new ukirde();         // created object
		  uk.variableStudy();            // calling the method
		 
		
		
	}
	

		

	}


