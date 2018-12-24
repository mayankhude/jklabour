package org.dev.jklabour.commonLibS;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner  implements ITestListener{

	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		try {
			System.out.println("test failed and tastCases details are " +result.getName());
			ScreenShot.capture(result.getName());
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	   
	   
		
	}

	public void onTestSkipped(ITestResult result) {
		
	
		System.out.println("test Skipped and tastCases details are " +result.getName());
	}

	public void onTestStart(ITestResult result) {
		System.out.println("test Started and tastCases details are " +result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("test sucessfull and tastCases details are " +result.getName());
		
	}


}
