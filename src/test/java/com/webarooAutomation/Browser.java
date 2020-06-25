package com.webarooAutomation;

//@author Sunny-eng
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Browser {
	// Class 1
	private WebDriver driver;

	String mytext = "";
	String Live = "";
	public static String date;
	String emailId = "";

	@BeforeSuite
	public void setupAutomationData() throws IOException {

		// clean failure screenshot for previous run
		System.out.println("Clean Screenshot directory");
		FileUtils.deleteDirectory(new File(System.getProperty("user.dir") + File.separator + "Screenshot"));

		// read the config file and set BO
		FileReader reader = new FileReader(getClass().getClassLoader().getResource("config.properties").getPath());
		Properties p = new Properties();
		p.load(reader);
		SeleniumDriver.setProperty(p);

	}

	@Test(priority = 0)
	public void OpenBrowser() throws IOException {
		try {
		System.out.println("Inside first tests");
		/*
		 * driver = new FirefoxDriver(); driver.get(p.getProperty("url"));
		 * System.out.println(p.getProperty("url"));
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 */
		String urlWeb = System.getProperty("url");
		System.out.println("url = "+urlWeb);
		String browser = System.getProperty("browser");
		if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
			driver.get(urlWeb);

		} else if (browser.equals("Chrome")) {
			String driverPath = "/var/tmp/BrowserExecutable";
			System.setProperty("webdriver.chrome.driver",
					driverPath + File.separator + "chrome" + File.separator + "chromedriver");
			driver = new ChromeDriver();
			driver.get(urlWeb);
		} else if (browser.equals("Opera")) {

			System.setProperty("webdriver.opera.driver", "");
			driver = new OperaDriver();
			driver.get(urlWeb);

		} else if (browser.equals("remote_chrome")) {
			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setBrowserName("chrome");
			// driver1 = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
			driver = new RemoteWebDriver(new URL("http://windowsqa.gupshup.io/wd/hub"), caps);
			driver.get(urlWeb);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String urlBrowser = driver.getCurrentUrl();
		Assert.assertTrue(urlBrowser.contains(urlWeb), "Failed to validate launched browser url, check manually");
		System.out.println("URL is launched on browser i.e. " + urlBrowser);
		Reporter.log("URL is launched on browser i.e. " + urlBrowser);
		SeleniumDriver.setDriver(driver);
		} catch(Exception e ) {
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void tearDown() {
		driver = SeleniumDriver.getDriver();
		driver.close();
		driver.quit();
	}
}
