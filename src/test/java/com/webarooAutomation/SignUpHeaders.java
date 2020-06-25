package com.webarooAutomation;

//@author Sunny-eng

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpHeaders {
	// class 2

	@Test(priority = 1)
	public void SignupPageHeadders() throws InterruptedException, AWTException {

		WebDriver driver = SeleniumDriver.getDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		WebElement element = driver.findElement(By.xpath(".//ul[contains(@class,'right hide-on-med-and-down')]//a[text()='About us']"));

		String text = element.getText();

		Assert.assertEquals("About us", text);

		if (text.equals("About us")) {

			System.out.println("Passed Header from signup page is :- " + text);
		} else {

			System.out.println("Given header is not matched with default header :- " + text);
		}

		// Feature
	//	WebElement element2 = driver.findElement(By.xpath("html/body/div[3]/nav/div/div/div/ul[1]/li[2]/a"));
		
		WebElement element2 = driver.findElement(By.xpath("//*[@class='right hide-on-med-and-down']/descendant::li[2]"));   
		
		
		String text1 = element2.getText();

		Assert.assertEquals("Features", text1);

		if (text1.equals("Features")) {

			System.out.println("Passed Header from signup page is  :- " + text1);
		} else {
			System.out.println("Given header is not matched with default header :- " + text1);
		}

		// Contact us

		WebElement element3 = driver.findElement(By.xpath("//*[@class='right hide-on-med-and-down']/descendant::li[3]"));

		String text2 = element3.getText();

		Assert.assertEquals("Contact us", text2);

		if (text2.equals("Contact us")) {

			System.out.println("Passed Header from signup page is  :- " + text2);
		} else {

			System.out.println("Given header is not matched with default header :- " + text2);
		}
		// Login

		WebElement element4 = driver.findElement(By.xpath("//*[@class='right hide-on-med-and-down']/descendant::li[4]"));

		String text3 = element4.getText();

		Assert.assertEquals("Login", text3);

		if (text3.equals("Login")) {

			System.out.println("Passed Header from signup page is  :- " + text3);
		} else {

			System.out.println("Given header is not matched with default header :- " + text3);
		}
		// SignUp

		WebElement element5 = driver.findElement(By.xpath("//*[@class='right hide-on-med-and-down']/descendant::li[5]"));

		String text4 = element5.getText();

		Assert.assertEquals("SIGNUP", text4);

		if (text4.equals("SIGNUP")) {

			System.out.println("Passed Header from signup page is  :- " + text4);
		} else {

			System.out.println("Given header is not matched with default header :- " + text4);
		}

		// About us

		WebElement element6 = driver.findElement(By.xpath("//*[@class='copyright'] /following::li[1]"));

		String text5 = element6.getText();

		Assert.assertEquals("About us", text5);

		if (text5.equals("About us")) {

			System.out.println("Passed Header from signup page is  :- " + text5);
		} else {

			System.out.println("Given header is not matched with default header :- " + text5);
		}
		// Term & condition

		WebElement element7 = driver.findElement(By.xpath("//*[@class='copyright'] /following::li[2]"));

		String text6 = element7.getText();

		Assert.assertEquals("Terms and Conditions", text6);

		if (text6.equals("Terms and Conditions")) {

			System.out.println("Passed Header from signup page is  :- " + text6);
		} else {

			System.out.println("Given header is not matched with default header :- " + text6);
		}
		// API

		WebElement element8 = driver.findElement(By.xpath("//*[@class='copyright'] /following::li[3]"));

		String text7 = element8.getText();

		Assert.assertEquals("API", text7);

		if (text7.equals("API")) {

			System.out.println("Passed Header from signup page is  :- " + text7);
		} else {

			System.out.println("Given header is not matched with default header :- " + text7);
		}
		// Contact US

		WebElement element9 = driver.findElement(By.xpath("//*[@class='copyright'] /following::li[4]"));

		String text8 = element9.getText();

		Assert.assertEquals("Contact Us", text8);

		if (text8.equals("Contact Us")) {

			System.out.println("Passed Header from signup page is  :- " + text8);
		} else {
			System.out.println("Given header is not matched with default header :- " + text8);
		}

	}
}
