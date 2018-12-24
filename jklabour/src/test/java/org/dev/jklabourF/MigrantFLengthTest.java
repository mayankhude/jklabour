package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.InterContractorRegistration;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MigrantFLengthTest extends BaseClass1{
	
	static int i=3;
	
	@Test
	
	public void MigrantRegistrationTest() throws EncryptedDocumentException, Throwable
	{
		InterStateMigrantAct1 act= PageFactory.initElements(driver, InterStateMigrantAct1.class);
	               act.StateMigrant();
	               
		InterContractorRegistration reg=PageFactory.initElements(driver, InterContractorRegistration.class);
	              reg.interStateContractor();
	              
	   
	              
	              driver.findElement(By.xpath("//button[@type='submit']")).click();	
	        	  
	       	   
	       	   /*------------ fill contractor form------------------------*/
	       		
	       		
			    String name="Lorem passages, and more recently with desktop"
			    		+ " publishing software like Aldus PageMaker including "
			    		+ "versions of Lorem Ipsum."+ "re lisum.";
			    		
			    String detail="Lorem passages, and more recently with desktop"
			    		+ " publishing software like Aldus PageMaker including "
			    		+ "versions of Lorem Ipsum."
			    		+"Lorem passages, and more recently with desktop"
			    	    + " publishing software like Aldus PageMaker including "
			    	    + "versions of Lorem Ipsum."+ " publishing software like Aldus PageMaker including "
			    		+ "versions of Lorem Ipsum."
			    		+"Lorem passages, and more recently with desktop"
			    	    +"Lorem passages, and more recently with desktop"
			    	    + " publishing software like Aldus PageMaker including "
			    	    + "versions of Lorem Ipsum."
			    	    +"Lorem passages, and more recently with desktop"
			    	    + " publishing software like Aldus PageMaker including "
			    	    + "versions of Lorem Ipsum."
			    	    +"Lorem passages, and more recently with desktop"
			    	    + " publishing software like Aldus PageMaker including "
			    	    + "versions of Lorem Ipsum."

			    			    		;
				
				
	       	
	       	/*------------------------ 1. -------------------------------*/	
	       	   
	       	    driver.findElement(By.name("contractor_name"))
	       	     .sendKeys(name);
	       	/*------------------------ 2.------------------------------*/     
	       	     
	       	     driver.findElement(By.name("contractor_fath_hus_name"))
	       	     .sendKeys(name);
	       	     
	       	  /*------------------------ 3. --------------------------*/
	       	     
	       	     driver.findElement(By.name("contractor_address_1"))
	       	     .sendKeys(name);
	       	     
	       	     driver.findElement(By.name("contractor_address_2"))
	       	     .sendKeys(name);
	       	     
	       	     driver.findElement(By.name("contractor_address_city"))
	       	     .sendKeys(name);
	       	      
	       	   
	       	     WebElement dist=driver.findElement(By.name("contractor_address_district_id")); 
	       	     WebDriverUtils1.dropdownselect(dist,"Jammu");
		        
		  	 
	             
	       	     driver.findElement(By.name("contractor_address_pincode"))
	       	     .sendKeys(name);
	       	     
	   /*---------------------------4. --------------------------------*/		
	       	    
	       	   WebElement ele=  driver.findElement(By.name("contractor_dob")) ;
	       	   String dob="1990-1-1";
	       	 WebDriverUtils1.selectDateByjs(driver, ele, dob);
	       	     
		/*---------------------------5.---------------------------------*/
	       	     driver.findElement(By.name("est_name"))
	       	     .sendKeys(name);

	       	     driver.findElement(By.name("est_address_1"))
	       	     .sendKeys(name);

	       	     driver.findElement(By.name("est_address_2"))
	       	     .sendKeys(name);
	       	     
	       	     driver.findElement(By.name("est_address_city"))
	       	     .sendKeys(name);
	       	
	       	     WebElement estdist= driver.findElement(By.name("est_address_district_id"));
	       	 WebDriverUtils1.dropdownselect(estdist,"Jammu");
		        
		  	  
	       	  
		        driver.findElement(By.name("est_address_pincode"))
	       	     .sendKeys(name);
	       	        
	 /*--------------------------- 6. ------------------------------*/    
	       	        
	       	        
	          driver.findElement(By.name("business_type"))
	       	     .sendKeys(detail);
	       	     
	 /*-------------------------- 7. ------------------------------*/
	       	     
	       	     driver.findElement(By.name("prin_name"))
	       	     .sendKeys(name);

	       	     driver.findElement(By.name("prin_desig"))
	       	     .sendKeys(name);

	       	     driver.findElement(By.name("prin_address_1"))
	       	     .sendKeys(name);

	       	     driver.findElement(By.name("prin_address_2"))
	       	     .sendKeys(name);
	       	     
	       	     driver.findElement(By.name("prin_address_city"))
	       	     .sendKeys(name);
	       	    
	       	     WebElement pdist=driver.findElement(By.name("prin_address_district_id"));
	       	     WebDriverUtils1.dropdownselect(pdist,"Jammu");
	       	     
	       	     driver.findElement(By.name("prin_address_pincode"))
	       	     .sendKeys(name);
	       	     
	       	   /*---------------------------- 8. ------------------------------*/
	       	     
	       	     driver.findElement(By.name("nature_of_work"))  
	       	     .sendKeys(detail);
	       	    
	       	     
	       	     WebElement element=driver.findElement(By.name("commencement_date"));
	       	     String dateVal="2018-10-06";
	       	     
	       	     WebDriverUtils1.selectDateByjs(driver, element, dateVal);
	       	     
	       	     
	       	 
	       	     
	       	  WebElement element1=driver.findElement(By.name("termination_date"));
	       	     String dateVal1="2018-12-27";
	       	     
	       	     WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);
	       	     
	       	     driver.findElement(By.name("max_no_of_labour"))
	       	     .sendKeys(name);
	       	
	/*---------------------------- 9. -----------------------------*/
	       	     
	    driver.findElement(By.name("manager_name"))
	    .sendKeys(name);
	       	     
	    driver.findElement(By.name("manager_desig"))
	    .sendKeys(name);
	       	     
	   driver.findElement(By.name("manager_address_1"))
	    .sendKeys(name);
	       	     
	    driver.findElement(By.name("manager_address_2"))
	    .sendKeys(name);
	       	     
	    driver.findElement(By.name("manager_address_city"))
	   .sendKeys(name);
	       	     
	    WebElement mdist=driver.findElement(By.name("manager_address_district_id"));
	    WebDriverUtils1.dropdownselect(mdist,"Jammu");
	       	     
	   driver.findElement(By.name("manager_address_pincode"))
	    .sendKeys(name);
	       	     
	       	     
	/*----------------------------- 10. --------------------------------*/
	       	     
	     
	       driver.findElement(By.name("contractor_offence_detail"))
	       .sendKeys(detail);
	       	    
	 /*----------------------------- 11. --------------------------------*/	     
	       driver.findElement(By.name("contractor_license_issue"))
	       .sendKeys(detail);
	       
	       
	       
	       	     
	      WebElement eid= driver.findElement(By.name("list_doc_id"));
	      WebDriverUtils1.dropdownselect(eid, "Aadhaar Card");
	       	    
	      WebElement cpid= driver.findElement(By.name("photo_doc_id"));
	      WebDriverUtils1.dropdownselect(cpid,"Test_Certificate");
	       	     
	      WebElement cdid= driver.findElement(By.name("license_doc_id"));
	      WebDriverUtils1.dropdownselect(cdid,"Test_pan");
	       	     
	      WebElement cpdid =driver.findElement(By.name("prin_employer_doc_id"));
	      WebDriverUtils1.dropdownselect(cpdid, "PHOTOGRAPH"); 
	       	     
	      WebElement sid=driver.findElement(By.name("support_doc_id"));
	      WebDriverUtils1.dropdownselect(sid, "11");
	      Thread.sleep(1000);
	 
          
	
	}

}
