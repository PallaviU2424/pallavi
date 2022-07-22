package testng;

import java.io.IOException;
import java.util.regex.MatchResult;

import org.testng.ITestListener;
import org.testng.ITestResult;

import selenium.ScreenShot;

public class TestNgListerners1 extends T5 implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success");
  }
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test Failure");
	
	//calling screenShot statement
    String name=result.getName();
   System.out.println(name);
   ScreenShot sc=new ScreenShot();
   
   try {
	   sc.captureScreen(driver,name);
   } catch
   (InterruptedException| IOException e) {
	   e.printStackTrace();
   }
	}
   @Override
   public void onTestSkipped (ITestResult result){
	   System.out.println("on Test Skipped");
   }
}
   
   
	
   
   
   
   