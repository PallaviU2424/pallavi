package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
  WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");

		
	}

}