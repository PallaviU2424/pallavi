package variableStudy;

public class newmethod {

	public static void main(String[] args) 
    {
	addition();                             // calling static method in same class
	
	newmethod nm = new newmethod();         // calling non static method in same class
	nm.subtraction();

	}

	public static void addition()                // static regular method
	{
		int a=3;
		int b=77;
		int add = a+b;
		System.out.println(" addition is " + add);
		
		
	}
	public void subtraction()                     // non static method
	{
		int x=34;
		int y =22;
		int sub =x-y;
		System.out.println("subtraction is " + sub);
		
		
		
	}
	
	
	
}
