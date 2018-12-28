package org.dev.jklabourF;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ShopAct1;
import org.dev.jklabour.objectRepositorys.ShopRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.dev.jklabour.commonLibS.TestNGListerner.class)

public class Test2SRenew extends BaseClass1 {
	static int i=2;
	WebElement wec;
	@Test
	 public void createShopRegistrationFormTest() throws EncryptedDocumentException, Throwable
	 {
		ShopAct1 sa=PageFactory.initElements(driver, ShopAct1.class);
		sa.shop();
		
		ShopRenewal sr=PageFactory.initElements(driver, ShopRenewal.class);;
		sr.renewal();
	
		   
    driver.findElement(By.xpath("//button[@type='submit']")).click();	
        	  
       	   
     WebElement oldId=driver.findElement(By.name("registration_approval_file"));
     WebDriverUtils1.dropdown(oldId, 4);
      		
     driver.findElement(By.name("registration_number")).sendKeys("25092206");
      		
     driver.findElement(By.id("btn-online-reg")).click();
	
		FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "shop");
		String Ename= fl.getStringExcelData(2, 0);
		
		driver.findElement(By.xpath("//input[@name='est_name']")).
		sendKeys(Ename);;
		
		
 /*----------------2. Full postal address of the establishment-------------*/
	     
		String Eadd= fl.getStringExcelData(i, 1);
		
	    // driver.findElement(By.xpath("//input[@name='est_post_address_1']"))
		 driver.findElement(By.xpath("//input[@name='est_post_address_1']"))
	     .sendKeys(Eadd);
	     
		 String Ecity=fl.getStringExcelData(i, 2);
		 driver.findElement(By.xpath("//input[@name='est_post_address_city']"))
		 .sendKeys(Ecity);;
		
		 
		 String  pin=fl.convertDoubleToString(fl.getIntExcelData(i, 6));
		 driver.findElement(By.name("est_post_address_pincode"))
		 .sendKeys(pin);
		 try
		 {
		 WebElement we= driver.findElement(By.xpath("//select[@name='est_post_address_district_id']"));
		 WebDriverUtils1.dropdownselect(we, "Jammu");
		 
		 
		 
		 wec=driver.findElement(By.xpath("//select[@name='est_post_address_circle_id']"));
		 WebDriverUtils1.dropdownSelectByValue(wec, "1");
		
		 }
		 
		 
		 catch(Exception e)
		 
		 {
			System.out.println("=========="+wec+" circle selected=========="); 
		 }
		 
	
 /*-----------------6. employer’s family in the establishment,--------------*/		 
		 
		String efname=fl.getStringExcelData(i, 24);
		 driver.findElement(By.xpath("//input[@name='im_member_name[]']"))
		 .sendKeys(efname);;
		 
		 String age=fl.convertDoubleToString(fl.getIntExcelData(i, 25));
		 driver.findElement(By.xpath("//input[@name='im_member_age[]']"))
		 .sendKeys(age);
	     
		  String efr=fl.getStringExcelData( i, 26);
		 driver.findElement(By.xpath("//input[@name='im_member_relation[]']"))
		 .sendKeys(efr);;
		 
	WebElement gender= driver.findElement(By.xpath("//select[@name='im_member_sex[]']"));
		 WebDriverUtils1.dropdownselect(gender, "Female");
		 
//------------------------------ 6. add member  -------------------------
           
		 driver.findElement(By.xpath("//div[@class='col-md-12 im-partners']/following-sibling::div[text()='Add Member']")).click();
		 driver.findElement(By.xpath("//h1[text()='Member 2 Details']/following-sibling::div[1]/div/div/input[@name='im_member_name[]']"))
		 .sendKeys("ram");
		 
		 driver.findElement(By.xpath("//h1[text()='Member 2 Details']/following-sibling::div[2]/div/div/input[@name='im_member_age[]']"))
		 .sendKeys("25");
		 
		 driver.findElement(By.xpath("//h1[text()='Member 2 Details']/following-sibling::div[3]/div/div/input[@name='im_member_relation[]']"))
		 .sendKeys("father");
		 
		WebElement m2gender= driver.findElement(By.xpath("//h1[text()='Member 2 Details']/following-sibling::div[4]/div/select[@name='im_member_sex[]']"));
		WebDriverUtils1.dropdownSelectByValue(m2gender, "male");
		
		
	
 /*-------------------------12. ---------------------------*/
		WebElement hd= driver.findElement(By.name("holiday_day"));
		WebDriverUtils1.dropdownselect(hd, "Sunday");
		
		driver.findElement(By.name("mobile")).sendKeys("2365372731");
		
		WebElement rent= driver.findElement(By.name("rent_deed_doc_id"));
		 WebDriverUtils1.dropdownselect(rent, "Test_photo");
		
		WebElement doc_id =driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdownselect(doc_id, "PHOTOGRAPH");
		 
		WebElement pid =driver.findElement(By.name("partnership_deed_doc_id"));
		WebDriverUtils1.dropdownselect(pid, "11"); 
		
		WebElement uid=driver.findElement(By.name("photograph_unit_doc_id"));
		WebDriverUtils1.dropdownselect(uid, "rent deed"); 
		
		WebElement gst=driver.findElement(By.name("gst_other_doc_id"));
		WebDriverUtils1.dropdownselect(gst, "Pan Card");
		 
		WebElement supportid=driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdownselect(supportid, "Aadhaar Card");
		
		 driver.findElement(By.name("uploaded-photo")).click();
		 
		 
		 Properties pObj = FileUtiles.getpropertyData();
		 String bName=pObj.getProperty("browser");
		 if(bName.equals("firefox"))
		 { Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\f1.exe");}
		 
		 else {
			 Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\fc.exe");}
          Thread.sleep(3000);
		
		
	driver.findElement(By.xpath("//input[@value='Continue']")).submit();	
	Thread.sleep(4000);
	
          
       
	ShopAct1 sa1=PageFactory.initElements(driver, ShopAct1.class);
	sa1.shop();
	
	ShopRenewal sr1=PageFactory.initElements(driver, ShopRenewal.class);;
	sr1.renewal();

	   
driver.findElement(By.xpath("//button[@type='submit']")).click();	
    	  
	
        
	 }

 

	 
	 }


