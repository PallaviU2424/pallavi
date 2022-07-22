package poly;

public class child extends parent {
	  public void marry() {
		  System.out.println("pallavi");
	  }

	public static void main(String[] args) {
	    parent p=new parent(); 
		 p.marry();
		
		child c=new child();
        c.marry();
	}

}
