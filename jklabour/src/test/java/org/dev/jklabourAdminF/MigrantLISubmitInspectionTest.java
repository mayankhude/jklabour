package org.dev.jklabourAdminF;

import org.apache.poi.EncryptedDocumentException;

import org.dev.jklabour.ObjectRepositoryA.LISubmitInspectionReport;
import org.dev.jklabour.ObjectRepositoryA.MigrantContractorsRegistrationsMenu;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MigrantLISubmitInspectionTest extends BaseClass1 {
	
@Test

  public void submitReport() throws EncryptedDocumentException, Throwable{
	MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
	al.MigrantContractors();;
	
	/*ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
	ap.gettrackingId();
	ap.doAction();*/
	
	/*----------------------- click on View -------------------------------*/
	

	 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
	 String id=fl.getStringExcelData(5, 3);
	System.out.println("tracking id ==> "+id);
	 
	 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
	.click();
	
	
/*---------------------do action ------------------*/

	
	
	LISubmitInspectionReport sr=PageFactory.initElements(driver, LISubmitInspectionReport.class);
	sr.submitReport();
	

	  driver.findElement(By.xpath("//textarea[@name='inspection_message']")).sendKeys("ok");
	  
	  /*driver.findElement(By.xpath("//div[contains(text(),'Submit Inspection Report')]/following-sibling::form/div[2]/div")).click();
		 
		 Thread.sleep(2000);*/
	  
	driver.findElement(By.xpath("//div[contains(text(),'Submit Inspection Report')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
}
}
