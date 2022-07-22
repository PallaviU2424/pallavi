package variableStudy;
          
     //we can return output from static method.
public class Methodstate3 {
        public static int m3(int x, int y)
        {       
        int add=x+y;
        return add;
        }  
	
	public static void main(String[] args) {
	     System.out.println(m3(10,20));                   // calling static method by name

	}

}
