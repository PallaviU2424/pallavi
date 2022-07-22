package testng;

import org.testng.annotations.Test;

public class G1 {
	@Test (groups="sanity")
	public void testcase1() {
		System.out.println("Test case 1");
	}	
	@Test (groups="sanity")
	public void testcase2() {
		System.out.println("test case 2");
	}
	@Test (groups="smoke")
	public void testcase3() {
		System.out.println("test case 3");
	}
	@Test (groups="smoke")
	public void testcase4() {
		System.out.println("test case 4");
	}
	
	
	
	
	
	
	

}
