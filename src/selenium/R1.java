package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class R1 {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
      //step-1
		WebDriver driver=new ChromeDriver();
		//step-2
		driver.manage().window().maximize();
		//step-3
      driver.get("https://demoqa.com/buttons");
      Thread.sleep(2000);
      //step-4
      
	
	
	}

}
