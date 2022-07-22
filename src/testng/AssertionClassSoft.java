package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClassSoft {
	WebDriver driver;
	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//step-1
		//launch browser
		driver=new ChromeDriver();
		//step-2
		//maximum window
		driver.manage().window().maximize();
		//step-3 open web application
		driver.get("https://www.facebook.com/");
	}
		@Test
		public void verifyTitle() {
			System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "facebook log in");
		}
		@Test
		public void verifyButton() {
			boolean state=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
			
		
		//soft assert
		SoftAssert sa=new SoftAssert();
		sa.assertFalse(state,"Button is not enabled");
		System.out.println("After assert statements");
		sa.assertAll();
		}

		@AfterClass
		public void tearDown()throws InterruptedException{
			Thread.sleep(8000);
			driver.close();
		}

		}
		
		
		

