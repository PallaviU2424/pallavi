package exceptionHandling;

public class Ex1 {

	public static void main(String[] args) {
	System.out.println("hi");
try {
		System.out.println(10/0);
		
} catch(ArithmeticException e) {
	System.out.println("Handaled Arithmatic exception");
}
	System.out.println("hello");
	
	
	
	
	
	
	}

}
