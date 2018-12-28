package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.InterStateCRenewal;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test2MRenew extends BaseClass1{
	
	static int i=3;
	
	@Test
	
	public void MigrantRegistrationTest() throws EncryptedDocumentException, Throwable
	{
       InterStateMigrantAct1 act= PageFactory.initElements(driver, InterStateMigrantAct1.class);
	               act.StateMigrant();
	               
	   InterStateCRenewal reg=PageFactory.initElements(driver, InterStateCRenewal.class);
	              reg.interStateCRenewal();
	              
	   
	    driver.findElement(By.xpath("//button[@type='submit']")).click();	
	        	  
	       	   
	     WebElement oldId=driver.findElement(By.name("registration_approval_file"));
	     WebDriverUtils1.dropdown(oldId, 4);
	      		
	     driver.findElement(By.name("registration_number")).sendKeys("25092206");
	      		
	     driver.findElement(By.id("btn-online-reg")).click();
	      		
	      /*------------ fill contractor renewal  form------------------------*/
	       		
	FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "contractor");
	       		
	       	
	 /*------------------------ 1. -------------------------------*/	
	       	   
	       String name=fl.getStringExcelData(i,0);
   	       driver.findElement(By.name("contractor_name"))
	       .sendKeys(name);
	   
   	 /*------------------------ 2.------------------------------*/     
	       	     
	       String fname=fl.getStringExcelData(i,1);
	       driver.findElement(By.name("contractor_fath_hus_name"))
	       .sendKeys(fname);
	       	     
	 /*------------------------ 3. --------------------------*/
	       	     
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
	       	     
	   /*---------------------------4. --------------------------------*/		
	       	    
	       	 driver.findElement(By.name("contractor_dob"))
	       	 .sendKeys("1990-04-29");
	       	 Thread.sleep(1000);
	       	     
		/*---------------------------5.---------------------------------*/
	       	 String ename=fl.getStringExcelData(i,8);
	       	 driver.findElement(By.name("est_name"))
	       	 .sendKeys(ename);
	       	     
	       	 String eadd=fl.getStringExcelData(i,9);
	       	 driver.findElement(By.name("est_address_1"))
	       	 .sendKeys(eadd);
	       	     
	         String eadd2=fl.getStringExcelData(i,10);
	  	     driver.findElement(By.name("est_address_2"))
     	     .sendKeys(eadd2);
	       	     
	       	 String ecity=fl.getStringExcelData(i,11);
	       	 driver.findElement(By.name("est_address_city"))
	       	 .sendKeys(ecity);
	       	
	       	 WebElement estdist= driver.findElement(By.name("est_address_district_id"));
	         WebDriverUtils1.dropdownselect(estdist,"Jammu");
	       	    
    	     String estpin=fl.convertDoubleToString(fl.getIntExcelData(i,13));
	       	 driver.findElement(By.name("est_address_pincode"))
	       	 .sendKeys(estpin);
	       	        
	 /*--------------------------- 6. ------------------------------*/    
	       	        
	       	        
	       	        
	         String buss=fl.getStringExcelData(i,14);
	         driver.findElement(By.name("business_type"))
	         .sendKeys(buss);
	       	     
	 /*-------------------------- 7. ------------------------------*/
	       	     
	         String pname=fl.getStringExcelData(i,15);
	         driver.findElement(By.name("prin_name"))
	       	 .sendKeys(pname);
	       	     
	       	 String pdesig=fl.getStringExcelData(i,16);
	       	 driver.findElement(By.name("prin_desig"))
	       	 .sendKeys(pdesig);
	       	     
	       	  String padd=fl.getStringExcelData(i,17);
	       	  driver.findElement(By.name("prin_address_1"))
	       	  .sendKeys(padd);
	       	     
	       	  String padd2=fl.getStringExcelData(i,18);
	       	  driver.findElement(By.name("prin_address_2"))
	       	  .sendKeys(padd2);
	       	     
	       	  String pcity=fl.getStringExcelData(i,19);
	       	  driver.findElement(By.name("prin_address_city"))
	       	  .sendKeys(pcity);
	       	    
	       	  WebElement pdist=driver.findElement(By.name("prin_address_district_id"));
	       	  WebDriverUtils1.dropdownselect(pdist,"Jammu");
	       	     
	       	  String prdist=fl.convertDoubleToString(fl.getIntExcelData(i,21));
	       	  driver.findElement(By.name("prin_address_pincode"))
	       	  .sendKeys(prdist);
	       	     
	   /*---------------------------- 8. ------------------------------*/
	       	     
	       	   String work=fl.getStringExcelData(i,22);
	       	   driver.findElement(By.name("nature_of_work"))  
	       	   .sendKeys(work);
	       	    
	       	     
	       	 
	   	      WebElement element=driver.findElement(By.name("commencement_date"));
	          String dateVal="2018-10-06";	       	     
	       	  WebDriverUtils1.selectDateByjs(driver, element, dateVal);
	       	     
	       	     
	       	 
	       	     
	       	  WebElement element1=driver.findElement(By.name("termination_date"));
	       	  String dateVal1="2018-12-27";
	       	  WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);
	       	     
	    	   String noOfLabour=fl.convertDoubleToString(fl.getIntExcelData(i,25));
	       	   driver.findElement(By.name("max_no_of_labour"))
	       	   .sendKeys(noOfLabour);
	
	 
 /*---------------------------- submit form-------------------------------*/
	      
	      driver.findElement(By.id("submit-btn")).submit();
	       	            	    
	      InterStateMigrantAct1 act1= PageFactory.initElements(driver, InterStateMigrantAct1.class);
          act1.StateMigrant();
          
InterStateCRenewal reg1=PageFactory.initElements(driver, InterStateCRenewal.class);
         reg1.interStateCRenewal();
         

driver.findElement(By.xpath("//button[@type='submit']")).click();	
   	  
  	   
	
	}

}
