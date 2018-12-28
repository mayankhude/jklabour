package org.dev.jklabourF;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TS4  extends BaseClass1{
	
	
	@Test
	
	
	public void editRevert() throws Throwable
	{
	
	
	PostApplication pa=PageFactory.initElements(driver, PostApplication.class);
	pa.postApp();
	
	
	
	
	 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		// String id=fl.convertDoubleToString(fl.getIntExcelData(5,3));
		 String id=fl.getStringExcelData(5, 3);
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[contains(text(),'Pay Compound Fee')]"))
		.click();
		
		
		/*-----------------------make payment----------------------*/
	    driver.switchTo().frame("paymentFrame");
		
		MakePayment mp=PageFactory.initElements(driver, MakePayment.class);
	     mp.payment();
	     mp.merchanSite();
  
	     
	try{Alert alt= driver.switchTo().alert();	     
	      alt.accept();
	      }catch (Exception e){}
	       Thread.sleep(6000);
	    
		
		/*----------------------final status or msg --------------------------*/
		
		  
		
	
/*	PostAppsEdit edit=PageFactory.initElements(driver, PostAppsEdit.class);
	edit.edit();
	//td[text()='68443012']/following-sibling::td/a[contains(text(),'Edit')]*/


	 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[contains(text(),'Edit')]"))
	.click();
	
	 
	 WebElement dist=driver.findElement(By.name("contractor_address_district_id")); 
	  String  dist1= WebDriverUtils1.dropdownselect(dist,"Kishtwar");
	   System.out.println("selected dist ==>"+dist1);
	   FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, dist1);
	   
	   
	 /*  String  dist1= WebDriverUtils1.dropdownselect(dist,"Samba");
	   System.out.println("selected dist ==>"+dist1);
	   FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, dist1);
	   
	*/
	   
	   
driver.findElement(By.xpath("//input[@value='Continue']")).submit();			 
	
			
	
	Thread.sleep(1000);
	
	 driver.findElement(By.xpath("//input[@value='Continue']")).click();
	 
	 
	 /*------------------------------revert back submitted suceesfully--------------------------*/
	 
	   try{ String actmsg=driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();
	  
	  
	 // Assertr.assertEquals(actmsg, "Payment Transaction Completed Succcessfully ");
	  if(actmsg.contains("Successfully Updated"))
	  {
		  System.out.println("revert back  ==>"+actmsg);
	  }
	  
	  
	  String status  =driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
	   System.out.println("current status of the application is ===>  " +status);
	   
	    String trckingId=driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
	    System.out.println("Tracking Id ==>"+trckingId);
	    
	    
	    
	   }catch (Exception e) {
		// TODO: handle exception
	}
	  
   
	}}
