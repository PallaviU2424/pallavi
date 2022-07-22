package variableStudy;
    import java.util.Scanner;
    
public class Switch1 {

	public static void main(String[] args) {
            
		Scanner sc=new Scanner(System.in);
		     System.out.println(5);
		     
		     int day=sc.nextInt();
				switch (day) {
				case 1:
					System.out.println("monday");
				case 2:
					System.out.println("tuesday");
				case 3:
					System.out.println("wensday");
				case 4:
					System.out.println("Friday");
				case 5:
					System.out.println("saturday");
				case 6:
					System.out.println("sunday");
					 
					default :
				   System.out.println("invalid input");  
				}
	}

}
