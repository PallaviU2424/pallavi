package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;

public class ScreenShot {
	public void captureScreen() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	//step1
		WebDriver driver=new ChromeDriver();
    //step2
		driver.manage().window().maximize();
    //step3
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
    //capture screenshot
		TakesScreenshot tss=(TakesScreenshot)driver;
	File source=tss.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\Pallavi\\eclipse-workspace\\velocity project\\Screenshot\\screen.png");
		FileHandler.copy(source, file);
		System.out.println("ScreenShot captured successfully");
	}
		
		public static void main(String[] args)throws InterruptedException, IOException {
	ScreenShot sc=new ScreenShot();
	    sc.captureScreen();

	}

		public void captureScreen(WebDriver driver, String name)throws InterruptedException,IOException {
		TakesScreenshot tss=(TakesScreenshot)driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
		System.out.println(System.getProperty("user.dir"));
		File file=new File(System.getProperty("user.dir")+"\\Screenshot\\"+name+".png");
		FileHandler.copy(source, file);
		System.out.println("ScreenShot captured successfully");

		}

}
