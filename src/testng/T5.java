package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNgListerners1.class)

public class T5 {
public static WebDriver driver;	

    @BeforeClass
    public void init()throws InterruptedException{
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    //step1
    	driver=new ChromeDriver();
    	//step2
    	driver.manage().window().maximize();
    	//step3
    	driver.get("https://www.facebook.com/");
    	Thread.sleep(2000);
    }
    @Test (priority=1)
	public void verifyTitle() {
		System.out.println("Verify Title Test Case");
		Assert.assertEquals(driver.getTitle(), "Facebook – lr sign up");
	}
	
	@Test (priority=2)
	public void verifyurl() throws InterruptedException {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		System.out.println("Verify URL Test Case");
		Assert.assertEquals(driver.getCurrentUrl(),"https:ebook.com/");
	}
	public void onTestSkipped() {
		// TODO Auto-generated method stub
		
	}
	
		
	
    
    
    
    
    
    
    
    
    
    
     









}
