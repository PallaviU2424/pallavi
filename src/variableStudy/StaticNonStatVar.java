package variableStudy;

public class StaticNonStatVar {

	 int x=11;                       // non static variable
	  int y=13;                               // non static/instance variables
	int sum =x+y;

	  static int a=22;
	  static int b=8;
	  static int sub =a-b;
	
	public void Add()                          // non static method
	{
		
		System.out.println("addition is " + sum);
	}
	
	
	public static void sub1()
	{
		System.out.println("subtraction is " + sub);
	}
	
	
	
	
	public static void main(String[] args) {

		StaticNonStatVar var = new StaticNonStatVar();
		var.Add();
		
		sub1();
	}

}
