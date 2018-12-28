package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.BoilerAct1;
import org.dev.jklabour.objectRepositorys.BoilerRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test2BRenewal extends BaseClass1{

	  static int i=19;
	@Test
	
	public void boilerRegistrationTest() throws EncryptedDocumentException, Throwable
	{
		BoilerAct1 boiler= PageFactory.initElements(driver, BoilerAct1.class);
		boiler.boilerAct();;
		
		
		
		BoilerRenewal reg=PageFactory.initElements(driver, BoilerRenewal .class);
		reg.bRenew();
	
 /*---------------------------continue --------------------------*/		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		  
		   
		WebElement oldId=driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);
		
		driver.findElement(By.name("registration_number")).sendKeys("123456789");
		
		driver.findElement(By.id("btn-online-reg")).click();
		
	     
		
/*--------------------------Form start -----------------------------------*/
		FileUtiles fs=new FileUtiles("./excel/jklabourData.xlsx", "contractor");
		
		String ename=fs.getStringExcelData(i, 0);
		driver.findElement(By.name("establishment_name"))
		.sendKeys(ename);
		
		
 /*---------------------2. Postal address of the establishment-----------*/
		String add=fs.getStringExcelData(i, 1);
		driver.findElement(By.name("establishment_address_1"))
		.sendKeys(add);
		
		
		
		 String add2=fs.getStringExcelData(i, 2);
		 driver.findElement(By.name("establishment_address_2"))
		 .sendKeys(add2);
    
		 String city=fs.getStringExcelData(i, 3);
		 driver.findElement(By.name("establishment_address_city"))
		 .sendKeys(city);
		 
		 WebElement dist=driver.findElement(By.name("establishment_address_district_id"));
		 WebDriverUtils1.dropdown(dist, 2);
		
		
		 WebElement Circle= driver.findElement(By.name("establishment_address_circle_id"));
		 WebDriverUtils1.dropdown(Circle, 1);
		
		 
		 String pin= fs.convertDoubleToString(fs.getIntExcelData(i, 6));
		 driver.findElement(By.name("establishment_address_pincode"))
		 .sendKeys(pin);
		 
		 
  /*---------------------- Nature of work -----------------------*/	
		 
		 String  work=fs.getStringExcelData(i,7);
		 driver.findElement(By.name("nature_of_work"))
		 .sendKeys(work);
		 
		 
		 String rating=fs.convertDoubleToString(fs.getIntExcelData(i, 8));
		 driver.findElement(By.name("boiler_rating"))
		 .sendKeys(rating);
		 
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
		  
	
		  
		  WebElement support=driver.findElement(By.name("support_doc_id"));
		  WebDriverUtils1.dropdown(support,1);
		 
    /*---------------------------- submit form-------------------------------*/
	      
	      driver.findElement(By.id("submit-btn")).submit();
	       	            	    

	      BoilerAct1 boiler1= PageFactory.initElements(driver, BoilerAct1.class);
			boiler1.boilerAct();;
			
			
			
			BoilerRenewal reg2=PageFactory.initElements(driver, BoilerRenewal .class);
			reg2.bRenew();
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();	
			  
			
	}
	
}
