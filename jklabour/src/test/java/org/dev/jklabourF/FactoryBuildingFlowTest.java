package org.dev.jklabourF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.ALCApprove;
import org.dev.jklabour.ObjectRepositoryA.ALCOnHold;
import org.dev.jklabour.ObjectRepositoryA.ConstructionExtendBuildingFactoryMenu;
import org.dev.jklabour.ObjectRepositoryA.FactoryRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.ObjectRepositoryA.ScrutinyCompleted;
import org.dev.jklabour.ObjectRepositoryA.UploadCertificate;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryBuildingPlanApproval;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FactoryBuildingFlowTest extends BaseClass1 {
	static int i = 3;

	@Test(priority=0)
	public void test1Createfactory() throws IOException, Throwable
	{ FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();

	   FactoryBuildingPlanApproval app=PageFactory.initElements(driver, FactoryBuildingPlanApproval.class);
		app.buildingPlan();
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	/*-----------------------form start ---------------------*/	
		FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "factory");
		
		 String  fName= fl.getStringExcelData(i , 0);
		driver.findElement(By.name("applicant_name"))
		.sendKeys(fName);

		 String fadd= fl.getStringExcelData( i,1 );
		driver.findElement(By.name("applicant_address_1"))
		.sendKeys(fadd);
		
		 String add2= fl.getStringExcelData(i , 2);
		driver.findElement(By.name("applicant_address_2"))
		.sendKeys(add2);
		
		 String city= fl.getStringExcelData( i,3 );
		driver.findElement(By.name("applicant_address_city"))
		.sendKeys(city);
		
	
		WebElement dist =driver.findElement(By.name("applicant_address_district_id"));
		WebDriverUtils1.dropdown(dist, 3);
		
		 String pin= fl.convertDoubleToString(fl.getIntExcelData( i,4) );
		driver.findElement(By.name("applicant_address_pincode"))
		.sendKeys(pin);

	 /*--------------------------- 3. ----------------------*/	
		
		 String name = fl.getStringExcelData(i , 5);
		driver.findElement(By.name("factory_name"))
		.sendKeys(name);
		
		 String  fadd1= fl.getStringExcelData(i ,1 );
		driver.findElement(By.name("factory_address_1"))
		.sendKeys(fadd1);
		
		 String fadd2= fl.getStringExcelData( i,2 );
		driver.findElement(By.name("factory_address_2"))
		.sendKeys(fadd2);
		
		 String fcity= fl.getStringExcelData( i, 3);
		driver.findElement(By.name("factory_address_city"))
		.sendKeys(fcity);
		

	WebElement estdist= driver.findElement(By.name("factory_address_district_id"));
	WebDriverUtils1.dropdownselect(estdist,"Jammu");
	
	   WebElement circle=driver.findElement(By.name("factory_address_circle_id"));
	    WebDriverUtils1.dropdown(circle, 1);
	    FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, "Jammu Circle 1");
	    Thread.sleep(10000);
	    String fpin = fl.convertDoubleToString(fl.getIntExcelData( i,4) );
	 driver.findElement(By.name("factory_address_pincode"))
	 .sendKeys(fpin);
	 
	 Thread.sleep(20000);

	/*---------------- 4. Situation of the factory -----------*/ 
	      String pro= fl.getStringExcelData(i , 6);
	      driver.findElement(By.name("factory_situation_province"))
	      .sendKeys(pro);
		
	      WebElement dist2=driver.findElement(By.name("factory_situation_district_id"));
		  WebDriverUtils1.dropdown(dist2, 3);
	      
		  String town = fl.getStringExcelData( i, 7);
		  driver.findElement(By.name("factory_situation_town"))
	      .sendKeys(town);
		
		  String  railway= fl.getStringExcelData(i ,8 );
	      driver.findElement(By.name("factory_situation_railway_station"))
	      .sendKeys(railway);
		
	      String  ghat= fl.getStringExcelData(i ,9 );
	      driver.findElement(By.name("factory_situation_nearer_ghat"))
	      .sendKeys(ghat);
		
	 /*---------------- 5. Particular of plant to be Installed -------------*/
	     
	          String plant= fl.getStringExcelData(i , 10);
	          driver.findElement(By.name("plant_particulars"))
	          .sendKeys(plant);

	/*----------------------------- 6 -------------------------------------*/
	          
	         WebElement element1= driver.findElement(By.name("estimated_date_of_commision"));
		     
	          String dateVal1="2018-12-27";
	       	  WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);
	       	  

	  	 	Thread.sleep(20000);
	/*--------------------------- 7 -------------------------------------*/
	          
	        WebElement chart= driver.findElement(By.name("flow_chart_doc_id"));
	      	WebDriverUtils1.dropdown(  chart, 2);
	          
	/*---------------------------- 8 ------------------------------------*/
	        
	      	WebElement writ= driver.findElement(By.name("writeup_chart_doc_id"));
	      	WebDriverUtils1.dropdown(  writ, 3);
	          
	/*---------------------------- 9 -----------------------------------*/
	          
	      	WebElement mach=driver.findElement(By.name("machinery_list_doc_id"));
	      	WebDriverUtils1.dropdown( mach, 1);
	/*--------------------------- 10 -------------------------------------*/
	          
	      	WebElement scan= driver.findElement(By.name("scan_copy_surrounding_doc_id"));
	      	WebDriverUtils1.dropdown(scan, 4);
	/*---------------------------- 11 -----------------------------------*/
	          
	      	WebElement ele= driver.findElement(By.name("scan_copy_elevation_doc_id"));
	      	WebDriverUtils1.dropdown(  ele, 5);
	 /*--------------------------- 12 ---------------------------------*/
		
	      	WebElement dpr= driver.findElement(By.name("dpr_doc_id"));
		   	WebDriverUtils1.dropdown( dpr, 2);
	/*---------------------------- 13 ----------------------------------*/
		
		   	WebElement com= driver.findElement(By.name("company_doc_id"));
		 	WebDriverUtils1.dropdown(com, 3);
	/*---------------------------- 14 -----------------------------------*/
		       
		 	WebElement land= driver.findElement(By.name("land_paper_doc_id"));
		 	WebDriverUtils1.dropdown(  land, 3);
	/*---------------------------- 15 -----------------------------------*/
		
		     WebElement indu= driver.findElement(By.name("industry_doc_id"));
		 	WebDriverUtils1.dropdown(  indu, 3);
	/*---------------------------- 16 -----------------------------------*/
		
		 	WebElement id=driver.findElement(By.name("id_proof_doc_id"));
		 	WebDriverUtils1.dropdown( id, 3);
	/*---------------------------  17 ----------------------------------*/
		
		   WebElement other= driver.findElement(By.name("other_doc_id"));
		 	WebDriverUtils1.dropdown(  other, 3); 
	 /*------------------------- submit form------------------------*/

		 	Thread.sleep(20000);
		 	
		driver.findElement(By.id("submit-btn")).submit();
	          
	    
	    /*                                                             *
	     *                                                             *
	     * -------------------review detail--------------------------- */
	                
	   // driver.findElement(By.linkText("Back")).click();
	    
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	   
	    
	    
	    /*                                                             *
	     *                                                             *
	     * -------------------Fee Payment --------------------------- */
	/*     driver.switchTo().frame("paymentFrame");
	   driver.findElement(By.id("loginUser")).sendKeys("ankit3990@yahoo.com");
	   driver.findElement(By.id("loginPassword")).sendKeys("ankit123");
	   // driver.findElement(By.id("serLogin")).click();     
	  
	    
	    */
	    
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
	       Thread.sleep(6000);
	    
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
	    
		
		String p1 = "saf";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p1);

	}

	/* ------------------------------------------------------------------ */

	@Test (priority=1)
	public void test2SAFRevertBack() throws EncryptedDocumentException, Throwable {
		FactoryRegistrationsMenu menu=PageFactory.initElements(driver, FactoryRegistrationsMenu.class);
		menu.factoryRegistrations();
		
	/*	ALCCustPage view= PageFactory.initElements(driver, ALCCustPage.class);
		view.gettrackingId();
		view.doAction();*/
		
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
		.sendKeys("Edit Field");

		driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();


		
		String msg = driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
		System.out.println(msg);

		/*----------------------set
		                        person  --------------------*/

		String p = "user";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	/* ------------------------------------------------------------------ */

	@Test(priority=2)
	public void test3UserEditAndSubmit() throws EncryptedDocumentException, Throwable {

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
		System.out.println(" TRACKING ID = "+id);

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[contains(text(),'Edit')]"))
				.click();

		
	    WebElement circle=driver.findElement(By.xpath("//select[@name='factory_address_circle_id']"));
	       WebDriverUtils1.dropdownSelectByValue(circle,"2" );
		     
		  
			   FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, "Jammu Circle 2");
		    
			   

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
		
		
		String p = "saf";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);


	}
	
	
	
	
	@Test(priority=1)
	public void test2ScutinyComplete() throws EncryptedDocumentException, Throwable
	{
		ConstructionExtendBuildingFactoryMenu menu=PageFactory.initElements(driver, ConstructionExtendBuildingFactoryMenu.class);
		menu.buildingFactory();
		
	/*	ALCCustPage view= PageFactory.initElements(driver, ALCCustPage.class);
		view.gettrackingId();
		view.doAction();*/
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

		
		ScrutinyCompleted sc= PageFactory.initElements(driver, ScrutinyCompleted.class);
		sc.scrutinyCompleted();
		
		
		/*----------------------------------------------*/
		
		driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div/textarea"))
		.sendKeys(" scrutiny completed ");
		
		
		driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).click();
		
		String p = "iof";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}
	
	
	@Test(priority=2)
	public void test3IOFScutinyComplete() throws EncryptedDocumentException, Throwable
	{

		ConstructionExtendBuildingFactoryMenu menu=PageFactory.initElements(driver, ConstructionExtendBuildingFactoryMenu.class);
		menu.buildingFactory();
		
	/*	ALCCustPage view= PageFactory.initElements(driver, ALCCustPage.class);
		view.gettrackingId();
		view.doAction();	*/
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

		
	
			ScrutinyCompleted sc= PageFactory.initElements(driver, ScrutinyCompleted.class);
			sc.scrutinyCompleted();
			
			
			/*----------------------------------------------*/
			
			driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div/textarea"))
			.sendKeys(" scrutiny completed ");
			
			
			driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).click();
			
			String p = "SC";

			FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

		
	}
	
	
	
	@Test(priority=3)
	public void test4SCHold() throws EncryptedDocumentException, Throwable
	{

		ConstructionExtendBuildingFactoryMenu menu=PageFactory.initElements(driver, ConstructionExtendBuildingFactoryMenu.class);
		menu.buildingFactory();
		

		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

    		

	ALCOnHold hold=PageFactory.initElements(driver, ALCOnHold.class);
	hold.holdOn();
	
	
	
	/*------------------------------------------------------------------*
	 * 
	 */driver.findElement(By.xpath("//input[@value='hold']/following-sibling::textarea"))
.sendKeys("hold");
	 
	/* driver.findElement(By.xpath("//div[contains(text(),'Hold Request')]/following-sibling::form/div[2]/div")).click();
	 
	 Thread.sleep(2000);*/


	 driver.findElement(By.xpath("//div[contains(text(),'Hold Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();


String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
System.out.println(msg);

String p = "SC";

FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	
	
		
	}
	
	@Test(priority=4)
	public void test5SCApprove() throws EncryptedDocumentException, Throwable
	{


		ConstructionExtendBuildingFactoryMenu menu=PageFactory.initElements(driver, ConstructionExtendBuildingFactoryMenu.class);
		menu.buildingFactory();
		

		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

               		

			ALCApprove ok=PageFactory.initElements(driver, ALCApprove.class);
			ok.approve();
			
			
			driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div[1]/textarea"))
			.sendKeys("ok");
			

		/*	driver.findElement(By.xpath("//div[contains(text(),'Approve Request')]/following-sibling::form/div[2]/div")).click();
			 
			 Thread.sleep(2000);
			
			*/
			driver.findElement(By.xpath("//div[contains(text(),'Approve Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
			

	    try{String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
			System.out.println(msg);}
	    catch (Exception e) {
				// TODO: handle exception
			}
			
	    String p = "SC";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);
 
		 
	}
	
	@Test(priority=5)
	public void test6SCUploadCertificate() throws EncryptedDocumentException, Throwable
	{
		


		ConstructionExtendBuildingFactoryMenu menu=PageFactory.initElements(driver, ConstructionExtendBuildingFactoryMenu.class);
		menu.buildingFactory();
		

		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/

    		
 		
		 UploadCertificate uc=PageFactory.initElements(driver, UploadCertificate.class);
		    uc.uploadCetificate();
		    
		    driver.findElement(By.name("approval_certificate_file")).click();
		   
		    Thread.sleep(4000);
		    Runtime.getRuntime().exec("C:\\Users\\POOJA\\Desktop\\Upload.exe");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();
		    
		    Thread.sleep(5000);

			
			String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
			System.out.println(msg);
			
			
			Thread.sleep(8000);	
	}
	
	@Test(priority=6)
	public void test7SCDownloadCertificate() throws EncryptedDocumentException, Throwable
	{
		

		

		ConstructionExtendBuildingFactoryMenu menu=PageFactory.initElements(driver, ConstructionExtendBuildingFactoryMenu.class);
		menu.buildingFactory();
		

		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/


		driver.findElement(By.linkText("View File")).click();
			Thread.sleep(3000);
	}
	
	
	
	
	
	

}
