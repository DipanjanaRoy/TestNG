package packageTwo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Tests ran successfully" + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Tests Failed" + result.getName());
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onTestFinish(ITestResult result) {
		
	}
//	public void onTestFailedUtilitiesSuccessPercentage(ITestResult result) {
//		
//	}

	
}
