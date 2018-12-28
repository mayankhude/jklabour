package org.dev.jklabourF;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryRenewal;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test1FRevert extends BaseClass1{
	
	
	@Test
	
	
	public void editRevert() throws Throwable
	{
	
	
	
	PostApplication pa=PageFactory.initElements(driver, PostApplication.class);
	pa.postApp();
	
	
	FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
	 String id=fl.getStringExcelData(5, 3);
	 System.out.println(" TRACKING ID =id");

	 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[contains(text(),'Edit')]"))
	.click();
	
	
	
	
	/*------------------------for factory-------------------------*/
	
	   	  driver.findElement(By.xpath("//input[@value='white']")).click(); 
        
  

	
	
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
	    
	    
	   }catch (Exception e) {}
	   
	   

	   FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();;
	   
	     FactoryRenewal flc=PageFactory.initElements(driver,FactoryRenewal.class);
	     flc.renewalFactory();;
	     
	 	driver.findElement(By.xpath("//button[@type='submit']")).click();	
		  
		   Thread.sleep(10000);
		WebElement oldId=driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);
		
		driver.findElement(By.name("registration_number")).sendKeys("23622519");
		
		driver.findElement(By.id("btn-online-reg")).click();
	  
   
	
	}
}
