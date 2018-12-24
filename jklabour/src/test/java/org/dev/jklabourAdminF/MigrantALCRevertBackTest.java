package org.dev.jklabourAdminF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.MigrantContractorsRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MigrantALCRevertBackTest extends BaseClass1 {
	@Test
	public void allocationTest() throws EncryptedDocumentException, Throwable
	{ 
		MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
		al.MigrantContractors();;
		
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

			
			LIRevertBackApplicant rb=PageFactory.initElements(driver, LIRevertBackApplicant.class);
			rb.revertBack();
			
			driver.findElement(By.xpath("//input[@value='reverted_back']"
					+ "/following-sibling::textarea[@name='status_update_message']"))
			.sendKeys("edit this field");
			
			/*driver.findElement(By.xpath("//div[contains(text(),'Revert Back Request')]/following-sibling::form/div[2]/div")).click();
			 
			 Thread.sleep(2000);*/
			
			
			driver.findElement(By.xpath("//div[contains(text(),'Revert Back Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
			
			
			String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
			System.out.println(msg);
		
		
	}

}
