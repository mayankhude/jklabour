

/*
 * @author hudelabs
 * 
 */

package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryBuildingPlanApproval;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FLengthFactoryBuildingTest extends BaseClass1 {

	static int i = 2;

	@Test

	public void facoryLengthTest() throws EncryptedDocumentException, Throwable

	{
		FactoryAct1 fa = PageFactory.initElements(driver, FactoryAct1.class);
		fa.factoryAct();

		FactoryBuildingPlanApproval app = PageFactory.initElements(driver, FactoryBuildingPlanApproval.class);
		app.buildingPlan();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*--------------------------Form start -----------------------------------*/

		String name = "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including "
				+ "versions publishing software like Aldus PageMa";

		String detail = "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum.";

		/*-----------------------form start ---------------------*/

		driver.findElement(By.name("applicant_name")).sendKeys(name);

		driver.findElement(By.name("applicant_address_1")).sendKeys(name);

		driver.findElement(By.name("applicant_address_2")).sendKeys(name);

		driver.findElement(By.name("applicant_address_city")).sendKeys(name);

		WebElement dist = driver.findElement(By.name("applicant_address_district_id"));
		WebDriverUtils1.dropdown(dist, 3);

		driver.findElement(By.name("applicant_address_pincode")).sendKeys(name);

		/*--------------------------- 3. ----------------------*/

		driver.findElement(By.name("factory_name")).sendKeys(name);

		driver.findElement(By.name("factory_address_1")).sendKeys(name);

		driver.findElement(By.name("factory_address_2")).sendKeys(name);

		driver.findElement(By.name("factory_address_city")).sendKeys(name);

		WebElement estdist = driver.findElement(By.name("factory_address_district_id"));
		WebDriverUtils1.dropdownselect(estdist, "Jammu");

		WebElement circle = driver.findElement(By.name("factory_address_circle_id"));
		WebDriverUtils1.dropdown(circle, 4);

		driver.findElement(By.name("factory_address_pincode")).sendKeys(name);

		/*---------------- 4. Situation of the factory -----------*/
		driver.findElement(By.name("factory_situation_province")).sendKeys(name);

		WebElement dist2 = driver.findElement(By.name("factory_situation_district_id"));
		WebDriverUtils1.dropdown(dist2, 3);

		driver.findElement(By.name("factory_situation_town")).sendKeys(name);

		driver.findElement(By.name("factory_situation_railway_station")).sendKeys(name);

		driver.findElement(By.name("factory_situation_nearer_ghat")).sendKeys(name);

		/*---------------- 5. Particular of plant to be Installed -------------*/

		driver.findElement(By.name("plant_particulars")).sendKeys(detail);

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

		WebElement ele = driver.findElement(By.name("scan_copy_elevation_doc_id"));
		WebDriverUtils1.dropdown(ele, 5);
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

	}
}
