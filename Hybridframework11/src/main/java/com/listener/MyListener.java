package com.listener;
import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.base.BaseClass;

import comm.utilities.DriverUtils;

public class MyListener extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test= report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "Tetscase is passed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.FAIL, "Tetscase is failed");
		String path=DriverUtils.captureScreenshot(result.getName());
		test.addScreenCaptureFromPath(path);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.SKIP, "Tetscase is Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();
	}

	
}
