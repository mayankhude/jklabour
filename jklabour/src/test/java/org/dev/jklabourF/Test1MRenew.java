package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.InterStateCRenewal;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test1MRenew extends BaseClass1{
	
	static int i=3;
	
	@Test
	
	public void MigrantRegistrationTest() throws EncryptedDocumentException, Throwable
	{
       InterStateMigrantAct1 act= PageFactory.initElements(driver, InterStateMigrantAct1.class);
	               act.StateMigrant();
	               
	   InterStateCRenewal reg=PageFactory.initElements(driver, InterStateCRenewal.class);
	              reg.interStateCRenewal();
	              
	   
	    driver.findElement(By.xpath("//button[@type='submit']")).click();	
	        	  
	       	   
	     Thread.sleep(20000);
	     WebElement oldId=driver.findElement(By.name("registration_approval_file"));
	     WebDriverUtils1.dropdown(oldId, 4);
	      		
	     driver.findElement(By.name("registration_number")).sendKeys("25092206");
	      		
	     
	     
	     driver.findElement(By.id("btn-online-reg")).click();
	      		
	     
	}

}
