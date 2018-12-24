package org.dev.jklabourAdminF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.AllocateInspector;
import org.dev.jklabour.ObjectRepositoryA.EstablishmentsEmployingBuildingWorkersMenu;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EstBuildingWorkerALCAllocateInspectorTest extends BaseClass1{
	
	
@Test
	
	public void trackingId() throws IOException, Throwable
	
	{	String p = "alc";

	FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	System.out.println(" accessing member identity ==> "+p);}
	
	
	
	@Test
	public void allocationTest() throws EncryptedDocumentException, Throwable
	{ 
		EstablishmentsEmployingBuildingWorkersMenu menu=
				PageFactory.initElements(driver, EstablishmentsEmployingBuildingWorkersMenu.class);
		menu.BuildingWorkers();

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
		
	}

}
