package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgclass1 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Beforemethod");
}
	@Test
 public void testCase1() {
	  System.out.println("Sample Test case 1");
  }
	@Test
	 public void testCase2() {
		  System.out.println("Sample Test case 2");
	  }
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	@BeforeClass
	public void beforeClass () {
		System.out.println("BeforeClass");
		}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	}
	


