package poly;

public class Overloading {
	
	public void addition(int a, int b)
	{
		int sum =a+b;
		
		System.out.println(sum);
	}
	public void addition(String name)
	{
		System.out.println(name);
	}
	
	
		public static void main(String[] args) {

		Overloading ref = new Overloading ();
       
		 ref.addition(10,20);
		 
		  ref.addition("pallavi");      	
		  
	}
		

}
