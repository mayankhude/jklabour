
/*
 * @author hudelabs
 * 
 */


package org.dev.jklabourF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.AllocateInspector;
import org.dev.jklabour.ObjectRepositoryA.LICompoundFeeRequest;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.ObjectRepositoryA.MigrantContractorsRegistrationsMenu;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.InterStateCRenewal;
import org.dev.jklabour.objectRepositorys.InterStateMigrantAct1;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ChangeDistMigrantRenewTest extends BaseClass1 {

	static int i = 3;

	@Test

	public void Test1CreateMigrantRegistration() throws EncryptedDocumentException, Throwable {
		InterStateMigrantAct1 act = PageFactory.initElements(driver, InterStateMigrantAct1.class);
		act.StateMigrant();

		InterStateCRenewal reg = PageFactory.initElements(driver, InterStateCRenewal.class);
		reg.interStateCRenewal();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement oldId = driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);

		driver.findElement(By.name("registration_number")).sendKeys("25092206");

		driver.findElement(By.id("btn-online-reg")).click();

		/*------------ fill contractor renewal  form------------------------*/

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "contractor");

		/*------------------------ 1. -------------------------------*/

		String name = fl.getStringExcelData(i, 0);
		driver.findElement(By.name("contractor_name")).sendKeys(name);

		/*------------------------ 2.------------------------------*/

		String fname = fl.getStringExcelData(i, 1);
		driver.findElement(By.name("contractor_fath_hus_name")).sendKeys(fname);

		/*------------------------ 3. --------------------------*/

		String add = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("contractor_address_1")).sendKeys(add);

		String add2 = fl.getStringExcelData(i, 3);
		driver.findElement(By.name("contractor_address_2")).sendKeys(add2);

		String city = fl.getStringExcelData(i, 4);
		driver.findElement(By.name("contractor_address_city")).sendKeys(city);

		WebElement dist = driver.findElement(By.name("contractor_address_district_id"));
		WebDriverUtils1.dropdownselect(dist, "Jammu");

		String pin = fl.convertDoubleToString(fl.getIntExcelData(i, 6));
		driver.findElement(By.name("contractor_address_pincode")).sendKeys(pin);

		/*---------------------------4. --------------------------------*/

		WebElement ele = driver.findElement(By.name("contractor_dob"));
		String dob = "1990-1-1";
		WebDriverUtils1.selectDateByjs(driver, ele, dob);

		/*---------------------------5.---------------------------------*/
		String ename = fl.getStringExcelData(i, 8);
		driver.findElement(By.name("est_name")).sendKeys(ename);

		String eadd = fl.getStringExcelData(i, 9);
		driver.findElement(By.name("est_address_1")).sendKeys(eadd);

		String eadd2 = fl.getStringExcelData(i, 10);
		driver.findElement(By.name("est_address_2")).sendKeys(eadd2);

		String ecity = fl.getStringExcelData(i, 11);
		driver.findElement(By.name("est_address_city")).sendKeys(ecity);

		WebElement estdist = driver.findElement(By.name("est_address_district_id"));
		String dist1 = WebDriverUtils1.dropdownselect(estdist, "Jammu");
		System.out.println("selected dist ==>" + dist1);
		FileSet.setExcelData("./excel/data.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

		String estpin = fl.convertDoubleToString(fl.getIntExcelData(i, 13));
		driver.findElement(By.name("est_address_pincode")).sendKeys(estpin);

		/*--------------------------- 6. ------------------------------*/

		String buss = fl.getStringExcelData(i, 14);
		driver.findElement(By.name("business_type")).sendKeys(buss);

		/*-------------------------- 7. ------------------------------*/

		String pname = fl.getStringExcelData(i, 15);
		driver.findElement(By.name("prin_name")).sendKeys(pname);

		String pdesig = fl.getStringExcelData(i, 16);
		driver.findElement(By.name("prin_desig")).sendKeys(pdesig);

		String padd = fl.getStringExcelData(i, 17);
		driver.findElement(By.name("prin_address_1")).sendKeys(padd);

		String padd2 = fl.getStringExcelData(i, 18);
		driver.findElement(By.name("prin_address_2")).sendKeys(padd2);

		String pcity = fl.getStringExcelData(i, 19);
		driver.findElement(By.name("prin_address_city")).sendKeys(pcity);

		WebElement pdist = driver.findElement(By.name("prin_address_district_id"));
		WebDriverUtils1.dropdownselect(pdist, "Jammu");

		String prdist = fl.convertDoubleToString(fl.getIntExcelData(i, 21));
		driver.findElement(By.name("prin_address_pincode")).sendKeys(prdist);

		/*---------------------------- 8. ------------------------------*/

		String work = fl.getStringExcelData(i, 22);
		driver.findElement(By.name("nature_of_work")).sendKeys(work);

		WebElement element = driver.findElement(By.name("commencement_date"));
		String dateVal = "2018-10-06";
		WebDriverUtils1.selectDateByjs(driver, element, dateVal);

		WebElement element1 = driver.findElement(By.name("termination_date"));
		String dateVal1 = "2018-12-27";
		WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);

		String noOfLabour = fl.convertDoubleToString(fl.getIntExcelData(i, 25));
		driver.findElement(By.name("max_no_of_labour")).sendKeys(noOfLabour);

		/*---------------------------- 9. -----------------------------*/

		String mname = fl.getStringExcelData(i, 26);
		driver.findElement(By.name("manager_name")).sendKeys(mname);

		String mdesig = fl.getStringExcelData(i, 27);
		driver.findElement(By.name("manager_desig")).sendKeys(mdesig);

		String madd = fl.getStringExcelData(i, 28);
		driver.findElement(By.name("manager_address_1")).sendKeys(madd);

		String madd2 = fl.getStringExcelData(i, 29);
		driver.findElement(By.name("manager_address_2")).sendKeys(madd2);

		String mcity = fl.getStringExcelData(i, 30);
		driver.findElement(By.name("manager_address_city")).sendKeys(mcity);

		WebElement mdist = driver.findElement(By.name("manager_address_district_id"));
		WebDriverUtils1.dropdownselect(mdist, "Jammu");

		String mgrpin = fl.convertDoubleToString(fl.getIntExcelData(i, 32));
		driver.findElement(By.name("manager_address_pincode")).sendKeys(mgrpin);

		/*----------------------------- 10. --------------------------------*/

		String detail = fl.getStringExcelData(i, 31);
		driver.findElement(By.name("contractor_offence_detail")).sendKeys(detail);

		/*----------------------------- 11. --------------------------------*/

		WebElement eid = driver.findElement(By.name("list_doc_id"));
		WebDriverUtils1.dropdownselect(eid, "Aadhaar Card");

		WebElement cpid = driver.findElement(By.name("photo_doc_id"));
		WebDriverUtils1.dropdownselect(cpid, "Test_Certificate");

		WebElement cdid = driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdownselect(cdid, "Test_pan");

		WebElement cpdid = driver.findElement(By.name("prin_employer_doc_id"));
		WebDriverUtils1.dropdownselect(cpdid, "PHOTOGRAPH");

		WebElement sid = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdownselect(sid, "11");
		Thread.sleep(1000);

		/*---------------------------- submit form-------------------------------*/

		driver.findElement(By.id("submit-btn")).submit();
		

		/*---------------------------- next page --------------------------------*/

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		/*
		 * * * ----------------------Fee Payment ---------------------------
		 */

		driver.switchTo().frame("paymentFrame");

		MakePayment mp = PageFactory.initElements(driver, MakePayment.class);
		mp.payment();
		mp.merchanSite();

		/*------------------------alert pop-up---------------------------*/

		try {
			Alert alt = driver.switchTo().alert();
			alt.accept();
			Thread.sleep(6000);
		} catch (Exception e) {
		}

		/*-------------------sceesfully complete payment verify --------------*/

		String actmsg = driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();
		System.out.println("actual message ==>" + actmsg);

		/*-----------------------------------------------------------------*/

		if (actmsg.contains("Payment Transaction Completed Succcessfully")) {
			System.out.print("transaction completed or  ");
		}

		/*-----------------------print tracking id----------------------------*/

		String trckingId = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
		System.out.println("Tracking Id ==>" + trckingId);

		FileSet.setExcelData("./excel/jklabourData.xlsx", "trackinid", 5, 3, trckingId);

		
		
		String p = "alc";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	
	}
	
	@Test
	
	public void Test2ALCRevertBack() throws IOException, Throwable
	{
		

		MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
		al.MigrantContractors();;
		
	/*	ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
		ap.gettrackingId();
		ap.doAction();*/
		
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
		 /*---------------------do action ------------------*/

			
			LIRevertBackApplicant rb=PageFactory.initElements(driver, LIRevertBackApplicant.class);
			rb.revertBack();
			
			driver.findElement(By.xpath("//input[@value='reverted_back']"
					+ "/following-sibling::textarea[@name='status_update_message']"))
			.sendKeys("edit field");
			
			/*driver.findElement(By.xpath("//div[contains(text(),'Revert Back Request')]/following-sibling::form/div[2]/div")).click();
			 
			 Thread.sleep(2000);*/
			
			
			driver.findElement(By.xpath("//div[contains(text(),'Revert Back Request')]/following-sibling::form/div[2]/input[@value='Send']")).submit();
			
			
			String msg=driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
			System.out.println(msg);
		
			
			String p = "user";

			FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	
	}
	
	@Test
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
		System.out.println(" TRACKING ID =id");

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[contains(text(),'Edit')]"))
				.click();
		
		WebElement estdist = driver.findElement(By.name("est_address_district_id"));
		String dist1 = WebDriverUtils1.dropdownselect(estdist, "Kishtwar");
		System.out.println("selected dist ==>" + dist1);
		FileSet.setExcelData("./excel/data.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

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

	
		
		String p = "alc";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);
	
	}

	
	
	@Test
	
	public void Test4ALCAllocateInspector() throws IOException, Throwable
	{
	
		
		MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
		al.MigrantContractors();;
		
	/*	ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
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
		
		String p = "li";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);
	
		
	}
	
	
	
	@Test
	
	public void test5LIRequestCompoundFee() throws EncryptedDocumentException, Throwable
	{
		
		
		MigrantContractorsRegistrationsMenu al=PageFactory.initElements(driver, MigrantContractorsRegistrationsMenu.class);
		al.MigrantContractors();
		
		
	/* ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
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

}
