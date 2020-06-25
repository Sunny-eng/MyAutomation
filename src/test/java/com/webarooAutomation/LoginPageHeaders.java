package com.webarooAutomation;
// @author Sunny-eng
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageHeaders {
	// Class 4

	@Test(priority = 3)
	public void loginPageHeaders() throws InterruptedException {

		WebDriver driver = SeleniumDriver.getDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

		// Recharges Account
		 Thread.sleep(8000);
		
		 WebElement ID = driver.findElement(By.id("campaignId"));
			String value = ID.getText();
			Assert.assertEquals(value, "Campaign");
			System.out.println("Passed Header from login page is :-" + value);
			Assert.assertTrue(ID.isDisplayed(), "Given Header not found :- Campaign ");

			// MailingList

			WebElement ID1 = driver.findElement(By.id("mailingId"));
			String value1 = ID1.getText();
			Assert.assertEquals(value1, "Mailing List");
			System.out.println("Passed Header from login page is :-" + value1);
			Assert.assertTrue(ID1.isDisplayed(), "Given Header not found :- Mailing List ");

			// Reports  reportId

			WebElement ID2 = driver.findElement(By.id("reportId"));
			String value2 = ID2.getText();
			Assert.assertEquals(value2, "Reports");
			System.out.println("Passed Header from login page is :-" + value2);
			Assert.assertTrue(ID2.isDisplayed(), "Given Header not found :- Reports ");

			// historyId

			WebElement ID3 = driver.findElement(By.id("historyId"));
			String value3 = ID3.getText();
			Assert.assertEquals(value3, "History");
			System.out.println("Passed Header from login page is :-" + value3);
			Assert.assertTrue(ID3.isDisplayed(), "Given Header not found :- History");		
	
			Thread.sleep(6000);
				
			driver.findElement(By.id("gupshuplogo")).sendKeys(Keys.PAGE_DOWN);	
		
			WebElement ID7 = driver.findElement(By.xpath(".//label[@for='enterEmailId']"));
			String value7 = ID7.getText();
			Assert.assertEquals(value7, "Enter Email Ids");
			System.out.println("Passed Header from login page is :-" + value7);
			Assert.assertTrue(ID7.isDisplayed(), "Given Header not found :- Enter Email Ids");   

			// Select Mailing List

			WebElement ID8 = driver.findElement(By.xpath(".//label[@for='selectEmailId']"));
			String value8 = ID8.getText();
			Assert.assertEquals(value8, "Select from mailing list");
			System.out.println("Passed Header from login page is :-" + value8);
			Assert.assertTrue(ID8.isDisplayed(), "Given Header not found :- Select from mailing list");

			// Upload List

			WebElement ID9 = driver.findElement(By.xpath(".//label[@for='uploadEmailId']"));
			String value9 = ID9.getText();
			Assert.assertEquals(value9, "Upload list of Email Ids");
			System.out.println("Passed Header from login page is :-" + value9);
			Assert.assertTrue(ID9.isDisplayed(), "Given Header not found :- Upload list of Email Ids");

			// Subject
			
		//	  WebElement id1 = driver.findElement(By.xpath("//input[@id='subject']"));
			//  String val1 = id1.getText(); Assert.assertEquals(val1, "Subject");
			  //System.out.println("Passed Header from login page is :-" + val1);
			 // Assert.assertTrue(id1.isDisplayed(),"Given Header not found :- Subject" );
			 

			// Write Content   Write Content

			WebElement ID10 = driver
					.findElement(By.xpath(".//div[@id='mailbodyDiv']/preceding-sibling::ul[2]//a[text()='Write Content']"));
			String value10 = ID10.getText();
			Assert.assertEquals(value10, "Write Content");
			System.out.println("Passed Header from login page is :-" + value10);
			Assert.assertTrue(ID10.isDisplayed(), "Given Header not found :- Write Content");

			// News letter

			WebElement ID11 = driver
					.findElement(By.xpath("//div[@id='mailbodyDiv']/preceding-sibling::ul[2]//a[text()='Upload Newsletter']"));
			String value11 = ID11.getText();
			Assert.assertEquals(value11, "Upload Newsletter");
			System.out.println("Passed Header from login page is :-" + value11);
			Assert.assertTrue(ID11.isDisplayed(), "Given Header not found :- Upload Newsletter");

			// Attachment

			WebElement ID12 = driver
					.findElement(By.xpath(".//span[text()='Attach file']"));
			String value12 = ID12.getText();
			Assert.assertEquals(value12, "Attach file");
			System.out.println("Passed Header from login page is :-" + value12);
			Assert.assertTrue(ID12.isDisplayed(), "Given Header not found :- Attach file");

			// Send Now

			WebElement ID13 = driver
					.findElement(By.xpath(".//label[@for='sendNowRadioBtn']"));
			String value13 = ID13.getText();
			Assert.assertEquals(value13, "Send Now");
			System.out.println("Passed Header from login page is :-" + value13);
			Assert.assertTrue(ID13.isDisplayed(), "Given Header not found :- Send Now");

			// Schedule

			WebElement ID14 = driver
					.findElement(By.xpath(".//label[@for='scheduleRadioBtn']"));
			String value14 = ID14.getText();
			Assert.assertEquals(value14, "Schedule");
			System.out.println("Passed Header from login page is :-" + value14);
			Assert.assertTrue(ID14.isDisplayed(), "Given Header not found :- Schedule");

			// Save

			/*
			  Thread.sleep(3000); WebElement id2 =
			  driver.findElement(By.xpath("//input[@type='button'  and @value= 'Save' ]")); 
			  String val2 = id2.getText(); Assert.assertEquals(val2, "Save");
			  System.out.println("Passed Header from login page is :-" + val2);
			  Assert.assertTrue(id2.isDisplayed(),"Given Header not found :- Save");
			  
			  
			  // Reset
			  
			  Thread.sleep(3000); 
			  WebElement idd =driver.findElement(By.xpath(".//div[text()='Reset']"));
			  driver.findElement(By.xpath("//input[@type='button'  and @value= 'Reset']")); 
			  String val3 = idd.getText(); Assert.assertEquals(val3, "Reset");
			  System.out.println("Passed Header from login page is :-" + val3);
			  Assert.assertTrue(idd.isDisplayed(),"Given Header not found :- Reset");  */

			// SEND

			WebElement ID15 = driver.findElement(By.xpath(".//span[contains(text(),'SEND')]"));
			String value15 = ID15.getText();
			Assert.assertEquals(value15, "SEND");
			System.out.println("Passed Header from login page is :-" + value15);
			Assert.assertTrue(ID15.isDisplayed(), "Given Header not found :- SEND");
			
			
			driver.findElement(By.id("gupshuplogo")).sendKeys(Keys.PAGE_UP);	
			
			
			
			WebElement ID01 = driver.findElement(By.xpath(".//*[@class='col']//a[text()='Recharge Account']"));
			String value03 = ID01.getText();
			Assert.assertEquals(value03, "Recharge Account");
			System.out.println("Passed Header from login page is :-" + value03);
			Assert.assertTrue(ID01.isDisplayed(), "Given Header not found :- Recharge Account");
			
			driver.findElement(By.xpath(".//*[@class='col']//a[text()='Recharge Account']")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.xpath("//input[@value='Email' and @class='select-dropdown']")).click();
			Thread.sleep(2000);
			WebElement bal = driver.findElement(By.xpath(".//span[text()='Email' or @class = 'active']"));
			String rc = bal.getText();
			Assert.assertEquals(rc, "Email");
			System.out.println("Passed Header from recharge page is :-" + rc);
			Assert.assertTrue(bal.isDisplayed(), "Given Header not found :- Email");

			// Transaction Email

			driver.findElement(By.xpath(".//input[@value='Transactional Email']")).click();
			Thread.sleep(2000);
			WebElement bal2 = driver.findElement(By.xpath(".//span[text()='Transactional Email']"));
			String rc2 = bal2.getText();
			Assert.assertEquals(rc2, "Transactional Email");
			System.out.println("Passed Header from recharge page is :-" + rc2);
			Assert.assertTrue(bal2.isDisplayed(), "Given Header not found :- Transactional Email");

			// Buy

			WebElement bal1 = driver.findElement(By.xpath("html/body/div[4]/div/div[5]/div[1]/div/div[1]/ul/li[6]/button")); //  Not understand
			String rc1 = bal1.getText();
			Assert.assertEquals(rc1, "Buy");
			System.out.println("Passed Header from recharge page 50k is :-" + rc1);
			Assert.assertTrue(bal1.isDisplayed(), "Given Header not found :- Buy");
			
			Thread.sleep(4000);
			
			driver.findElement(By.id("campaignId")).click();
			
	}                                                                                  

	// New Method
	@Test(priority = 4)
	public void MailingPageHeaders() throws InterruptedException {

		WebDriver driver = SeleniumDriver.getDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("mailingId")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("addMember")).click();

		WebElement lst = driver.findElement(By.xpath(".//div[text() ='Create Mailing List']"));
		String mailing = lst.getText();
		Assert.assertEquals(mailing, "Create Mailing List");
		System.out.println("Passed Header from Mailing page is :-" + mailing);
		Assert.assertTrue(lst.isDisplayed(), "Given Header not found :- Create Mailing List");

	}

	// New Summary
	@Test(priority = 5)
	public void ReportsPageHeaders() throws InterruptedException {
		
		WebDriver driver = SeleniumDriver.getDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("reportId")).click();

		WebElement ID16 = driver.findElement(By.id("sumTab"));
		String value16 = ID16.getText();
		Assert.assertEquals(value16, "Summary");
		System.out.println("Passed Header from Reports page is :-" + value16);
		Assert.assertTrue(ID16.isDisplayed(), "Given Header not found :- Summary");

		// Detailed

		WebElement ID17 = driver.findElement(By.id("detTab"));
		String value17 = ID17.getText();
		Assert.assertEquals(value17, "Detailed");
		System.out.println("Passed Header from Reports page is :-" + value17);
		Assert.assertTrue(ID17.isDisplayed(), "Given Header not found :- Detailed");

		// Searcher

		WebElement ID18 = driver.findElement(By.id("setTab"));
		String value18 = ID18.getText();
		Assert.assertEquals(value18, "Email Searcher");
		System.out.println("Passed Header from Reports page is :-" + value18);
		Assert.assertTrue(ID18.isDisplayed(), "Given Header not found :- Email Searcher");

		// View

		WebElement ID19 = driver.findElement(By.id("btnDiv"));
		String value19 = ID19.getText();
		Assert.assertEquals(value19, "View");
		System.out.println("Passed Header from Reports page is :-" + value19);
		Assert.assertTrue(ID19.isDisplayed(), "Given Header not found :- View");

		// Detailed (CampaignId / Sent Date)

		driver.findElement(By.id("detTab")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/md-select")).click();
		Thread.sleep(4000);
		WebElement ID20 = driver.findElement(By.xpath(".//div[text()='Campaign Id']"));
		String value20 = ID20.getText();
		Assert.assertEquals(value20, "Campaign Id");
		System.out.println("Passed Header from Reports page is :-" + value20);
		Assert.assertTrue(ID20.isDisplayed(), "Given Header not found :- Campaign Id");

		// Detailed (Sent Date)

		WebElement ID21 = driver.findElement(By.xpath(".//div[text()='Sent Date']"));
		String value21 = ID21.getText();
		Assert.assertEquals(value21, "Sent Date");
		System.out.println("Passed Header from Reports page is :-" + value21);
		Assert.assertTrue(ID21.isDisplayed(), "Given Header not found :- Sent Date");
		Thread.sleep(2000);
		driver.findElement(By.xpath(" html/body/div/md-select-menu/md-content/md-option[2]")).click();

		// Generate Report

		WebElement ID22 = driver.findElement(By.xpath("html/body/div[4]/div/div[2]/div/div[1]/div/div[6]"));
		String value22 = ID22.getText();
		Assert.assertEquals(value22, "Generate Report");
		System.out.println("Passed Header from Reports page is :-" + value22);
		Assert.assertTrue(ID22.isDisplayed(), "Given Header not found :- Generate Report");

		// Summary Details(Campaign Id)
		Thread.sleep(3000);
		driver.findElement(By.id("sumTab")).click();
		driver.findElement(
				By.xpath("html/body/div[4]/div/div[2]/div/div[1]/div/div[2]/md-select/md-select-value/span[2]"))
				.click();

		WebElement ID23 = driver.findElement(By.xpath(".//div[text()='Campaign Id']"));
		Thread.sleep(2000);
		String value23 = ID23.getText();
		Assert.assertEquals(value23, "Campaign Id");
		System.out.println("Passed Header from Reports page is :-" + value23);
		Assert.assertTrue(ID23.isDisplayed(), "Given Header not found :- Campaign Id");

		// Summary Details(Sent Date)

		WebElement ID24 = driver.findElement(By.xpath(".//div[text()='Sent Date']"));
		Thread.sleep(2000);
		String value24 = ID24.getText();
		Assert.assertEquals(value24, "Sent Date");
		System.out.println("Passed Header from Reports page is :-" + value24);
		Assert.assertTrue(ID24.isDisplayed(), "Given Header not found :- Sent Date");

		// Summary Details(Subject)

		WebElement ID25 = driver.findElement(By.xpath(".//div[text()='Subject']"));
		String value25 = ID25.getText();
		Assert.assertEquals(value25, "Subject");
		System.out.println("Passed Header from Reports page is :-" + value25);
		Assert.assertTrue(ID25.isDisplayed(), "Given Header not found :- Subject");

		// Sender Email

		WebElement ID26 = driver.findElement(By.xpath(".//div[text()='Sender Email']"));
		String value26 = ID26.getText();
		Assert.assertEquals(value26, "Sender Email");
		System.out.println("Passed Header from Reports page is :-" + value26);
		Assert.assertTrue(ID26.isDisplayed(), "Given Header not found :- Sender Email");

		// Campaign Name

		WebElement ID27 = driver.findElement(By.xpath(".//div[text()='Campaign Name']"));
		String value27 = ID27.getText();
		Assert.assertEquals(value27, "Campaign Name");
		System.out.println("Passed Header from Reports page is :-" + value27);
		Assert.assertTrue(ID27.isDisplayed(), "Given Header not found :- Campaign Name");
		driver.findElement(By.xpath(".//div[text()='Campaign Name']")).click();
		Thread.sleep(3000);

	}

	// History
	@Test(priority = 6)
	public void HistoryPageHeaders() {
		
		WebDriver driver = SeleniumDriver.getDriver();
		
		driver.findElement(By.id("historyId")).click();
		WebElement ID28 = driver.findElement(By.id("draftAnchor"));
		String value28 = ID28.getText();
		Assert.assertEquals(value28, "Draft");
		System.out.println("Passed Header from History page is :-" + value28);
		Assert.assertTrue(ID28.isDisplayed(), "Given Header not found :- Draft");

		// Sent / Schedule

		WebElement ID29 = driver.findElement(By.xpath(".//*[@id='sendListAnchor']"));
		String value29 = ID29.getText();
		Assert.assertEquals(value29, "Sent / Scheduled");
		System.out.println("Passed Header from History page is :-" + value29);
		Assert.assertTrue(ID29.isDisplayed(), "Given Header not found :- Sent / Scheduled");
	}

	// Setting

	@Test(priority = 7)
	public void SettingPageHeaders() throws InterruptedException {
		
		WebDriver driver = SeleniumDriver.getDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("caret")).click();
		Thread.sleep(3000);

		WebElement ID30 = driver.findElement(By.xpath("//button/span[contains(text(),'Settings')]"));
		String value30 = ID30.getText();
		Assert.assertEquals(value30, "Settings");
		System.out.println("Passed Header from Seting page is :-" + value30);
		Assert.assertTrue(ID30.isDisplayed(), "Given Header not found :- Settings");
		driver.findElement(By.xpath("//button/span[contains(text(),'Settings')]")).click();

		// General
		WebElement set = driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[2]/div[1]/ul/li[1]"));
		String setting = set.getText();
		Assert.assertEquals(setting, "General");
		System.out.println("Passed Header from personal information page is :-" + setting);
		Assert.assertTrue(set.isDisplayed(), "Given Header not found :- General");

		// Transaction History
		WebElement set1 = driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[2]/div[1]/ul/li[2]/a"));
		String setting1 = set1.getText();
		Assert.assertEquals(setting1, "Transaction History");
		System.out.println("Passed Header from personal information page is :-" + setting1);
		Assert.assertTrue(set1.isDisplayed(), "Given Header not found :- Transaction History");

		// Security
		WebElement set2 = driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[2]/div[1]/ul/li[3]"));
		String setting2 = set2.getText();
		Assert.assertEquals(setting2, "Security");
		System.out.println("Passed Header from personal information page is :-" + setting2);
		Assert.assertTrue(set2.isDisplayed(), "Given Header not found :- Security");

		// Email Settings
		WebElement set3 = driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[2]/div[1]/ul/li[4]/a"));
		String setting3 = set3.getText();
		Assert.assertEquals(setting3, "Email Settings");
		System.out.println("Passed Header from personal information page is:-" + setting3);
		Assert.assertTrue(set3.isDisplayed(), "Given Header not found :- Email Settings");

		// Contact Info
		WebElement set4 = driver.findElement(By.xpath("html/body/div[4]/div/div[1]/div[2]/div[1]/ul/li[5]/a"));
		String setting4 = set4.getText();
		Assert.assertEquals(setting4, "Contact Info");
		System.out.println("Passed Header from personal information page is :-" + setting4);
		Assert.assertTrue(set4.isDisplayed(), "Given Header not found :- Contact Info");
		driver.findElement(By.className("caret")).click();
		Thread.sleep(2000);

		// What's New
		WebElement ID31 = driver.findElement(By.xpath(
				"html/body/div[3]/nav/div/div/div/ul[1]/li[5]/md-menu-bar/md-menu/div[1]/md-menu-content/div[2]/md-menu-item/button"));
		String value31 = ID31.getText();
		Assert.assertEquals(value31, "What's New");
		System.out.println("Passed Header from Seting page is :-" + value31);
		Assert.assertTrue(ID31.isDisplayed(), "Given Header not found :- Settings");

		// Quick Tour
		WebElement ID32 = driver.findElement(By.xpath(
				"html/body/div[3]/nav/div/div/div/ul[1]/li[5]/md-menu-bar/md-menu/div[1]/md-menu-content/div[3]/md-menu-item/button"));
		String value32 = ID32.getText();
		Assert.assertEquals(value32, "Quick Tour");
		System.out.println("Passed Header from Seting page is :-" + value32);
		Assert.assertTrue(ID32.isDisplayed(), "Given Header not found :- Settings");

		// Logout
		WebElement ID33 = driver.findElement(By.xpath(
				"html/body/div[3]/nav/div/div/div/ul[1]/li[5]/md-menu-bar/md-menu/div[1]/md-menu-content/div[4]/md-menu-item/button"));
		String value33 = ID33.getText();
		Assert.assertEquals(value33, "Logout");
		System.out.println("Passed Header from Seting page is :-" + value33);
		Assert.assertTrue(ID33.isDisplayed(), "Given Header not found :- Logout");
		driver.findElement(By.xpath(
				"html/body/div[3]/nav/div/div/div/ul[1]/li[5]/md-menu-bar/md-menu/div[1]/md-menu-content/div[4]/md-menu-item/button"))
				.click();

		driver.findElement(By.xpath("html/body/div[3]/nav/div/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='user_id']")).sendKeys(System.getProperty("userId"));

		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(System.getProperty("password"));

		driver.findElement(
				By.xpath("html/body/div/md-dialog/md-dialog-content/div/div/div[1]/div/form/div[3]/div/label")).click();

		driver.findElement(By.xpath("html/body/div/md-dialog/md-dialog-content/div/div/div[1]/div/form/div[4]/button"))
				.click();

		System.out.println("Headers varification sucessfully completed");
	}

}