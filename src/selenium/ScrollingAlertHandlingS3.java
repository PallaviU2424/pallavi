package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingAlertHandlingS3 {

	public static void main(String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//step 1
		WebDriver driver= new ChromeDriver();
		
		//step-2
		driver.manage().window().maximize();
		
		//step-3
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//step-4
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		
		//step-5
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		//step-6
		driver .findElement(By.xpath("//input[@id='confirmbtn']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	    driver.close();
		

	}

}
