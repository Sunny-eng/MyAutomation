package com.webarooAutomation;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
/***
 * 
 * @author Sunny-eng
 * SeleniumDriver class is responsible for below BO and its Setter/Getter
 * 1. Selenium Driver
 * 2. Property Config file Object
 * 3. Automation Execution Status
 * 
 */
public class SeleniumDriver {
	private static WebDriver driver;
	private static Properties property;
	private static boolean statusExecution = true;

	public static void setDriver(WebDriver driver) {
		SeleniumDriver.driver = driver;
	}

	public static WebDriver getDriver() {
		return SeleniumDriver.driver;
	}

	public static void setProperty(Properties property) {
		SeleniumDriver.property = property;
	}

	public static Properties getProperty() {
		return property;
	}
	
	public static void setStatusExecution(boolean statusExecution) {
		SeleniumDriver.statusExecution = statusExecution;
	}
	
	public static boolean isStatusExecution() {
		return statusExecution;
	}
	
}
