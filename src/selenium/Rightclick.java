package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty ("webdriver.chrome.driver","C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//step1
		WebDriver driver=new ChromeDriver();
		//step2
		driver.manage().window().maximize();
		//step3
		driver.get("https://demoqa.com/buttons");
		//step4
		WebElement rightClickButton=driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		//step5
		Actions act=new Actions(driver);
		//right click
		act.contextClick(rightClickButton);
		WebElement button1=driver.findElement(By.xpath("//*[@id='rightClickMessage']"));
		String messageDoubleClick = button1.getText();
		Object message = null;
		//step6
		if(message.equals("You have done a right click")) {
			System.out.println("testc case pass");
		}else {
			System.out.println("test case failed");
		}
	//step7
		Thread.sleep(8000);
		driver.close();

	}

}
