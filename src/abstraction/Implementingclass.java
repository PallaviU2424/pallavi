package abstraction;

public class Implementingclass extends Ab1 {
	

public Implementingclass() {
	  super(10);
	  super.x=10;
	   System.out.println("implementing class constractor");
	   System.out.println(super.x);
}
	
	public static void main(String[] args) {
		Implementingclass ref=new Implementingclass();
           ref.m1();
	}
           void m1() {
        	  // method stub
        	   System.out.println("implemention of m1");
        	 
           }       
		   
	}


