package org.dev.jklabourF;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.ObjectRepositoryA.ShopEstablishmentRegistrationsMenu;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.dev.jklabour.objectRepositorys.ShopAct1;
import org.dev.jklabour.objectRepositorys.ShopRegistration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EditShopTest extends BaseClass1 {

	static int i = 2;
	WebElement wec;
	@Test

	public void Test1ShopReg() throws EncryptedDocumentException, Throwable {
		ShopAct1 sa = PageFactory.initElements(driver, ShopAct1.class);
		sa.shop();

		ShopRegistration sr = PageFactory.initElements(driver, ShopRegistration.class);
		;
		sr.shopRegister();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*------------ fill contractor form------------------------*/


		FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "shop");
		String Ename= fl.getStringExcelData(2, 0);
		
		driver.findElement(By.xpath("//input[@name='est_name']")).
		sendKeys(Ename);;
		
		
 /*----------------2. Full postal address of the establishment-------------*/
	     
		String Eadd= fl.getStringExcelData(i, 1);
		
	    // driver.findElement(By.xpath("//input[@name='est_post_address_1']"))
		 driver.findElement(By.xpath("//input[@name='est_post_address_1']"))
	     .sendKeys(Eadd);
	     
		 driver.findElement(By.xpath("//input[@name='est_post_address_2']"))
	     .sendKeys(Eadd);
	     
		 String Ecity=fl.getStringExcelData(i, 2);
		 driver.findElement(By.xpath("//input[@name='est_post_address_city']"))
		 .sendKeys(Ecity);;
		
		 
		 String  pin=fl.convertDoubleToString(fl.getIntExcelData(i, 6));
		 driver.findElement(By.name("est_post_address_pincode"))
		 .sendKeys(pin);
		 
		 WebElement we= driver.findElement(By.xpath("//select[@name='est_post_address_district_id']"));
		 try
		 { String dist1= WebDriverUtils1.dropdownselect(we, "Jammu");
	  	  System.out.println("selected dist ==>"+dist1);    
	  	      FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, dist1);
	        Thread.sleep(1000);
		  
		WebElement wec=driver.findElement(By.xpath("//select[@name='est_post_address_circle_id']"));
		WebDriverUtils1.dropdown(wec,2);
	     
		
		 }
		 
		 
		 catch(Exception e)
		 
		 {
			System.out.println("=========="+wec+" circle selected=========="); 
		 }
		 
	/*--------------------- 3. Full postal address of office -----------------*/
		 

		 
		 String epostAdd=fl.getStringExcelData(i, 7);
		 driver.findElement(By.xpath("//input[@name='est_post_extra_address_1']"))
		 .sendKeys(epostAdd);;
		 
		 String epostAdd2=fl.getStringExcelData(i, 8);
		 driver.findElement(By.xpath("//input[@name='est_post_extra_address_2']"))
		 .sendKeys(epostAdd2);
		 
		 String epostCity=fl.getStringExcelData( i, 9);
		 driver.findElement(By.xpath("//input[@name='est_post_extra_address_city']"))
		 .sendKeys(epostCity);
		 
		 WebElement pd=driver.findElement(By.xpath("//select[@name='est_post_extra_address_district_id']"));
		 WebDriverUtils1.dropdown(pd, 3);
		 
		 String epin=fl.convertDoubleToString(fl.getIntExcelData(i, 11));
		 driver.findElement(By.name("est_post_extra_address_pincode"))
		 .sendKeys(epin);;
		 
	/*--------------------- 4. partner block---------------------------------*/	 
		 
		String namep= fl.getStringExcelData( i, 12);
		 driver.findElement(By.name("member_name[]"))
		 .sendKeys(namep);;
		 
		String share= fl.convertDoubleToString(fl.getIntExcelData(i, 13));
		 driver.findElement(By.xpath("//input[@name='member_share[]']"))
		 .sendKeys(share);;
		 
		String madd  =fl.getStringExcelData( i, 14 );
		 driver.findElement(By.xpath("//input[@name='member_per_address[]']"))
		 .sendKeys(madd);;
		 
		 String des =fl.getStringExcelData( i,15  );
		 driver.findElement(By.xpath("//input[@name='member_designation[]']"))
		 .sendKeys(des);
		 
		 
		 
		
			 
		
		 
	/*--------------------5. permanent address of employer -------------------*/
		 
		 String mn1 =fl.getStringExcelData(i  , 16);
		 driver.findElement(By.xpath("//input[@name='manager_name']"))
		 .sendKeys(mn1);;
		 
		 
		 String per=fl.convertDoubleToString(fl.getIntExcelData(i, 17));
		 driver.findElement(By.xpath("//input[@name='manager_parentage']"))
		 .sendKeys("30%");;
		 
		 String md1=fl.getStringExcelData(i  , 18 );
		 driver.findElement(By.xpath("//input[@name='manager_designation']"))
		 .sendKeys(md1);;
		 
		 
		 String madd1 =fl.getStringExcelData(i ,19 );
		 driver.findElement(By.xpath("//input[@name='manager_address_1']"))
		 .sendKeys(madd1);;
		 
		
		 String mcity=fl.getStringExcelData( i ,21);
		 driver.findElement(By.xpath("//input[@name='manager_address_city']"))
		 .sendKeys(mcity);;
		 
		 
		 WebElement md=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
		 WebDriverUtils1.dropdown(md, 2);
		 
		 String mpin=fl.convertDoubleToString(fl.getIntExcelData(i, 23));
		 
		 driver.findElement(By.name("manager_address_pincode"))
		 .sendKeys(mpin);
		
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
		 


	
		
/*-------------------------------------------------------*/		
				
		 String involved_persons =fl.getStringExcelData(i, 28);
		 driver.findElement(By.xpath("//input[@name='confidential_involved_persons']"))
		 .sendKeys(involved_persons);;
		 
		 WebElement cat=driver.findElement(By.xpath("//select[@name='est_category']"));
		 WebDriverUtils1.dropdownSelectByValue(cat, "Computer Training Centres");
		
		 String nature=fl.getStringExcelData(i, 30);
		 driver.findElement(By.xpath("//textarea[@name='nature_of_business']"))
		 .sendKeys(nature);
		 
		 
		 String malew=fl.convertDoubleToString(fl.getIntExcelData(i, 31));
		 driver.findElement(By.name("employees_adult_male"))
		 .sendKeys(malew);
		 
		 String female= fl.convertDoubleToString(fl.getIntExcelData(i, 32));
		 driver.findElement(By.name("employees_adult_female")) 
		 .sendKeys(female);
		String total= driver.findElement(By.name("employees_adult_total")).getText();
		 System.out.println("total adult employee is - "+total);
		
		 /*---------------------------11.---------------------*/
		  	

		 String data =fl.getStringExcelData(i,34);
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
		 String totalFee= driver.findElement(By.className("fee-label")).getText() ;
		 
		 System.out.println("total fee==> "+ totalFee);
 /*-------------------------12. ---------------------------*/
		WebElement hd= driver.findElement(By.name("holiday_day"));
		WebDriverUtils1.dropdownselect(hd, "Sunday");
		
		driver.findElement(By.name("mobile")).sendKeys("2365372731");
		
		WebElement rent= driver.findElement(By.name("rent_deed_doc_id"));
		 WebDriverUtils1.dropdown(rent, 5);
		
		WebElement doc_id =driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdown(doc_id,7);
		 
		WebElement pid =driver.findElement(By.name("partnership_deed_doc_id"));
		WebDriverUtils1.dropdown(pid, 3); 
		
		WebElement uid=driver.findElement(By.name("photograph_unit_doc_id"));
		WebDriverUtils1.dropdown(uid, 7); 
		
		WebElement gst=driver.findElement(By.name("gst_other_doc_id"));
		WebDriverUtils1.dropdown(gst, 2);
		 
		WebElement supportid=driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdown(supportid, 5);
		
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
	
	 driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    
	 
          driver.switchTo().frame("paymentFrame");
          
          MakePayment mp=PageFactory.initElements(driver, MakePayment.class);
          mp.payment();
          mp.merchanSite();
          
          
          
          
          
          /*---------------------alert pop-up-------------------------*/
 	   try{  Alert alt= driver.switchTo().alert();
 	     
 	      alt.accept();
 	   }catch (Exception e) {
		// TODO: handle exception
	}
 	       Thread.sleep(8000);
 	    
 	   	/*------------------sceesfully complete payment verify-----*/
 	    String actmsg=driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();
 	  System.out.println("actual message ==>"+actmsg);
 	  
 	 // Assertr.assertEquals(actmsg, "Payment Transaction Completed Succcessfully ");
 	  if(actmsg.contains("Payment Transaction Completed Succcessfully"))
 	  {
 		System.out.print("transaction completed or  ");  
 		  
 	  }
 	  
 	    String trckingId=driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
 	    System.out.println("Tracking Id ==>"+trckingId);
 	    
 	   FileSet.setExcelData("./excel/jklabourData.xlsx", "trackinid" ,5, 3, trckingId);
 	   
	 

 


		String p = "li";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}
	
	
	@Test(priority=1)
	public void test2LIRevertBack() throws EncryptedDocumentException, Throwable
	{
		
		
		ShopEstablishmentRegistrationsMenu shop=PageFactory.initElements(driver, ShopEstablishmentRegistrationsMenu.class);
	    shop.ShopRegistrations();
	    
	    /*ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
		ap.gettrackingId();
		ap.doAction();*/
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

	LIRevertBackApplicant li =PageFactory.initElements(driver, LIRevertBackApplicant.class);;

	li.revertBack();

	driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div/textarea"))
	.sendKeys("edit Filed");

	driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();



	String p = "user";

	FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

		
	}
	
	
@Test(priority=2)
public void  test3UserSubmmit() throws EncryptedDocumentException, Throwable
{
	PostApplication pa = PageFactory.initElements(driver, PostApplication.class);
	pa.postApp();

	/*
	 * PostAppsEdit edit=PageFactory.initElements(driver,
	 * PostAppsEdit.class); edit.edit();
	 * //td[text()='68443012']/following-sibling::td/a[contains(text(),'Edit
	 * ')]
	 */

	FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
	String id = fl.getStringExcelData(5, 3);
	System.out.println(" TRACKING ID =i"+id);

	driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[contains(text(),'Edit')]"))
			.click();

	driver.findElement(By.xpath("//input[@value='Continue']")).submit();

	Thread.sleep(1000);

	driver.findElement(By.xpath("//input[@value='Continue']")).click();

	/*------------------------------revert back submitted suceesfully--------------------------*/

	try {
		String actmsg = driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();

		// Assertr.assertEquals(actmsg, "Payment Transaction Completed
		// Succcessfully ");
		if (actmsg.contains("Successfully Updated")) {
			System.out.println("revert back  ==>" + actmsg);
		}

		String status = driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
		System.out.println("current status of the application is ===>  " + status);

		String trckingId = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
		System.out.println("Tracking Id ==>" + trckingId);

	} catch (Exception e) {
		// TODO: handle exception
	}

}

  
  
}
