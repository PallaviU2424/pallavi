package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class T2 {
  @Test
  public void Test1() {
	  System.out.println("simpl test1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Beforetest");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Aftertest");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }

}
