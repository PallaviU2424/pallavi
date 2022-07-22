package variableStudy;
             //static method can accept the parameters.

public class Methodstat2 {
	
       public static void m2(int x, int y, int z)
       {
    	        int sum=x+y;
    	        System.out.println(sum);
    	       
    	        System.out.println(z);
    	        System.out.println(y);
    	        
      }
       /*
        public static void m3(int p)
        {
            System.out.println(p);
         }
       */
       
       
       public static void main(String[] args) {
    	   
		m2(10,20,30);                    //calling static method by name
	                              //m3(40);
		
		
		

	}

}
