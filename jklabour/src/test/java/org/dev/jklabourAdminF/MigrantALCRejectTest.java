package org.dev.jklabourAdminF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.MigrantContractorsRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.ALCReject;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MigrantALCRejectTest extends BaseClass1 {
	
	@Test
	
	public void rejectMigrantApplicationTest() throws EncryptedDocumentException, Throwable
	{
		MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
		al.MigrantContractors();
		
    
    
/*	ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
	ap.gettrackingId();
	ap.doAction();*/
		
/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

	
	ALCReject reject =PageFactory.initElements(driver, ALCReject.class);
	reject.reject();
	
	driver.findElement(By.xpath("//input[@value='rejected']/following-sibling::textarea"))
	.sendKeys("not ok");
	
	/*-------------send----------------*/
	driver.findElement(By.xpath("//div[contains(text(),'Deny Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
	
	Thread.sleep(2000);
	
	/*--------------cancel----------------------*/
	//driver.findElement(By.xpath("//div[contains(text(),'Deny Request')]/following-sibling::form/div[2]/div")).click();
try{	String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
	System.out.println(msg);

}catch (Exception e) {
	// TODO: handle exception
}	
		
	}	

}
