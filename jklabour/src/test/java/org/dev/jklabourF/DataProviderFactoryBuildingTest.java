package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryBuildingPlanApproval;
import org.dev.jklabour.objectRepositorys.FactoryRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.dev.jklabour.commonLibS.TestNGListerner.class)
public class DataProviderFactoryBuildingTest extends  BaseClass1{
@Test(dataProvider="getData")	
 public void createFactoryRenewTest(Object name, Object fname, Object add, Object city,
			Object pin, Object design, Object no)
		throws EncryptedDocumentException, Throwable
     { 
	
	   FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();

	   FactoryBuildingPlanApproval app=PageFactory.initElements(driver, FactoryBuildingPlanApproval.class);
		app.buildingPlan();
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
	
		
/*--------------------------form  start-------------------------------*/	     
	    
		
		WebElement ele =driver.findElement(By.name("applicant_name"));
		  WebDriverUtils1.selectDataByjs(driver, ele,name);

		  WebElement ele1 =driver.findElement(By.name("applicant_address_1"));
		  WebDriverUtils1.selectDataByjs(driver, ele1, add);

		  WebElement ele2 =driver.findElement(By.name("applicant_address_2"));
		  WebDriverUtils1.selectDataByjs(driver, ele2, add);

		  WebElement ele3 =driver.findElement(By.name("applicant_address_city"));
		  WebDriverUtils1.selectDataByjs(driver, ele3, city);

		WebElement dist = driver.findElement(By.name("applicant_address_district_id"));
		WebDriverUtils1.dropdown(dist, 3);

		WebElement ele4 =driver.findElement(By.name("applicant_address_pincode"));
		  WebDriverUtils1.selectDataByjs(driver, ele4, pin);

		/*--------------------------- 3. ----------------------*/

		  WebElement ele5 =driver.findElement(By.name("factory_name"));
		  WebDriverUtils1.selectDataByjs(driver, ele5, name);

		  WebElement ele6 =driver.findElement(By.name("factory_address_1"));
		  WebDriverUtils1.selectDataByjs(driver, ele6, add);

		  WebElement ele7 =driver.findElement(By.name("factory_address_2"));
		  WebDriverUtils1.selectDataByjs(driver, ele7, add);

		  WebElement ele8 =driver.findElement(By.name("factory_address_city"));
		  WebDriverUtils1.selectDataByjs(driver, ele8, city);

		WebElement estdist = driver.findElement(By.name("factory_address_district_id"));
		WebDriverUtils1.dropdownselect(estdist, "Jammu");

		WebElement circle = driver.findElement(By.name("factory_address_circle_id"));
		WebDriverUtils1.dropdown(circle, 4);

		WebElement ele9 =driver.findElement(By.name("factory_address_pincode"));
		  WebDriverUtils1.selectDataByjs(driver, ele9,pin);

		/*---------------- 4. Situation of the factory -----------*/
		  WebElement ele10=driver.findElement(By.name("factory_situation_province"));
		  WebDriverUtils1.selectDataByjs(driver, ele10, add);

		WebElement dist2 = driver.findElement(By.name("factory_situation_district_id"));
		WebDriverUtils1.dropdown(dist2, 3);

		 WebElement ele11=driver.findElement(By.name("factory_situation_town"));
		  WebDriverUtils1.selectDataByjs(driver, ele11, add);

		  WebElement ele12=	driver.findElement(By.name("factory_situation_railway_station"));
		  WebDriverUtils1.selectDataByjs(driver, ele12, add);

		  WebElement ele13=driver.findElement(By.name("factory_situation_nearer_ghat"));
		  WebDriverUtils1.selectDataByjs(driver, ele13, add);

		/*---------------- 5. Particular of plant to be Installed -------------*/

		driver.findElement(By.name("plant_particulars")).sendKeys("rdfghjk!@#$%^&*(234567");

		/*----------------------------- 6 -------------------------------------*/

		WebElement element1 = driver.findElement(By.name("estimated_date_of_commision"));

		String dateVal1 = "2018-12-27";
		WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);

		/*--------------------------- 7 -------------------------------------*/

		WebElement chart = driver.findElement(By.name("flow_chart_doc_id"));
		WebDriverUtils1.dropdown(chart, 2);

		/*---------------------------- 8 ------------------------------------*/

		WebElement writ = driver.findElement(By.name("writeup_chart_doc_id"));
		WebDriverUtils1.dropdown(writ, 3);

		/*---------------------------- 9 -----------------------------------*/

		WebElement mach = driver.findElement(By.name("machinery_list_doc_id"));
		WebDriverUtils1.dropdown(mach, 1);
		/*--------------------------- 10 -------------------------------------*/

		WebElement scan = driver.findElement(By.name("scan_copy_surrounding_doc_id"));
		WebDriverUtils1.dropdown(scan, 4);
		/*---------------------------- 11 -----------------------------------*/

		WebElement edi = driver.findElement(By.name("scan_copy_elevation_doc_id"));
		WebDriverUtils1.dropdown(edi, 5);
		/*--------------------------- 12 ---------------------------------*/

		WebElement dpr = driver.findElement(By.name("dpr_doc_id"));
		WebDriverUtils1.dropdown(dpr, 2);
		/*---------------------------- 13 ----------------------------------*/

		WebElement com = driver.findElement(By.name("company_doc_id"));
		WebDriverUtils1.dropdown(com, 3);
		/*---------------------------- 14 -----------------------------------*/

		WebElement land = driver.findElement(By.name("land_paper_doc_id"));
		WebDriverUtils1.dropdown(land, 3);
		/*---------------------------- 15 -----------------------------------*/

		WebElement indu = driver.findElement(By.name("industry_doc_id"));
		WebDriverUtils1.dropdown(indu, 3);
		/*---------------------------- 16 -----------------------------------*/

		WebElement id = driver.findElement(By.name("id_proof_doc_id"));
		WebDriverUtils1.dropdown(id, 3);
		/*---------------------------  17 ----------------------------------*/

		WebElement other = driver.findElement(By.name("other_doc_id"));
		WebDriverUtils1.dropdown(other, 3);
	   
		
		Thread.sleep(10000);
	 
	}
	
	@DataProvider
	 public  Object[][] getData()
	 {
		Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet1");
		
		return data;
	 }
	

}
