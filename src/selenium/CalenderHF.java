package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHF {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//step-1
		WebDriver driver=new ChromeDriver();
		//step2
		driver.manage().window().maximize();
	 
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		//step-3 
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		//step-4
		//frame=driver.findElement(By.xpath("))
		
		

	}

}
