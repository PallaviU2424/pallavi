package pom;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

public class Logintest {
	
	WebDriver driver;
	LoginPage lp;
	@BeforeClass
	public void intiObject() {
		lp=new LoginPage(driver);
	}
	
	
	
	
	
	
	
	
	

}
