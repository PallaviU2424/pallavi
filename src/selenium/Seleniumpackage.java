package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Seleniumpackage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//step-1 Launcha browser
		WebDriver driver=new ChromeDriver();
		//step-2 max window
		driver.manage().window().maximize();
		//step-3open web application
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//step-4 navigate to new webpage //alternate to get method
		driver.navigate().to ("https://www.google.com/");
		Thread.sleep(2000);
		//step-5 Go backward
		driver.navigate().back();
		Thread.sleep(2000);
		//step-6 move forward
		driver.navigate().forward();
		//step-7 refresh page
		driver.navigate().refresh();
		//step-8 close browser
		driver.close();
		
		System.out.println("sample selenium program");
		

	}

}
