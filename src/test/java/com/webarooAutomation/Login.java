package com.webarooAutomation;

//@author Sunny-eng
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	// class 3

	@Test(priority = 2)
	public void login() throws InterruptedException, IOException {
		
		WebDriver driver = SeleniumDriver.getDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//ul[contains(@class,'right hide-on-med-and-down')]//a[text()='Login']")).click();
		// Login
		WebElement ele = driver.findElement(By.xpath(".//span[contains(text(), 'Login')]"));

		String txt = ele.getText();

		Assert.assertEquals("Login", txt);

		if (txt.equals("Login")) {

			System.out.println("Passed Header is :- " + txt);
		} else {

			System.out.println("Given header is not matched with default header :- " + txt);
		}
		//
		WebElement ele1 = driver.findElement(
				By.xpath(".//*[contains(@class,'signup')]//a[text()='Signup Now']"));

		String txt2 = ele1.getText();

		Assert.assertEquals("Signup Now", txt2);

		Assert.assertTrue(ele1.isDisplayed());

		System.out.println("Passed Header is :- " + txt2);

		driver.findElement(By.xpath(".//*[@id='user_id']")).sendKeys(System.getProperty("userId"));

		
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(System.getProperty("password"));

	
		driver.findElement(By.xpath(".//span[contains(text(), 'Login')]")).click();

	
	}
      
}
