package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractorsRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test2CRenew extends BaseClass1 {

	static int i=2;
	
	@Test
	public void ContractorRenewaltest() throws EncryptedDocumentException, Throwable
	{
		
		
		ContractLabourAct1 cla=PageFactory.initElements(driver, ContractLabourAct1.class);
		cla.contractLabour();
		System.out.println("====Contract Labour Act is working====");
		
		ContractorsRenewal cr=PageFactory.initElements(driver, ContractorsRenewal.class);
		cr.contractorsRenewal();;
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	  
	   
		WebElement oldId=driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);
		
		driver.findElement(By.name("registration_number")).sendKeys("23622519");
		
		driver.findElement(By.id("btn-online-reg")).click();
		
	   /*------------ fill contractor form------------------------*/
		
		FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "contractor");
		
	
		
	   
	    String name=fl.getStringExcelData(i,0);
	     driver.findElement(By.name("contractor_name"))
	     .sendKeys(name);
	     
	     
	     String fname=fl.getStringExcelData(i,1);
	     driver.findElement(By.name("contractor_fath_hus_name"))
	     .sendKeys(fname);
	     
/*----------------------------- 3. --------------------------*/     
	     String add=fl.getStringExcelData(i,2);
	     driver.findElement(By.name("contractor_address_1"))
	     .sendKeys(add);
	     
	     String add2=fl.getStringExcelData(i,3);
	     driver.findElement(By.name("contractor_address_2"))
	     .sendKeys(add2);
	    
		
	     String city=fl.getStringExcelData(i,4);
	     driver.findElement(By.name("contractor_address_city"))
	     .sendKeys(city);
	      
	   
	     WebElement dist=driver.findElement(By.name("contractor_address_district_id")); 
	      WebDriverUtils1.dropdownselect(dist,"Jammu");
	   

	  
      
	     String pin=fl.convertDoubleToString(fl.getIntExcelData(i, 6));
	     driver.findElement(By.name("contractor_address_pincode"))
	     .sendKeys(pin);
	     
		
 /*---------------------------  4. --------------------------------*/
	     
	     WebElement element=driver.findElement(By.name("contractor_dob"));
    	  String dateVal="1990-04-29";
    	  WebDriverUtils1.selectDateByjs(driver, element, dateVal);
    	  
	     
    	  
    /*--------------------SUBMIT FORM ------------------------*/
    	  
    	  driver.findElement(By.id("submit-btn")).submit();
    	  
    	  
    		ContractLabourAct1 cla1=PageFactory.initElements(driver, ContractLabourAct1.class);
    		cla1.contractLabour();
    		System.out.println("====Contract Labour Act is working====");
    		
    		ContractorsRenewal cr1=PageFactory.initElements(driver, ContractorsRenewal.class);
    		cr1.contractorsRenewal();;
    		driver.findElement(By.xpath("//button[@type='submit']")).click();	
    	  
	}
}
