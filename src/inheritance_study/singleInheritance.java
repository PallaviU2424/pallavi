package inheritance_study;

public class singleInheritance {

	public static void main(String[] args)
	{

    	Mother m = new Mother();
		m.beauty();
		m.cooking();
//		
		
		son s = new son();         // son's object
		s.beauty();
		s.bike();
		s.cooking();
		s.mobile();
		
	}

}
