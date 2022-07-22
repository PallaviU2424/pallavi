package exceptionHandling;

public class Classtest2 {

	public static void main(String[] args) {
		
      Classtest2 t=new Classtest2 ();
	
      t.divide();
       System.out.println("hello");
	}
	void divide()
	{  
		try 
		{
			int a=100, b=0, c;
			c=a/b;
			System.out.println("c");
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
	
	}

}
