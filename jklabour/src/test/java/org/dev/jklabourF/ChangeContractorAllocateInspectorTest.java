package org.dev.jklabourF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.ALCContractorsRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.AllocateInspector;
import org.dev.jklabour.ObjectRepositoryA.LICompoundFeeRequest;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractorsRenewal;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ChangeContractorAllocateInspectorTest extends BaseClass1 {
	static int i = 2;
	@Test
	public void test1CreateContractor() throws IOException, Throwable {
       String p = "alc";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);
       
		
		String dist1="kistwar";
		FileSet.setExcelData("./excel/data.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

	}
	
	@Test
	
	public void test2AllocateInspector() throws EncryptedDocumentException, Throwable
	{
		ALCContractorsRegistrationsMenu menu=PageFactory.initElements(driver, ALCContractorsRegistrationsMenu.class);
		menu.ContractorsRegistrations();
		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		String id = fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> " + id);

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[text()='View']")).click();

		AllocateInspector ai=PageFactory.initElements(driver, AllocateInspector.class);
		ai.AllocateInspector();
		

		FileUtiles fs= new FileUtiles("./excel/data.xlsx","dist");
		 String dist1=fs.getStringExcelData(1,1);
		 System.out.println( dist1);
		
		/*-------------------  select LI name------------------------*/
		Thread.sleep(1000);
		
		
		
		if(dist1.contains("Jammu"))
		{String LIname ="Roshan Bandral";
	     System.out.println("\n "+LIname);
	       String expLIname="Roshan Bandral ";
	        if (expLIname.contains(LIname))
	         {
	        	driver.findElement(By.xpath("//input[@value='12']")).click(); 
	        }
	       
	        else
	           {
	        	driver.findElement(By.xpath("//input[@value='14']")).click();
	           }
	    	
		
	    driver.findElement(By.xpath("//div[contains(text(),' Allocate Inspector Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
	
		String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
		System.out.println(msg);

		}
		
		else if(dist1.contains("Kishtwar"))
		
		{  	driver.findElement(By.xpath("//input[@value='17']")).click(); 
		     driver.findElement(By.xpath("//div[contains(text(),' Allocate Inspector Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
		
			String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
			System.out.println(msg);		
		}
		
		String p = "LI";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);		
		
	}
	
	@Test
	
public void Test3LICompound() throws EncryptedDocumentException, Throwable

{

		ALCContractorsRegistrationsMenu al=PageFactory.initElements(driver, ALCContractorsRegistrationsMenu.class);
		al.ContractorsRegistrations();
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
		
		LICompoundFeeRequest fee=PageFactory.initElements(driver, LICompoundFeeRequest.class);
		fee.compoundFee();
		
		
/*---------------------------compound fees request ------------------------------------*/		
		
		driver.findElement(By.xpath("//input[@name='compound_fee_amount']"))
		.sendKeys("1000");
				
		driver.findElement(By.xpath("//input[@name='compound_fee_amount']/../following-sibling::div/textarea")).sendKeys("compound fee");
		
		/*driver.findElement(By.xpath("//div[contains(text(),'Send Compound Fee Request')]/following-sibling::form/div[2]/div")).click();
		 
		 Thread.sleep(2000);*/
		
		driver.findElement(By.xpath("//div[contains(text(),'Send Compound Fee Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
		
		String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
		System.out.println(msg);
			
			
}
	
	
	@Test
	public void Test4AplicantPaidFee() throws EncryptedDocumentException, Throwable
	{
		
		PostApplication pa=PageFactory.initElements(driver, PostApplication.class);
		pa.postApp();
		
		/*-----------------------pay fees---------------------*/
		
		//PostAppsCompoundFee cf=PageFactory.initElements(driver, PostAppsCompoundFee.class);
		//cf.PayFee();
		
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
		
		  
		
		
		
	}
	
	
}
