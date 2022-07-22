package poly;

public class Test {
       public void method (int a)
       {
    	   System.out.println("intiger method");
       }

  public void method (String a)
  {
           System.out.println("string method");
	  
  }
	public static void main(String[] args) {
		
        Test t=new Test();
        
        t.method(100);
      
       t.method("abc");
	}

}
