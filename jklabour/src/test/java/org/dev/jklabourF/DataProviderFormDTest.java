package org.dev.jklabourF;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FormD;
import org.dev.jklabour.objectRepositorys.ShopAct1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderFormDTest  extends BaseClass1{


	WebElement wec;
	@Test(dataProvider="getData")
	 public void createShopRegistrationFormTest(Object name,Object add ,Object city ,Object pin ,Object design ,Object per,
				Object m, Object f) throws EncryptedDocumentException, Throwable
	 {
		ShopAct1 sa=PageFactory.initElements(driver, ShopAct1.class);
		sa.shop();
		FormD d=PageFactory.initElements(driver, FormD.class);;
		d.FormD();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

/*--------------------------- Form start --------------------------*/		
		
		
		
		WebElement ele =driver.findElement(By.xpath("//input[@name='est_name']"));
		WebDriverUtils1.selectDataByjs(driver, ele, name); 
	     
		
		
 /*----------------2. Full postal address of the establishment-------------*/
		  // driver.findElement(By.xpath("//input[@name='est_post_address_1']"))
		WebElement en= driver.findElement(By.xpath("//input[@name='est_post_address_1']"));
		 WebDriverUtils1.selectDataByjs(driver, en, add);
	     
			WebElement en1= driver.findElement(By.xpath("//input[@name='est_post_address_2']"));
			 WebDriverUtils1.selectDataByjs(driver, en1, add);
		     
			
		
		 WebElement en2= driver.findElement(By.xpath("//input[@name='est_post_address_city']"));
		 WebDriverUtils1.selectDataByjs(driver, en2, city);
		 
		 
		 WebElement en3=  driver.findElement(By.name("est_post_address_pincode"));
		 WebDriverUtils1.selectDataByjs(driver, en3, pin);
	
		 WebElement we= driver.findElement(By.xpath("//select[@name='est_post_address_district_id']"));
		 WebDriverUtils1.dropdownselect(we, "Jammu");
		 
		 
		
	/*--------------------- 3. Full postal address of office -----------------*/
		
		 
		 
		 WebElement en4=  driver.findElement(By.xpath("//input[@name='est_post_extra_address_1']"));
		 WebDriverUtils1.selectDataByjs(driver, en4, add);
		 
		
		 WebElement en5= driver.findElement(By.xpath("//input[@name='est_post_extra_address_2']"));
		 WebDriverUtils1.selectDataByjs(driver, en5, add);
		 
		
		 WebElement en6=  driver.findElement(By.xpath("//input[@name='est_post_extra_address_city']"));
		 WebDriverUtils1.selectDataByjs(driver, en6, city);
		 
		 WebElement pd=driver.findElement(By.xpath("//select[@name='est_post_extra_address_district_id']"));
		 WebDriverUtils1.dropdown(pd, 3);
		 
		 
		 WebElement en7=  driver.findElement(By.name("est_post_extra_address_pincode"));
		 WebDriverUtils1.selectDataByjs(driver, en7, pin);
	/*--------------------- 4. partner block---------------------------------*/	 
		 
		
		 WebElement en8= driver.findElement(By.name("member_name[]"));
		 WebDriverUtils1.selectDataByjs(driver, en8, name);
		 
		
		 WebElement en9=  driver.findElement(By.xpath("//input[@name='member_share[]']"));
		 WebDriverUtils1.selectDataByjs(driver, en9, per);
		 
		
		 WebElement en10=  driver.findElement(By.xpath("//input[@name='member_per_address[]']"));
		 WebDriverUtils1.selectDataByjs(driver, en10, add);
		 
		
		 WebElement en11=  driver.findElement(By.xpath("//input[@name='member_designation[]']"));
		 WebDriverUtils1.selectDataByjs(driver, en11, design);
		 
		 
		 
	
	/*--------------------5. permanent address of employer -------------------*/
		 
		
		 WebElement en12=  driver.findElement(By.xpath("//input[@name='manager_name']"));
		 WebDriverUtils1.selectDataByjs(driver, en12, name);
		 
		 
		
		 WebElement en13=  driver.findElement(By.xpath("//input[@name='manager_parentage']"));
		 WebDriverUtils1.selectDataByjs(driver, en13, per);
		 
		
		 WebElement en14= 	 driver.findElement(By.xpath("//input[@name='manager_designation']"));
		 WebDriverUtils1.selectDataByjs(driver, en14, design);
		 
		 
		
		 WebElement en15= 	 driver.findElement(By.xpath("//input[@name='manager_address_1']"));
		 WebDriverUtils1.selectDataByjs(driver, en15, add);
		
		
		 WebElement en16= 	 driver.findElement(By.xpath("//input[@name='manager_address_2']"));
		 WebDriverUtils1.selectDataByjs(driver, en16, add);
		
		
		 WebElement en17= 	 driver.findElement(By.xpath("//input[@name='manager_address_city']"));
		 WebDriverUtils1.selectDataByjs(driver, en17, city);
		 
		 
		 WebElement md111=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
		 WebDriverUtils1.dropdown(md111, 2);
		 
		 		 
		 WebElement en18=  driver.findElement(By.name("manager_address_pincode"));
		 WebDriverUtils1.selectDataByjs(driver, en18, pin);
		
		 
		 
/*-----------------6. employer’s family in the establishment,--------------*/		 
		 
		
		 WebElement en19=  driver.findElement(By.xpath("//input[@name='im_member_name[]']"));
		 WebDriverUtils1.selectDataByjs(driver, en19, name);
		 
		
		 WebElement en20=  driver.findElement(By.xpath("//input[@name='im_member_age[]']"));
		 WebDriverUtils1.selectDataByjs(driver, en20, m);
	     
		  
		 WebElement en21=  driver.findElement(By.xpath("//input[@name='im_member_relation[]']"));
		 WebDriverUtils1.selectDataByjs(driver, en21, name);
		 
	WebElement gender= driver.findElement(By.xpath("//select[@name='im_member_sex[]']"));
		 WebDriverUtils1.dropdownselect(gender, "Female");
		 
//------------------------------ 6. add member  -------------------------
          
		
		 

		 
		
	
		
/*-------------------------------------------------------*/		
				
		
		 driver.findElement(By.xpath("//input[@name='confidential_involved_persons']"))
		 .sendKeys("vdghajhd!@#$%^&*hgdfgs234567");
		 
		 WebElement cat=driver.findElement(By.xpath("//select[@name='est_category']"));
		 WebDriverUtils1.dropdownSelectByValue(cat, "Computer Training Centres");
		
		
		 driver.findElement(By.xpath("//textarea[@name='nature_of_business']"))
		 .sendKeys("vdghajhd!@#$%^&*hgdfgs234567");
		 
		 
	
		 WebElement en22=  driver.findElement(By.name("employees_adult_male"));
		 WebDriverUtils1.selectDataByjs(driver, en22, m);
		 
		
		 WebElement en23=  driver.findElement(By.name("employees_adult_female")) ;
		 WebDriverUtils1.selectDataByjs(driver, en23,f);
		
		 String total= driver.findElement(By.name("employees_adult_total")).getText();
		 System.out.println("total adult employee is - "+total);
		
		 /*---------------------------11.---------------------*/
		  	

		 String data ="1 year";
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
	        
	        
	        
	    //------------------------------------------------------
	        
	   	 
			 
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
	       		WebDriverUtils1.dropdown(uid, 2); 
	       		
	       		WebElement gst=driver.findElement(By.name("gst_other_doc_id"));
	       		WebDriverUtils1.dropdown(gst, 4);
	       		 
	       		WebElement supportid=driver.findElement(By.name("support_doc_id"));
	       		WebDriverUtils1.dropdown(supportid,5);
	       		
	       		 driver.findElement(By.name("uploaded-photo")).click();
	       		 
	       		 
	       		 Properties pObj = FileUtiles.getpropertyData();
	       		 String bName=pObj.getProperty("browser");
	       		 if(bName.equals("firefox"))
	       		 { Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\f1.exe");}
	       		 
	       		 else {
	       			 Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\fc.exe");}
	                 Thread.sleep(3000);
	       		
	        
	        
	       
		driver.findElement(By.name("est_registration_no")).sendKeys("123456"); 
		 driver.findElement(By.name("est_requested_change")).sendKeys("yes");
		
		  Thread.sleep(20000);
		 
		 driver.findElement(By.xpath("//input[@value='Continue']")).submit();	
			Thread.sleep(3000);
		}
		
		@DataProvider
		 public  Object[][] getData()
		 {
			Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet2");
			return data;
		 }
		

	}
