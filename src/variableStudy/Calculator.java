package variableStudy;

public class Calculator {
         int firstNo=20;                        //static variable
         int secondNo=30;
         
         public void summation() {             // action methods
        	 
        	 int sumofNo= firstNo+secondNo;
        	 System.out.println( "summation is"  + sumofNo );
         }
         
         
	
	
	
	public static void main(String[] args) { 
		
          Calculator variable=new Calculator();     //object creation
	                 variable.summation();             //calling    
	}

}

