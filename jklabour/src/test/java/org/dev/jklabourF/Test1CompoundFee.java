package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.InterStateCRenewal;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test1CompoundFee extends BaseClass1 {
	
	@Test
	
	public void compoundFeeSubmit() throws EncryptedDocumentException, Throwable
	{
		PostApplication pa=PageFactory.initElements(driver, PostApplication.class);
		pa.postApp();
		
		/*-----------------------pay fees---------------------*/
		
		//PostAppsCompoundFee cf=PageFactory.initElements(driver, PostAppsCompoundFee.class);
		//cf.PayFee();
		
		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		// String id=fl.convertDoubleToString(fl.getIntExcelData(5,3));
		 String id=fl.getStringExcelData(5, 3);
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[contains(text(),'Pay Compound Fee')]"))
		.click();
		
		
		/*-----------------------make payment----------------------*/
	    driver.switchTo().frame("paymentFrame");
		
		MakePayment mp=PageFactory.initElements(driver, MakePayment.class);
	     mp.payment();
	     mp.merchanSite();
     
	     
	try{Alert alt= driver.switchTo().alert();	     
	      alt.accept();
	      }catch (Exception e){}
	       Thread.sleep(6000);
	    
		
		/*----------------------final status or msg --------------------------*/
		
		  
		
		   InterStateMigrantAct1 act= PageFactory.initElements(driver, InterStateMigrantAct1.class);
	       act.StateMigrant();
	       
	InterStateCRenewal reg=PageFactory.initElements(driver, InterStateCRenewal.class);
	      reg.interStateCRenewal();
	      

	driver.findElement(By.xpath("//button[@type='submit']")).click();	
		
	
	 WebElement oldId=driver.findElement(By.name("registration_approval_file"));
     WebDriverUtils1.dropdown(oldId, 4);
      		
     driver.findElement(By.name("registration_number")).sendKeys("25092206");
      		
     driver.findElement(By.id("btn-online-reg")).click();
      		
	       
		
	}

}
