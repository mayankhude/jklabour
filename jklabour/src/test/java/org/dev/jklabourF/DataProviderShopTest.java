package org.dev.jklabourF;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ShopAct1;
import org.dev.jklabour.objectRepositorys.ShopRegistration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderShopTest  extends BaseClass1{

	static WebElement wec;
	
	@Test(dataProvider="getData")
	public void  dataTest(Object name,Object add ,Object city ,Object pin ,Object design ,Object per,
				Object m, Object f) throws Throwable
	{
		
		  
		
		
		ShopAct1 sa=PageFactory.initElements(driver, ShopAct1.class);
		sa.shop();
		
		ShopRegistration sr=PageFactory.initElements(driver, ShopRegistration.class);;
		sr.shopRegister();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
/*----------------------form -------------------------*/
		
		WebElement en=driver.findElement(By.xpath("//input[@name='est_name']"));
		WebDriverUtils1.selectDataByjs(driver, en, name);
		
		
		WebElement ele1 = driver.findElement(By.xpath("//input[@name='est_post_address_1']"));
		WebDriverUtils1.selectDataByjs(driver, ele1, add);
		
		WebElement ele11 = driver.findElement(By.xpath("//input[@name='est_post_address_2']"));
		WebDriverUtils1.selectDataByjs(driver, ele11, add);
		
		WebElement ele2 =	 driver.findElement(By.xpath("//input[@name='est_post_address_city']"));
	    WebDriverUtils1.selectDataByjs(driver, ele2, city);
		 
	    WebElement ele3 = driver.findElement(By.name("est_post_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele3, pin);
		
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
		 
	/*--------------------- 3. Full postal address of office -----------------*/
		
		 
	  WebElement ele4 = driver.findElement(By.xpath("//input[@name='est_post_extra_address_1']"));
	  WebDriverUtils1.selectDataByjs(driver, ele4, add);
	 
	  WebElement ele41 = driver.findElement(By.xpath("//input[@name='est_post_extra_address_2']"));
	  WebDriverUtils1.selectDataByjs(driver, ele41, add);
	  
	  WebElement ele5 =	driver.findElement(By.xpath("//input[@name='est_post_extra_address_city']"));
	  WebDriverUtils1.selectDataByjs(driver, ele5, add);	 
			  
	  WebElement pd=driver.findElement(By.xpath("//select[@name='est_post_extra_address_district_id']"));
	  WebDriverUtils1.dropdown(pd, 3);
		 
		 
      WebElement ele6 =  driver.findElement(By.name("est_post_extra_address_pincode"));
      WebDriverUtils1.selectDataByjs(driver, ele6, pin); 
		
		 
 /*----------------------------4.----------------------------*/
	  WebElement ele7 =  driver.findElement(By.name("member_name[]"));
	  WebDriverUtils1.selectDataByjs(driver, ele7, name);
	  
	  WebElement ele8 =  driver.findElement(By.xpath("//label[text()='Share in Percentage']/following-sibling::div/div/input"));
	  WebDriverUtils1.selectDataByjs(driver, ele8, per);
	  
	  WebElement ele9 =  driver.findElement(By.xpath("//input[@name='member_per_address[]']"));
	  WebDriverUtils1.selectDataByjs(driver, ele9, add);
	  
	  WebElement ele10 = driver.findElement(By.xpath("//input[@name='member_designation[]']"));
	  WebDriverUtils1.selectDataByjs(driver, ele10, design);
/*-----------------------------5.--------------------------------*/
		 
  
	  WebElement ele1b =driver.findElement(By.xpath("//input[@name='manager_name']"));
	  WebDriverUtils1.selectDataByjs(driver, ele1b, name);
	  
	  WebElement ele12 =driver.findElement(By.xpath("//input[@name='manager_parentage']"));
	  WebDriverUtils1.selectDataByjs(driver, ele12, per);
	  
	  
	  WebElement ele12a =driver.findElement(By.xpath("//input[@name='manager_designation']"));
	  WebDriverUtils1.selectDataByjs(driver, ele12a, design);
	  
	  
	  WebElement ele12b =driver.findElement(By.xpath("//input[@name='manager_address_1']"));
	  WebDriverUtils1.selectDataByjs(driver, ele12b, add);
	  
	  WebElement ele12c =driver.findElement(By.xpath("//input[@name='manager_address_2']"));
	  WebDriverUtils1.selectDataByjs(driver, ele12b, add);
	  
	 
	  WebElement ele13 =driver.findElement(By.xpath("//input[@name='manager_address_city']"));
	  WebDriverUtils1.selectDataByjs(driver, ele13, city); 
		 
   
	  WebElement md=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
      WebDriverUtils1.dropdown(md, 2);
		 
	
		 
      WebElement ele14 =driver.findElement(By.name("manager_address_pincode"));
      WebDriverUtils1.selectDataByjs(driver, ele14, pin); 
		 
/*-----------------6. employer’s family in the establishment,--------------*/		 
		 
  
      WebElement ele15 = driver.findElement(By.xpath("//label[contains(text(),'6. Particulars of members of employer’s ')]/following-sibling::div[1]/div[1]/div[1]/div/div/input"));
      WebDriverUtils1.selectDataByjs(driver, ele15, name);
      
      WebElement ele15a=driver.findElement(By.xpath("//label[text()='Age']/following-sibling::div/div/input"));
      WebDriverUtils1.selectDataByjs(driver, ele15a, m);
      
  
      WebElement ele16 =driver.findElement(By.xpath("//label[contains(text(),'6. Particulars of members of employer’s ')]/following-sibling::div[1]/div[1]/div[4]/div/div/input"));
      WebDriverUtils1.selectDataByjs(driver, ele16, name);
      
      WebElement gender= driver.findElement(By.xpath("//label[contains(text(),'6. Particulars of members of employer’s ')]/following-sibling::div[1]/div[1]//div[5]/div/select"));
      WebDriverUtils1.dropdownselect(gender, "Female");
			 	 
		
			 
			 
			 /*-------------------------------------------------------*/		
	
			
    driver.findElement(By.xpath("//input[@name='confidential_involved_persons']"))
     .sendKeys("ertdygio;iuytd12345678@#$%^&*&%GFHJ");;
     			 

     WebElement cat=driver.findElement(By.xpath("//select[@name='est_category']"));
     WebDriverUtils1.dropdownSelectByValue(cat, "Computer Training Centres");	 
 
    driver.findElement(By.xpath("//textarea[@name='nature_of_business']"))
    .sendKeys("ertdygio;iuytd12345678@#$%^&*&%GFHJ");;
    

     WebElement ele19 =	 driver.findElement(By.name("employees_adult_male"));
     WebDriverUtils1.selectDataByjs(driver, ele19, m);		

     WebElement ele20 =	 driver.findElement(By.name("employees_adult_female")) ;
     WebDriverUtils1.selectDataByjs(driver, ele20, f);		
			
     
     String total= driver.findElement(By.name("employees_adult_total")).getText();
	 System.out.println("total adult employee is - "+total);
			
			 /*---------------------------11.---------------------*/
			  	

			String year="1year";
		      
		        if ("1 year".contains((CharSequence) year))
		         {
		       	 driver.findElement(By.xpath("//input[@value='1']")).click();
		        }
		       
		        else if("2 year".contains((CharSequence) year))
		        {
		        	driver.findElement(By.xpath("//input[@value='2']")).click();
		        }
		
		        else{
		        	driver.findElement(By.xpath("//input[@value='3']")).click();
		        }
		        
		        
		        driver.findElement(By.xpath("//div[text()='Check Fee']")).click();
		        Thread.sleep(500);
			
			 

			 
			 /*-------------------------12. ---------------------------*/
				WebElement hd= driver.findElement(By.name("holiday_day"));
				WebDriverUtils1.dropdownselect(hd, "Sunday");
				
				driver.findElement(By.name("mobile")).sendKeys("2365372731");
				
				WebElement rent= driver.findElement(By.name("rent_deed_doc_id"));
				 WebDriverUtils1.dropdown(rent,4);
				
				WebElement doc_id =driver.findElement(By.name("license_doc_id"));
				WebDriverUtils1.dropdown(doc_id, 6);
				 
				WebElement pid =driver.findElement(By.name("partnership_deed_doc_id"));
				WebDriverUtils1.dropdown(pid, 1); 
				
				WebElement uid=driver.findElement(By.name("photograph_unit_doc_id"));
				WebDriverUtils1.dropdown(uid, 2); 
				
				WebElement gst=driver.findElement(By.name("gst_other_doc_id"));
				WebDriverUtils1.dropdown(gst, 4);
				 
				WebElement supportid=driver.findElement(By.name("support_doc_id"));
				WebDriverUtils1.dropdown(supportid, 5);
				 
	/*			 driver.findElement(By.name("uploaded-photo")).click();
				 Thread.sleep(2000);
				 
				 Properties pObj11 = FileUtiles.getpropertyData();
				 String bName1=pObj11.getProperty("browser");
				 if(bName1.equals("firefox"))
				 { Runtime.getRuntime().exec("C:\\Users\\welcome\\Desktop\\f1.exe");}
				 
				 else {
					 Runtime.getRuntime().exec("C:\\Users\\welcome\\Desktop\\fc.exe");}
		          Thread.sleep(3000);
				
		          Thread.sleep(40000);*/
			driver.findElement(By.xpath("//input[@value='Continue']")).submit();	
			Thread.sleep(20000);
			  driver.findElement(By.name("uploaded-photo")).click();
			 driver.findElement(By.xpath("//input[@value='Continue']")).click();
			    
			 
				 
			 
		 
	}
	
	@DataProvider
	 public  Object[][] getData()
	 {
		Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet2");
		return data;
	 }
	

}
