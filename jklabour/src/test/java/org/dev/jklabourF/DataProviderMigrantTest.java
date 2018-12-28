package org.dev.jklabourF;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.InterContractorRegistration;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMigrantTest extends BaseClass1{
	
	static int i=3;
	
	@Test(dataProvider="getData")
	public void registrationForm(Object name, Object fname, Object add, Object city, Object pin, Object design,
			Object no ) throws InterruptedException
	{
		InterStateMigrantAct1 act= PageFactory.initElements(driver, InterStateMigrantAct1.class);
	               act.StateMigrant();
	               
		InterContractorRegistration reg=PageFactory.initElements(driver, InterContractorRegistration.class);
	              reg.interStateContractor();
	              
	   
	              
	   driver.findElement(By.xpath("//button[@type='submit']")).click();	
	        	  
/*---------------------- fill contractor form -------------------------*/
	       			
	       	
	/*------------------------ 1. -------------------------------*/	
	       	   
	       	   
	   WebElement ele1=  driver.findElement(By.name("contractor_name"));
	   WebDriverUtils1.selectDataByjs(driver, ele1, name);
	       	    
	/*------------------------ 2.------------------------------*/     
	       	     
	       	 
	   WebElement ele2 = driver.findElement(By.name("contractor_fath_hus_name"));
	   WebDriverUtils1.selectDataByjs(driver, ele2,fname );  	    
	       	     
	       	  /*------------------------ 3. --------------------------*/
	       	     
	       	    
	   WebElement ele3 =  driver.findElement(By.name("contractor_address_1"));
	   WebDriverUtils1.selectDataByjs(driver, ele3,add );    	    
	       	     
	   WebElement ele4 =  driver.findElement(By.name("contractor_address_2"));
	   WebDriverUtils1.selectDataByjs(driver, ele4, add);    	   
	       		
	       	    
	   WebElement ele5 = driver.findElement(By.name("contractor_address_city"));
	   WebDriverUtils1.selectDataByjs(driver, ele5,city );   	   
	       	   
	   WebElement dist=driver.findElement(By.name("contractor_address_district_id")); 
	   WebDriverUtils1.dropdownselect(dist,"Jammu");
	 	       	    
	   WebElement ele6 = driver.findElement(By.name("contractor_address_pincode")); 	    
	   WebDriverUtils1.selectDataByjs(driver, ele6,pin);
/*---------------------------4. --------------------------------*/		
	       	    
	    WebElement ele=  driver.findElement(By.name("contractor_dob")) ;
	       	   String dob="1990-1-1";
	       	 WebDriverUtils1.selectDateByjs(driver, ele, dob);
	       	     
/*---------------------------5.---------------------------------*/
	       	   
	  	WebElement ele7 =  driver.findElement(By.name("est_name"));
	    WebDriverUtils1.selectDataByjs(driver, ele7, name);   	    
	       	     
	       	    
	  	WebElement ele8 = driver.findElement(By.name("est_address_1"));
	  	WebDriverUtils1.selectDataByjs(driver, ele8,add );   	    
	       	     
	  	WebElement ele9 = driver.findElement(By.name("est_address_2"));
	    WebDriverUtils1.selectDataByjs(driver, ele9,add );   	    
	       	     
	  	WebElement ele10 = driver.findElement(By.name("est_address_city"));
	    WebDriverUtils1.selectDataByjs(driver, ele10,city );
	  	
	    WebElement estdist= driver.findElement(By.name("est_address_district_id"));
	    WebDriverUtils1.dropdownselect(estdist,"Jammu");
	       	    
    	         
	    WebElement ele11 = driver.findElement(By.name("est_address_pincode"));
	    WebDriverUtils1.selectDataByjs(driver, ele11, pin );   	    
	       	        
	 /*--------------------------- 6. ------------------------------*/    
	       	        
	       	        
	       	    
	driver.findElement(By.name("business_type")).sendKeys("ytegdhiajd@#$%^&*(567");;
	    
	    
	 /*-------------------------- 7. ------------------------------*/
	       	     
	       	 
	    WebElement ele13 =driver.findElement(By.name("prin_name"));
	    WebDriverUtils1.selectDataByjs(driver, ele13, fname);  
	       	     
	    WebElement ele14 = driver.findElement(By.name("prin_desig"));
	    WebDriverUtils1.selectDataByjs(driver, ele14,design );
	       	     
	    WebElement ele15 = driver.findElement(By.name("prin_address_1"));
	    WebDriverUtils1.selectDataByjs(driver, ele15, add);
	    
	    WebElement ele16 = driver.findElement(By.name("prin_address_2"));
	    WebDriverUtils1.selectDataByjs(driver, ele16, add);	       	  
	       	     
	    WebElement ele17 = driver.findElement(By.name("prin_address_city"));
	    WebDriverUtils1.selectDataByjs(driver, ele17,city );   	  
	       	     
	       	    
	    WebElement pdist=driver.findElement(By.name("prin_address_district_id"));
	    WebDriverUtils1.dropdownselect(pdist,"Jammu");
	       	     
	       	   
	    WebElement ele18 = driver.findElement(By.name("prin_address_pincode"));
	    WebDriverUtils1.selectDataByjs(driver, ele18,pin );  	    
 /*---------------------------- 8. ------------------------------*/
	       	     
	       	 driver.findElement(By.name("nature_of_work"))
	    		.sendKeys("hbajkfwety456i78@#$%^&*");  
	       	    
	       	     
	    WebElement element=driver.findElement(By.name("commencement_date"));
	    String dateVal="2018-10-06";  	     
	    WebDriverUtils1.selectDateByjs(driver, element, dateVal);
       
	    WebElement element1=driver.findElement(By.name("termination_date"));
	    String dateVal1="2018-12-27";
	    WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);
	       	     
	       	  
	    WebElement ele20 = driver.findElement(By.name("max_no_of_labour"));
	    WebDriverUtils1.selectDataByjs(driver, ele20, no);   	    
	/*---------------------------- 9. -----------------------------*/
	       	     
	   
	    WebElement ele21 = driver.findElement(By.name("manager_name"));
	    WebDriverUtils1.selectDataByjs(driver, ele21, name);
	  
	    WebElement ele22 = driver.findElement(By.name("manager_desig"));
	    WebDriverUtils1.selectDataByjs(driver, ele22,design );
	       	     
	   
	    WebElement ele23 = driver.findElement(By.name("manager_address_1"));
	    WebDriverUtils1.selectDataByjs(driver, ele23, add);
	    
	    WebElement ele24 = driver.findElement(By.name("manager_address_2"));
	    WebDriverUtils1.selectDataByjs(driver, ele24,add );
	    
	    WebElement ele25 = driver.findElement(By.name("manager_address_city"));
	    WebDriverUtils1.selectDataByjs(driver, ele25,city );
	       	     
	    WebElement mdist=driver.findElement(By.name("manager_address_district_id"));
	    WebDriverUtils1.dropdownselect(mdist,"Jammu");
	       	     
	    WebElement ele26 =driver.findElement(By.name("manager_address_pincode"));
	    WebDriverUtils1.selectDataByjs(driver, ele26, pin);
	       	     
	       	     
	/*----------------------------- 10. --------------------------------*/
    
	       
	   driver.findElement(By.name("contractor_offence_detail"))
	   .sendKeys("bjsxydhtysudaijkl@34567890%^&*(");;
	
	       	    
	 /*----------------------------- 11. --------------------------------*/	     
	       	   
	       	     
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
	 
 /*---------------------------- submit form-------------------------------*/
	      
	      driver.findElement(By.id("submit-btn")).submit();
	       	            	    
 /*---------------------------- next page --------------------------------*/
	       	   
	      
	      driver.findElement(By.xpath("//input[@value='Continue']")).click();
	       	        	
	       	  	
	}
	@DataProvider
	 public  Object[][] getData()
	 {
		Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet1");
		return data;
	 }

}
