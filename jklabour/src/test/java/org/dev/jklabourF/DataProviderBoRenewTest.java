package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.BoilerAct1;
import org.dev.jklabour.objectRepositorys.BoilerRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBoRenewTest extends BaseClass1{

	@Test(dataProvider="getData")
	
	public void boilerRegistrationTest(Object name, Object fname, Object add, Object city, Object pin, Object design,
			Object no) throws EncryptedDocumentException, Throwable
	{
		BoilerAct1 boiler= PageFactory.initElements(driver, BoilerAct1.class);
		boiler.boilerAct();
		
		
		
		BoilerRenewal reg=PageFactory.initElements(driver, BoilerRenewal .class);
		reg.bRenew();
	
 /*---------------------------continue --------------------------*/		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		  
		   
		WebElement oldId=driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);
		
		driver.findElement(By.name("registration_number")).sendKeys("123456789");
		
		driver.findElement(By.id("btn-online-reg")).click();
		
	     
		
/*--------------------------Form start -----------------------------------*/

		
		 WebElement ele=driver.findElement(By.name("establishment_name"));
		 WebDriverUtils1.selectDataByjs(driver, ele, name); 
		
 /*---------------------2. Postal address of the establishment-----------*/
		
		 WebElement ele1=driver.findElement(By.name("establishment_address_1"));
		 WebDriverUtils1.selectDataByjs(driver, ele1, add); 
		 
		 WebElement ele2=driver.findElement(By.name("establishment_address_2"));
		 WebDriverUtils1.selectDataByjs(driver, ele2, add); 
		 
		 WebElement ele3= driver.findElement(By.name("establishment_address_city"));
		 WebDriverUtils1.selectDataByjs(driver, ele3, city); 
		 
		 
		 WebElement dist=driver.findElement(By.name("establishment_address_district_id"));
		 WebDriverUtils1.dropdown(dist, 2);
		
		
		 WebElement Circle= driver.findElement(By.name("establishment_address_circle_id"));
		 WebDriverUtils1.dropdown(Circle, 1);
		
		 
		 
		 WebElement ele4=driver.findElement(By.name("establishment_address_pincode"));
		 WebDriverUtils1.selectDataByjs(driver, ele4, pin); 
		 
		 
  /*---------------------- Nature of work -----------------------*/	
		 
		
		 driver.findElement(By.name("nature_of_work"))
		 .sendKeys("aerstdgfvhjktredysrxcgvjhbk@#$%^&234567");;
		
		 
		 WebElement ele6=driver.findElement(By.name("boiler_rating"));
		 WebDriverUtils1.selectDataByjs(driver, ele6, no); 
		 
		 WebElement folder =driver.findElement(By.name("boiler_folder_doc_id"));
		 WebDriverUtils1.dropdown(folder, 3);
		 
		 WebElement drawingsOfBoiler =driver.findElement(By.name("boiler_drawings_doc_id"));
		 WebDriverUtils1.dropdown(drawingsOfBoiler, 5);
		 
		 WebElement  attendant=driver.findElement(By.name("boiler_attendant_doc_id"));
		 WebDriverUtils1.dropdown(attendant, 2);
		 		 
		  WebElement  pipe =driver.findElement(By.name("pipe_layout_doc_id"));
		  WebDriverUtils1.dropdown(pipe, 3);
		  
		  WebElement welder =driver.findElement(By.name("boiler_welder_doc_id"));
		  WebDriverUtils1.dropdown(welder, 3);
		 
		  WebElement ssi =driver.findElement(By.name("letterhead_doc_id"));
		  WebDriverUtils1.dropdown(ssi, 2);
		  
		  WebElement ins=driver.findElement(By.name("pan_doc_id"));
		  WebDriverUtils1.dropdown(ins, 3);
		  
	
		 String s ="no";
			try{ if("Yes".contains(s))
			  {
				  driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
				  WebElement last=driver.findElement(By.name("last_certificate_doc_id"));
					WebDriverUtils1.dropdown(last, 2);
				  
					
					WebElement sell=driver.findElement(By.name("seller_doc_id"));
					WebDriverUtils1.dropdown(sell, 4);
							
					WebElement rec=driver.findElement(By.name("receipt_doc_id"));
					WebDriverUtils1.dropdown(rec, 2);

			  }  
				
			  
			  else {
				 driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
			  }
			  
			}catch (Exception e) {}  	
		  
		
		  WebElement support=driver.findElement(By.name("support_doc_id"));
		  WebDriverUtils1.dropdown(support,1);
		 
   /*---------------------------- submit form-------------------------------*/
		  Thread.sleep(20000);  
	      driver.findElement(By.id("submit-btn")).submit();
		  Thread.sleep(10000);  	            	    
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
