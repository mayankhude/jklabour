


/*
 * @author hudelabs
 * 
 */
package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractorsRegistration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FLengthContractorTest extends BaseClass1 {
	static int i = 2;

	@Test
	public void contractorFLengthTest() throws EncryptedDocumentException, Throwable {
		ContractLabourAct1 ca = PageFactory.initElements(driver, ContractLabourAct1.class);
		ca.contractLabour();

		ContractorsRegistration cr = PageFactory.initElements(driver, ContractorsRegistration.class);
		cr.registrationOfContractor();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*------------ fill contractor form------------------------*/

		String name = "Lorem passages, and more recently with desktop"
				+ " publishing software like Aldus PageMaker including " + "versions of Lorem Ipsum.";

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
		driver.findElement(By.name("contractor_name")).sendKeys(name);

		driver.findElement(By.name("contractor_fath_hus_name")).sendKeys(name);

		driver.findElement(By.name("contractor_address_1")).sendKeys(name);

		driver.findElement(By.name("contractor_address_2")).sendKeys(name);

		driver.findElement(By.name("contractor_address_city")).sendKeys(name);

		WebElement dist = driver.findElement(By.name("contractor_address_district_id"));
		WebDriverUtils1.dropdownselect(dist, "Jammu");

		driver.findElement(By.name("contractor_address_pincode")).sendKeys(name);

		WebElement element = driver.findElement(By.name("contractor_dob"));
		String dateVal = "1990-04-29";
		WebDriverUtils1.selectDateByjs(driver, element, dateVal);

		driver.findElement(By.name("est_name")).sendKeys(name);

		driver.findElement(By.name("est_address_1")).sendKeys(name);

		driver.findElement(By.name("est_address_2")).sendKeys(name);

		driver.findElement(By.name("est_address_city")).sendKeys(name);

		WebElement estdist = driver.findElement(By.name("est_address_district_id"));
		WebDriverUtils1.dropdownselect(estdist, "Jammu");

		driver.findElement(By.name("est_address_pincode")).sendKeys(name);

		driver.findElement(By.name("business_type")).sendKeys(detail);

		driver.findElement(By.name("prin_name")).sendKeys(name);

		driver.findElement(By.name("prin_desig")).sendKeys(name);

		driver.findElement(By.name("prin_address_1")).sendKeys(name);

		driver.findElement(By.name("prin_address_2")).sendKeys(name);

		driver.findElement(By.name("prin_address_city")).sendKeys(name);

		WebElement pdist = driver.findElement(By.name("prin_address_district_id"));
		WebDriverUtils1.dropdownselect(pdist, "Jammu");

		driver.findElement(By.name("prin_address_pincode")).sendKeys(name);

		/*----------------------- 8. nature of work -------------------*/

		driver.findElement(By.name("nature_of_work")).sendKeys(detail);

		WebElement celement = driver.findElement(By.name("commencement_date"));
		String cdate = "2019-10-11";
		WebDriverUtils1.selectDateByjs(driver, celement, cdate);

		WebElement element1 = driver.findElement(By.name("termination_date"));
		String date = "2018-11-11";
		WebDriverUtils1.selectDateByjs(driver, element1, date);

		driver.findElement(By.name("max_no_of_labour")).sendKeys(name);

		/*------------------------  9.  ------------------------------*/

		driver.findElement(By.name("manager_name")).sendKeys(name);

		driver.findElement(By.name("manager_desig")).sendKeys(name);

		driver.findElement(By.name("manager_address_1")).sendKeys(name);

		driver.findElement(By.name("manager_address_2")).sendKeys(name);

		driver.findElement(By.name("manager_address_city")).sendKeys(name);

		WebElement mdist = driver.findElement(By.name("manager_address_district_id"));
		WebDriverUtils1.dropdownselect(mdist, "Jammu");

		driver.findElement(By.name("manager_address_pincode")).sendKeys(name);

		driver.findElement(By.name("contractor_offence_detail")).sendKeys(detail);

		driver.findElement(By.name("contractor_license_issue")).sendKeys(detail);

		driver.findElement(By.name("contractor_prev_est")).sendKeys(detail);
		// ------------------------------------------------------
		WebElement pid = driver.findElement(By.name("prin_employer_doc_id"));
		WebDriverUtils1.dropdown(pid, 3);

		// -------------------------------
		WebElement eid = driver.findElement(By.name("employee_list_doc_id"));
		WebDriverUtils1.dropdown(eid, 4);

		WebElement cpid = driver.findElement(By.name("contractor_photo_doc_id"));
		WebDriverUtils1.dropdown(cpid, 2);

		WebElement cdid = driver.findElement(By.name("contractor_doc_id"));
		WebDriverUtils1.dropdown(cdid, 4);

		WebElement cpdid = driver.findElement(By.name("contractor_pledged_doc_id"));
		WebDriverUtils1.dropdown(cpdid, 2);

		WebElement adid = driver.findElement(By.name("allotment_doc_id"));
		WebDriverUtils1.dropdownselect(adid, "PHOTOGRAPH");

		Thread.sleep(20000);
		WebElement sid = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdown(sid, 6);

	}

}
