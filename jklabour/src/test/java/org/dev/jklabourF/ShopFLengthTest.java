


/*
 * @author hudelabs
 * 
 */
package org.dev.jklabourF;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ShopAct1;
import org.dev.jklabour.objectRepositorys.ShopRegistration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShopFLengthTest extends BaseClass1 {
	static int i=2;
	@Test
	public void shopRegFLengthTest() throws EncryptedDocumentException, Throwable
	{
		ShopAct1 sa=PageFactory.initElements(driver, ShopAct1.class);
		sa.shop();
		
		ShopRegistration sr=PageFactory.initElements(driver, ShopRegistration.class);;
		sr.shopRegister();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	
	   /*------------ fill contractor form------------------------*/
		
		

	    String name="Lorem passages, and more recently with desktop"
	    		+ " publishing software like Aldus PageMaker including "
	    		+ "versions of Lorem Ipsum.";
	    		
	    String detail="Lorem passages, and more recently with desktop"
	    		+ " publishing software like Aldus PageMaker including "
	    		+ "versions of Lorem Ipsum."
	    		+"Lorem passages, and more recently with desktop"
	    	    + " publishing software like Aldus PageMaker including "
	    	    + "versions of Lorem Ipsum."+ " publishing software like Aldus PageMaker including "
	    		+ "versions of Lorem Ipsum."
	    		+"Lorem passages, and more recently with desktop"
	    	    + " publishing software like Aldus PageMaker including "
	    	    + "versions of Lorem Ipsum."
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
		
		
		driver.findElement(By.xpath("//input[@name='est_name']")).
		sendKeys(name);;
		
		
 /*----------------2. Full postal address of the establishment-------------*/
	     
	
		
		 driver.findElement(By.xpath("//input[@name='est_post_address_1']"))
	     .sendKeys(name);

		 driver.findElement(By.xpath("//input[@name='est_post_address_2']"))
	     .sendKeys(name);
	     
	
		 driver.findElement(By.xpath("//input[@name='est_post_address_city']"))
		 .sendKeys(name);
		
		 
		
		 driver.findElement(By.name("est_post_address_pincode"))
		 .sendKeys(name);
		
		 WebElement we= driver.findElement(By.xpath("//select[@name='est_post_address_district_id']"));
		 try
		 { WebDriverUtils1.dropdownselect(we, "Jammu");
	  
	     WebElement wec=driver.findElement(By.xpath("//select[@name='est_post_address_circle_id']"));
		WebDriverUtils1.dropdown(wec,1);
	     
		
		 }
		 
		 
		 catch(Exception e){ }
		 
	/*--------------------- 3. Full postal address of office -----------------*/
		 

		 
	
		 driver.findElement(By.xpath("//input[@name='est_post_extra_address_1']"))
		 .sendKeys(name);;
		 
		 
		 driver.findElement(By.xpath("//input[@name='est_post_extra_address_2']"))
		 .sendKeys(name);;
		 
		
		 driver.findElement(By.xpath("//input[@name='est_post_extra_address_city']"))
		 .sendKeys(name);;
		 
		 WebElement pd=driver.findElement(By.xpath("//select[@name='est_post_extra_address_district_id']"));
		 WebDriverUtils1.dropdown(pd, 3);
		 
		 
		 driver.findElement(By.name("est_post_extra_address_pincode"))
		 .sendKeys(name);;
		 
	/*--------------------- 4. partner block---------------------------------*/	 
		 
		
		 driver.findElement(By.name("member_name[]"))
		 .sendKeys(name);;
		 
		
		 driver.findElement(By.xpath("//input[@name='member_share[]']"))
		 .sendKeys(name);;
		 
		
		 driver.findElement(By.xpath("//input[@name='member_per_address[]']"))
		 .sendKeys(name);;
		 
		
		try{ driver.findElement(By.xpath("//input[@name='member_designation[]']"))
		 .sendKeys(name);;
		}catch (Exception e) {
			
		}
		 
		 
	
		 
	/*--------------------5. permanent address of employer -------------------*/
		 
		
		 driver.findElement(By.xpath("//input[@name='manager_name']"))
		 .sendKeys(name);;
		 
		 
		 
		 driver.findElement(By.xpath("//input[@name='manager_parentage']"))
		 .sendKeys(name);;
		 
		
		 driver.findElement(By.xpath("//input[@name='manager_designation']"))
		 .sendKeys(name);;
		 
		 
		 
		 driver.findElement(By.xpath("//input[@name='manager_address_1']"))
		 .sendKeys(name);;
		 
		
		 
		 driver.findElement(By.xpath("//input[@name='manager_address_city']"))
		 .sendKeys(name);;
		 
		 
		 WebElement md=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
		 WebDriverUtils1.dropdown(md, 2);
		
		 driver.findElement(By.name("manager_address_pincode"))
		 .sendKeys(name);;
		
 /*-----------------6. employer’s family in the establishment,--------------*/		 
		 
		
		 driver.findElement(By.xpath("//input[@name='im_member_name[]']"))
		 .sendKeys(name);;
		 
		
		 driver.findElement(By.xpath("//input[@name='im_member_age[]']"))
		 .sendKeys(name);;
	     
		 
		 driver.findElement(By.xpath("//input[@name='im_member_relation[]']"))
		 .sendKeys(name);;
		 
	WebElement gender= driver.findElement(By.xpath("//select[@name='im_member_sex[]']"));
		 WebDriverUtils1.dropdownselect(gender, "Female");
		 


		
/*-------------------------------------------------------*/		
				

		 driver.findElement(By.xpath("//input[@name='confidential_involved_persons']"))
		 .sendKeys(name);;
		 
		 WebElement cat=driver.findElement(By.xpath("//select[@name='est_category']"));
		 WebDriverUtils1.dropdownSelectByValue(cat, "Computer Training Centres");
		
		 
		 driver.findElement(By.xpath("//textarea[@name='nature_of_business']"))
		 .sendKeys(detail);;
		 
		 
		
		 driver.findElement(By.name("employees_adult_male"))
		 .sendKeys(name);;
		 
		 
		 driver.findElement(By.name("employees_adult_female")) 
		 .sendKeys(name);;
		 
		String total= driver.findElement(By.name("employees_adult_total")).getText();
		 System.out.println("total adult employee is - "+total);
		
		 /*---------------------------11.---------------------*/
		  	

		 String data =name;
	     System.out.println("\n "+data);
	      
	        if ("1 year".contains(data))
	         {
	       	 driver.findElement(By.xpath("//input[@value='1']")).click();
	        }
	       
	        else if("2 year".contains(data))
	        {
	        	driver.findElement(By.xpath("//input[@value='2']")).click();
	        }
	
	        else{
	        	driver.findElement(By.xpath("//input[@value='3']")).click();
	        }
	        
	        
	        driver.findElement(By.xpath("//div[text()='Check Fee']")).click();
	        Thread.sleep(500);
		 driver.findElement(By.className("fee-label")).getText() ;
		 
		 
 /*-------------------------12. ---------------------------*/
		WebElement hd= driver.findElement(By.name("holiday_day"));
		WebDriverUtils1.dropdownselect(hd, "Sunday");
		
		driver.findElement(By.name("mobile")).sendKeys(name);
		
		WebElement rent= driver.findElement(By.name("rent_deed_doc_id"));
		 WebDriverUtils1.dropdown(rent, 2);
		
		WebElement doc_id =driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdown(doc_id,5);
		 
		WebElement pid =driver.findElement(By.name("partnership_deed_doc_id"));
		WebDriverUtils1.dropdown(pid, 6); 
		
		WebElement uid=driver.findElement(By.name("photograph_unit_doc_id"));
		WebDriverUtils1.dropdown(uid, 4); 
		
		WebElement gst=driver.findElement(By.name("gst_other_doc_id"));
		WebDriverUtils1.dropdown(gst,3);
		 
		WebElement supportid=driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdown(supportid, 3);
		
		 driver.findElement(By.name("uploaded-photo")).click();
		 
		 
		 Properties pObj = FileUtiles.getpropertyData();
		 String bName=pObj.getProperty("browser");
		 if(bName.equals("firefox"))
		 { Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\f1.exe");}
		 
		 else {
			 Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\fc.exe");}
          Thread.sleep(3000);
		

	}
	
	
	

}
