package com.webarooAutomation;
//@author Sunny-eng

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class UploadEmailSent {
	
	
	 String Live = "";
  @Test(priority = 9)
  
  public void secondEmail() throws InterruptedException {
	  

		WebDriver driver = SeleniumDriver.getDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
		 driver.findElement(By.id("gupshuplogo")).click();
		 
		 Thread.sleep(4000);
		 
         driver.findElement(By.id("campaign_name")).sendKeys("Sunny_Group");
		 
		 driver.findElement(By.id("first_name")).sendKeys("SunnyEnterprise2");
		 
		 driver.findElement(By.xpath(".//label[@for='enterEmailId']")).click();
		 driver.findElement(By.xpath(".//label[@for='uploadEmailId']")).click();
		 
		 Thread.sleep(5000);
		
		 String csvfile = Utils.uploadFilesToFTP(getClass().getClassLoader().getResource("Upload_Email_List.csv").getPath());
					
					WebElement csvAttachement = driver.findElement(By.xpath(".//input[@id='recipients_file']"));
					
					csvAttachement.sendKeys(csvfile);
					
		 driver.findElement(By.xpath("//*[@id='subject']")).sendKeys("Sunny@Upload_Emails"); // Subject	
		 
		 Thread.sleep(5000);
		 
		 driver.findElement(By.id("gupshuplogo")).sendKeys(Keys.PAGE_DOWN);	
		 
		 driver.switchTo().frame(0);

		 driver.findElement(By.xpath(".//body[contains(@class,'cke_editable')]")).click();

		 driver.switchTo().activeElement().sendKeys("Sunny's testing is going on");
		 
		 driver.switchTo().defaultContent();	
		 
		 driver.findElement(By.id("gupshuplogo")).sendKeys(Keys.PAGE_DOWN);	
		 
		 Thread.sleep(5000);
		 
		 WebElement btnAttachFile = driver.findElement(By.xpath(".//span[text()='Attach file']/parent::button"));

		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", btnAttachFile);

			Thread.sleep(8000);

		  String htmlDocuments = Utils.uploadFilesToFTP(getClass().getClassLoader().getResource("File1.html").getPath());
			
		  WebElement htmlAttachement = driver.findElement(By.id("attach_file-0"));
			
		  htmlAttachement.sendKeys(htmlDocuments);  
		 
		  driver.findElement(By.xpath(".//span[text()='Attach file']/parent::button")).sendKeys(Keys.PAGE_DOWN);
		  
		  Thread.sleep(5000);
		 
		  driver.findElement(By.xpath(".//label[@for='scheduleRadioBtn']")).click(); // click on schedule
			
		  // Calendar date selection
		  SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy/MM/dd HH:mm");     
		  
		  Calendar c = Calendar.getInstance();        
		  
		  c.add(Calendar.MINUTE, 20);  // number of days to add      
		  
		  Live = (String)(formattedDate.format(c.getTime()));
		  
		  System.out.println("Today's scheduled date and time  is " + Live);
		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  
		  js.executeScript("document.getElementById('quickPostScheduleDivFileInput').value = '" + Live + "'"); 
		 
		  driver.findElement(By.id("quickPostScheduleDivFileInput")).click();   
		  
		

		  driver.findElement(By.xpath(".//*[@id='email-send']/div/div/i/span")).click();  
		  
		  new Actions(driver).moveToElement(driver.findElement(By.xpath("//button [1] //span[contains(text(), 'Show me the preview')]"))).click().perform();
			
		  driver.findElement(By.xpath("//button [1] //span[contains(text(), 'Show me the preview')]")).click();
		
		  Thread.sleep(5000);
			  
		  WebElement Emailsent = driver.findElement(By.xpath(".//*[@id='campaignPreview']//button[1]"));
			    
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Emailsent);
			  
		  driver.findElement(By.xpath(".//*[@id='campaignPreview']//button[1]")).click();
		  
		 System.out.println("Second upload emails sent sucessfuly by scheduler");
		 
		 Thread.sleep(5000);
		  
		  
	  
  }
}
