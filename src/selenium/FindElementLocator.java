package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementLocator {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pallavi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//step-1 launch browser
      WebDriver driver=new ChromeDriver();
      //step-2  max window
      driver.manage().window().maximize();
     // step-3 open web
      driver.get("https://www.facebook.com/");
      Thread.sleep(2000);
     // step-4 webelement
      WebElement button = driver.findElement(By.xpath("//input[@id='btnLogin']"));
      // Button.click();
     // step-5 find multiple element
        List<WebElement> links = driver.findElements(By.tagName("a"));
        int no=links.size();
        System.out.println("No of links are = " + no);
        for(WebElement ele: links)
        {
        	String name=ele.getText();
        	
        System.out.println(name);
        
       if(name.equals("create page")) {
    	   ele.click();
    	   break;
       }
       }
       Thread.sleep(3000);
     //  step-8 close browser
       driver.close();
   }

}
