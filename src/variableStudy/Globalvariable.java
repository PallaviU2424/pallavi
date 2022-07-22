package variableStudy;

public class Globalvariable {
	int x;
	int a=20;
    static int k=30;
	public static void main(String[] args) {
		int y=10;
		int b;
		
		  Globalvariable var=new Globalvariable();
		var.x=y;        // By using local variable innitaliz the global variable (non static)
		 System.out.println("value of Global var X is" +var.x);
		      // By using global variable inniatliz the global variable (non static)
		 
		 b=var.a;
		 System.out.println("value of local var b is" +b);
		       //By using local variable initalize the global variable (static)
		 
		
		 System.out.println("value of global static variable K is"+y);
		         // By using local variable  initalize the global variable (static)
		 
		 y=k;
				 System.out.println("value of local variable y is"+k+"which is nothing but global var k's value");
		 

	}

}
