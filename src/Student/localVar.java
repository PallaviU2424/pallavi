package Student;

public class localVar {
	
	
	int b=11;                         // non static global variable 

	public static void main(String[] args) {

		localVar lv = new localVar();     // calling non static regular method 
				lv.method();
				localVar ob = new localVar();    // calling non static global variable b
				System.out.println(ob.b);
		
	}

	public void method()      // non static regular method
	
	{
		int a =22;
	System.out.println("value of a is " + a);
	}
}
