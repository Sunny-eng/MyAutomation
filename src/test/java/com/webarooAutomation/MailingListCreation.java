package com.webarooAutomation;

//@author Sunny-eng

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mysql.cj.api.jdbc.Statement;

public class MailingListCreation {
	
	String emailId = "";
	
	  @Test(priority = 10)
	  
  public void simplemailingList() throws ClassNotFoundException, InterruptedException {
		  
		  WebDriver driver = SeleniumDriver.getDriver();
		  
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		  
		driver.findElement(By.className("close")).click();
			
	     driver.findElement(By.id("mailingId")).click();
			
	   	 driver.findElement(By.id("addMember")).click();
		 
			 
			          String suffix = "" ;
			          String name = "SimpleMailingList"; 

			          if (doesItAlreadyExist(name + suffix)) {
			 	     for(int index = 1; doesItAlreadyExist(name + suffix); index++) {
			 		 suffix = "_" + index;
			 		 System.out.println("Suffix changed to " + suffix);
			 	     }
			                }
			      name = name + suffix;
			System.out.println("Name finally being used " + name);

			driver.findElement(By.id("mailingList")).sendKeys(name); 
			         
			driver.findElement(By.id("descriptiontext")).click();
			          
			driver.findElement(By.id("descriptiontext")).sendKeys("Automated");
			       
			driver.findElement(By.xpath("//a[@class='btn default']")).click(); // create mailing list creator 
			
			driver.findElement(By.id("mailingId")).click();
			          
			Thread.sleep(5000);
			       
		    driver.findElement(By.id("manageMemberTab-0")).click();
			       
			driver.findElement(By.xpath(".//label[@for='smlRadioBtn-0']")).click(); 
			          
			driver.findElement(By.id("memberNumbersTextBox")).sendKeys(SeleniumDriver.getProperty().getProperty("emailId"));
	
			driver.findElement(By.xpath(".//label[@for='fileUploadCheckBox-0']")).click();
			         
			String simpleDocuments = Utils.uploadFilesToFTP(getClass().getClassLoader().getResource("SimpleEmailList.csv").getPath());
						
			WebElement simpleAttachement = driver.findElement(By.id("subscriberNumbersFile"));
						
			simpleAttachement.sendKeys(simpleDocuments);  
			          
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("html/body/div[4]/div/table/tbody[1]/tr[2]/td/div[2]/div[3]/div[4]/div/button[1]")).click();  // Simple mailing List Created.
		  
		   Thread.sleep(8000);
		}
	  
	  @Test(priority = 11)
	  
	  public void customMailingList() throws SQLException, InterruptedException {
		  
		  
		 WebDriver driver = SeleniumDriver.getDriver();
		  
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		
		  
		 driver.findElement(By.className("close")).click();
		  
		 driver.findElement(By.id("addMember")).click();
		 Thread.sleep(5000);
		  	
		  	  	
			String suffix2 = "" ;
			String custom = "Auto_Custom_mailing_List"; 
			
			if (customIdExist(custom + suffix2)) {
				
			for(int index = 1; customIdExist(custom + suffix2); index++) {
			suffix2 = "_" + index;
			System.out.println("Suffix2 changed to " + suffix2);	
			}
			}
			custom = custom + suffix2;
			System.out.println("Name finally being used " + custom);
			
			driver.findElement(By.id("mailingList")).sendKeys(custom); 
			   
			driver.findElement(By.id("descriptiontext")).click();
			 
			driver.findElement(By.id("descriptiontext")).sendKeys("Custom Automated");
		   
			driver.findElement(By.xpath("//a[@class='btn default']")).click(); // create mailing list creator 
			
			Thread.sleep(5000);
			
			  driver.findElement(By.id("mailingId")).click();
			
			Thread.sleep(5000);
		      
		    driver.findElement(By.id("manageMemberTab-0")).click();  // manage top button setting
	
		    driver.findElement(By.xpath(".//label[@for='cmlRadioBtn-0']")).click();
		    
		   // driver.findElement(By.name("customSubscriberNumbersFile")).click();
		    
		    String CustomDocuments = Utils.uploadFilesToFTP(getClass().getClassLoader().getResource("CustomMailingList.csv").getPath());
			
			WebElement customAttachement = driver.findElement(By.name("customSubscriberNumbersFile"));
				
			customAttachement.sendKeys(CustomDocuments);  
			
			Thread.sleep(5000);
		       
	        driver.findElement(By.xpath(".//*[@id='customMailingListDiv-0'] //span[contains(text(), 'Preview')]")).click();
		    
	        Thread.sleep(3000);
		    driver.findElement(By.xpath(".//span[contains(text(), 'OK')]")).click();
		    
		    Thread.sleep(3000);
		    
		    driver.findElement(By.xpath("html/body/div[4]/div/table/tbody[1]/tr[2]/td/div[2]/div[4]/div[4]/div[2]/button[1]")).click(); // Custom mailing list created
		    
		    System.out.println("Custom mailing list sucessfully created");      //................................................$
		          
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  	 
		  
		  
		  
		  
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  // Mailing List Searcher code
	   
	   public static boolean doesItAlreadyExist(String name) {
		try {
		Connection con = DriverManager.getConnection("jdbc:mysql://10.20.11.49:3306/EMSGatewayNEW", "webaroo","webar00");
		
		System.out.println("Connected to MySql Database\n");  
		Statement smt = (Statement) con.createStatement();
		ResultSet rs  = smt.executeQuery("SELECT COUNT(*) from  EmailGroup WHERE name = '" + name + "'");
		if (rs.first()) {
		return rs.getInt(1) > 0;
		}
		} catch (SQLException e) {
		e.printStackTrace();
		}
		return false;
		}
	   
	   
	   
	   
	   
	   
	   public static boolean customIdExist(String custom) {
			try {
			Connection connector = DriverManager.getConnection("jdbc:mysql://10.20.11.49:3306/EMSGatewayNEW", "webaroo","webar00");
			
			System.out.println("Connected to MySql Database\n");  
			Statement smt1 = (Statement) connector.createStatement();
			ResultSet rs1  = smt1.executeQuery("SELECT COUNT(*) from  EmailGroup WHERE name = '" + custom + "'");
			if (rs1.first()) {
			return rs1.getInt(1) > 0;
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}
			return false;
			}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
}

