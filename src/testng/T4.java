package testng;


import org.testng.Assert;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testng.TestNgListeners.class)
public class T4 {
	WebDriver driver;
	@BeforeTest
	public void init()throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//step1
driver=new ChromeDriver();
	//step2
driver.manage().window().maximize();
//step3
driver.get("https://vctcpune.com/selenium/practice.html");
	}
      
    	  
      
@Test (priority=1)
	public void verifyTitle() {
		System.out.println("Verify Title Test Case");
	Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");	
}
@Test (priority=2)
	public void verifyurl() {
		System.out.println("Verify URL Test Case");
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");	

	}



	
	
	
	
	
	}


