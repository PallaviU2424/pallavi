package poly;

public class P1 {
	   
	public void M1 ()
	{
		System.out.println("M1 method no argument");
	}
     
	public void M1 (int a)
	{
		 System.out.println("M1 method with intiger type");
	}
     
	public void M1 (String s)
	{
		System.out.println("M1 method string type argument");
	}
	public static void main(String[] args) {
		 
		 
		 P1 ref = new P1();
		 
		 ref .M1("hi");
		 ref.M1();
		 ref.M1(10);
		 		
	
		
	}

}
