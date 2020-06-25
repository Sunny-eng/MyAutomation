package com.webarooAutomation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/***
 * 
 *@author Sunny-eng
 * GupshupCustomTestListener class implemetns ITestListener and responsible for below task:
 * 1. Taking screenshot on test failure
 */
public class GupshupCustomTestListener implements ITestListener {

	String filePath = System.getProperty("user.dir") + File.separator + "Screenshot";
	WebDriver driver;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("-------------------------------------------------------");

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Setting Test Parameter to False");
		SeleniumDriver.setStatusExecution(false);
		System.out.println("***** Error " + result.getName() + " test has failed *****");
		String methodName = result.getName().toString().trim();
		takeScreenShot(methodName);
		System.out.println("-------------------------------------------------------");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("-------------------------------------------------------");

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void takeScreenShot(String methodName) {
		// get the driver
		driver = SeleniumDriver.getDriver();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in d drive with test method name
		try {
			String fileName = filePath + File.separator + methodName + "_" + RandomStringUtils.randomAlphanumeric(5)
					+ ".png";
			FileUtils.copyFile(scrFile, new File(fileName));
			System.out.println("***Screenshot taken at " + fileName + " ***");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
