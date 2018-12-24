

/*
 * @author hudelabs
 * 
 */

package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.BuildingWorkers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FLengthBuildingWorkerTest extends BaseClass1 {
	static int i = 3;

	@Test

	public void BWorkerTest() throws EncryptedDocumentException, Throwable {

		String name = "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ " publishing software like Aldus PageMa";

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
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."
				+ "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum."

		;

		BuildingWorkers worker = PageFactory.initElements(driver, BuildingWorkers.class);
		worker.buildingWorkers();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*------------------------------------------------------------*/

		driver.findElement(By.name("establishment_name")).sendKeys(name);

		driver.findElement(By.name("establishment_location")).sendKeys(name);

		driver.findElement(By.name("establishment_postal_address_1")).sendKeys(name);

		driver.findElement(By.name("establishment_postal_address_2")).sendKeys(name);

		driver.findElement(By.name("establishment_postal_address_city")).sendKeys(name);

		WebElement dist = driver.findElement(By.name("establishment_postal_address_district_id"));
		WebDriverUtils1.dropdownselect(dist, "Jammu");

		driver.findElement(By.name("establishment_postal_address_pincode")).sendKeys(name);

		/*--------------------------- 3. ----------------------------*/

		driver.findElement(By.name("establishment_permanent_address_1")).sendKeys(name);

		driver.findElement(By.name("establishment_permanent_address_2")).sendKeys(name);

		driver.findElement(By.name("establishment_permanent_address_city")).sendKeys(name);

		WebElement pdist = driver.findElement(By.name("establishment_permanent_address_district_id"));
		WebDriverUtils1.dropdown(pdist, 3);

		driver.findElement(By.name("establishment_permanent_address_pincode")).sendKeys(name);

		/*--------------------------- 4. ----------------------------*/

		driver.findElement(By.name("establishment_manager_name")).sendKeys(name);

		driver.findElement(By.name("establishment_manager_address_1")).sendKeys(name);

		driver.findElement(By.name("establishment_manager_address_2")).sendKeys(name);

		driver.findElement(By.name("establishment_manager_address_city")).sendKeys(name);

		WebElement mdist = driver.findElement(By.name("establishment_manager_address_district_id"));
		WebDriverUtils1.dropdown(mdist, 3);

		driver.findElement(By.name("establishment_manager_address_pincode")).sendKeys(name);

		/*------------------------------ 5. ------------------------------*/

		driver.findElement(By.name("nature_of_work")).sendKeys(detail);

		/*------------------------------ 6. --------------------------------*/

		driver.findElement(By.name("max_no_of_workers")).sendKeys(name);

		WebElement element = driver.findElement(By.name("estimated_date_of_commencement"));
		String dateVal = "2018-04-29";
		WebDriverUtils1.selectDateByjs(driver, element, dateVal);

		WebElement element1 = driver.findElement(By.name("estimated_date_of_completion"));
		String dateVal1 = "2018-04-29";
		WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);

		/*-------------------------select option -------------------*/

		WebElement eid = driver.findElement(By.name("allotment_doc_id"));
		WebDriverUtils1.dropdownselect(eid, "Aadhaar Card");

		WebElement cpid = driver.findElement(By.name("list_doc_id"));
		WebDriverUtils1.dropdownselect(cpid, "Test_Certificate");

		WebElement cdid = driver.findElement(By.name("photo_doc_id"));
		WebDriverUtils1.dropdownselect(cdid, "Test_pan");

		WebElement cpdid = driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdownselect(cpdid, "PHOTOGRAPH");

		WebElement sid = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdownselect(sid, "11");
		Thread.sleep(1000);

	}

}
