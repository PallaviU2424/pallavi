package poly;

public class daughter extends mother { //extend key word
        
	public void m1() {
		
		System.out.println("playing");
	}
	
	public static void main(String[] args) {
		
		  mother m=new mother();          //parent reference and object
		  m.m1();

		     daughter d=new daughter();     //child reference and object

           d.m1();
                                     //parent reference & child object only possible when there is inheritance using extend keyword

           mother p=new daughter();     //object----only possible when there is inheritance using extend keyword
              p.m1();
            
            
	}

}
