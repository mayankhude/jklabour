package org.dev.jklabourAdminF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.dev.jklabour.ObjectRepositoryA.MigrantContractorsRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.UploadCertificate;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MigrantALCUploadCertificateTest extends BaseClass1 {
	
	@Test
	public void uploadCertificateTest() throws EncryptedDocumentException, Throwable
	{
	
		MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
		al.MigrantContractors();
		


  /*  ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
    ap.gettrackingId();
    ap.doAction(); */
		
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
/*---------------------do action ------------------*/


	UploadCertificate uc=PageFactory.initElements(driver, UploadCertificate.class);
    uc.uploadCetificate();
    
    driver.findElement(By.name("approval_certificate_file")).click();
   
    Thread.sleep(4000);
    Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\Upload.exe");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();
    
    Thread.sleep(5000);

	
	String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
	System.out.println(msg);
	
	}

}
