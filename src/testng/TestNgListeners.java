package testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on Test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("on Test failure");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test skipped");
		
	}
		

	}


