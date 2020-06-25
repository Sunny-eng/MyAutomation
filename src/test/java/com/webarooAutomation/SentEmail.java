package com.webarooAutomation;

//@author Sunny-eng

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SentEmail {      

	@Test(priority = 8)
	public void FirstMailSent() throws Exception {

		
 		WebDriver driver = SeleniumDriver.getDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);

		 driver.findElement(By.id("gupshuplogo")).click();
		Thread.sleep(5000);
		
		 driver.findElement(By.id("campaign_name")).sendKeys("Sunny_Group");
		 
		 driver.findElement(By.id("first_name")).sendKeys("SunnyEnterprise");

		WebElement radioEmailId = driver.findElement(By.xpath(".//label[@for='enterEmailId']"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioEmailId);

		driver.findElement(By.xpath(".//*[@id='enterEmailIdDiv']/div[1]/textarea"))
		
		.sendKeys(SeleniumDriver.getProperty().getProperty("emailId"));
		
		 driver.findElement(By.id("gupshuplogo")).sendKeys(Keys.PAGE_DOWN);		

		driver.findElement(By.xpath("//*[@id='subject']")).sendKeys("Sunny@Entered_ID's"); // Subject

		WebElement elementUploadNewsletter = driver.findElement(
				By.xpath(".//div[@id='mailbodyDiv']/preceding-sibling::ul[2]//a[text()='Upload Newsletter']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementUploadNewsletter);
		
		elementUploadNewsletter.click(); // Upload
		
		WebElement emailContentZip = driver.findElement(By.id("newsletter_file"));

		String fileLocation = Utils.uploadFilesToFTP(getClass().getClassLoader().getResource("18aug.zip").getPath());

		emailContentZip.sendKeys(fileLocation);

		WebElement btnAttachFile = driver.findElement(By.xpath(".//span[text()='Attach file']/parent::button"));

		((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAttachFile);

		Thread.sleep(8000);

		String fileDocuments = Utils
		.uploadFilesToFTP(getClass().getClassLoader().getResource("Scanned_Document.pdf").getPath());
		
		WebElement pdfAttachement = driver.findElement(By.id("attach_file-0"));
		
		pdfAttachement.sendKeys(fileDocuments);  

		driver.findElement(By.xpath(".//*[@id='email-send']/div/div/i/span")).click();
		
		 // new Actions(driver).moveToElement(driver.findElement(By.xpath(".//span[contains(text(), 'Send mail without preview')]"))).click().perform();
	     //	driver.findElement(By.xpath(".//span[contains(text(), 'Send mail without preview')]")).click();
		
		  new Actions(driver).moveToElement(driver.findElement(By.xpath("//button [1] //span[contains(text(), 'Show me the preview')]"))).click().perform();
		
		 driver.findElement(By.xpath("//button [1] //span[contains(text(), 'Show me the preview')]")).click();
	
		  Thread.sleep(5000);
		  
		    WebElement Emailsent = driver.findElement(By.xpath(".//*[@id='campaignPreview']//button[1]"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Emailsent);
		  
		driver.findElement(By.xpath(".//*[@id='campaignPreview']//button[1]")).click();
		
		Thread.sleep(3000);
																													// from
																													// preview
		System.out.println("1st Email sent sucessfully"); // ...........................................................$

		// Show data from SQL database

		driver.findElement(By.className("close")).click();

	    WebElement scrollElement = driver.findElement(By.id("gupshuplogo"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", scrollElement);

		Thread.sleep(3000);
		driver.findElement(By.id("historyId")).click(); // History

		driver.findElement(By.id("sendListAnchor")).click(); // sentSchedule  
		Thread.sleep(3000);

		String mytext = driver.findElement(By.xpath(
				"html/body/div[4]/div/div[3]/div/div[2]/md-content/md-card/md-data-table-container/table/tbody/tr[1]/td[1]/a"))
				.getText();  

		Thread.sleep(3000);

		System.out.println("My generated campaign id is = " + mytext);

		Thread.sleep(3000);
		Connection connect = DriverManager.getConnection("jdbc:mysql://10.20.11.49:3306/EMSGatewayNEW", "webaroo",
				"webar00");
		System.out.println("Connected to MySql Database\n");
		Statement smt = connect.createStatement();
		Thread.sleep(3000);
		ResultSet rs = smt.executeQuery("select * from EmailSchedulerInfo where causeId = " + mytext);

		while (rs.next()) {
			String Userid = rs.getString("userId");
			String Subject = rs.getString("subject");
			String Status = rs.getString("status");
			String ID = rs.getString("id");
			String CauseId = rs.getString("causeId");
			String Timestamp = rs.getString("timestamp");
			String Total = rs.getString("total");
			String Invalid = rs.getString("invalid");
			String Duplicate = rs.getString("duplicate");
			String Valid = rs.getString("valid");

			System.out.println("The values of EmailSchedulerInfo is :\n");

			System.out.println("Id = " + ID);
			System.out.println("UserId = " + Userid);
			System.out.println("CauseId = " + CauseId);
			System.out.println("Subject = " + Subject);
			System.out.println("Timestamp = " + Timestamp);
			System.out.println("Total = " + Total);
			System.out.println("Invalid = " + Invalid);
			System.out.println("Duplicate = " + Duplicate);
			System.out.println("Valid = " + Valid);
			System.out.println("Status = " + Status);
			System.out.println("\n");

		}
		// CampaignRecipientDelivery

		ResultSet rs1 = smt.executeQuery("select * from CampaignRecipientDelivery where campaignid = " + mytext);

		while (rs1.next()) {
			String CampaignId = rs1.getString("campaignid");
			String RecipientId = rs1.getString("recipientid");
			String SrNo = rs1.getString("srno");
			String ScheduledTime = rs1.getString("scheduledtime");
			String Status = rs1.getString("status");
			String Timestamp = rs1.getString("ts");
			String ExternalId = rs1.getString("externalid");

			System.out.println("The values of CampaignRecipientDelivery is :\n");
			System.out.println("CampaignId = " + CampaignId);
			System.out.println("RecipientId = " + RecipientId);
			System.out.println("SrNo = " + SrNo);
			System.out.println("ScheduledTime = " + ScheduledTime);
			System.out.println("Timestamp = " + Timestamp);
			System.out.println("Status = " + Status);
			System.out.println("ExternalId = " + ExternalId);
			System.out.println("\n");
		}
		Thread.sleep(3000);
		
	}
}