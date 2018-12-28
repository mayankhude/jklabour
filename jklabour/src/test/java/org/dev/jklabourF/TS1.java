package org.dev.jklabourF;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.objectRepositorys.InterEstablishmentRegistration;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TS1 extends BaseClass1{
	
	
	@Test
	
	
	public void editRevert() throws Throwable
	{
	
	
	PostApplication pa=PageFactory.initElements(driver, PostApplication.class);
	pa.postApp();
	
	
/*	PostAppsEdit edit=PageFactory.initElements(driver, PostAppsEdit.class);
	edit.edit();
	//td[text()='68443012']/following-sibling::td/a[contains(text(),'Edit')]*/

	 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
	// String id=fl.convertDoubleToString(fl.getIntExcelData(5,3));
	 String id=fl.getStringExcelData(5, 3);
	 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[contains(text(),'Edit')]"))
	.click();
	
	
driver.findElement(By.xpath("//input[@value='Continue']")).submit();			 
	
			
	
	Thread.sleep(1000);
	
	 driver.findElement(By.xpath("//input[@value='Continue']")).click();
	 
	 
	 /*------------------------------revert back submitted suceesfully--------------------------*/
	 
	   try{ String actmsg=driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();
	  
	  
	 // Assertr.assertEquals(actmsg, "Payment Transaction Completed Succcessfully ");
	  if(actmsg.contains("Successfully Updated"))
	  {
		  System.out.println("revert back  ==>"+actmsg);
	  }
	  
	  
	  String status  =driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
	   System.out.println("current status of the application is ===>  " +status);
	   
	    String trckingId=driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
	    System.out.println("Tracking Id ==>"+trckingId);
	       
		      }catch (Exception e) { }
	   
	   
	   InterStateMigrantAct1 act= PageFactory.initElements(driver, InterStateMigrantAct1.class);
       act.StateMigrant();
       

    InterEstablishmentRegistration reg=PageFactory.initElements(driver, InterEstablishmentRegistration.class);
     reg.EstablishmentRegistration();


   driver.findElement(By.xpath("//button[@type='submit']")).click();	

	   
	   
	}

}
