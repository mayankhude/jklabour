package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractorsRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderContRenewTest extends BaseClass1 {

	static int i = 2;

	@Test(dataProvider = "getData")
	public void ContractorRenewaltest(Object name, Object fname, Object add, Object city, Object pin, Object design,
			Object no) throws EncryptedDocumentException, Throwable {

		ContractLabourAct1 cla = PageFactory.initElements(driver, ContractLabourAct1.class);
		cla.contractLabour();
		System.out.println("====Contract Labour Act is working====");

		ContractorsRenewal cr = PageFactory.initElements(driver, ContractorsRenewal.class);
		cr.contractorsRenewal();
		;
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		WebElement oldId = driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);

		driver.findElement(By.name("registration_number")).sendKeys("23622519");

		driver.findElement(By.id("btn-online-reg")).click();

		/*------------ fill contractor form------------------------*/

		WebElement ele1 = driver.findElement(By.name("contractor_name"));
		WebDriverUtils1.selectDataByjs(driver, ele1, name);

		WebElement ele2 = driver.findElement(By.name("contractor_fath_hus_name"));
		WebDriverUtils1.selectDataByjs(driver, ele2, fname);

		WebElement ele3 = driver.findElement(By.name("contractor_address_1"));
		WebDriverUtils1.selectDataByjs(driver, ele3, add);

		WebElement ele4 = driver.findElement(By.name("contractor_address_2"));
		WebDriverUtils1.selectDataByjs(driver, ele4, add);

		WebElement ele5 = driver.findElement(By.name("contractor_address_city"));
		WebDriverUtils1.selectDataByjs(driver, ele5, city);

		WebElement dist = driver.findElement(By.name("contractor_address_district_id"));
		WebDriverUtils1.dropdownselect(dist, "Jammu");

		WebElement ele6 = driver.findElement(By.name("contractor_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele6, pin);

		WebElement element = driver.findElement(By.name("contractor_dob"));
		String dateVal = "1990-04-29";
		WebDriverUtils1.selectDateByjs(driver, element, dateVal);

		WebElement ele7 = driver.findElement(By.name("est_name"));
		WebDriverUtils1.selectDataByjs(driver, ele7, name);

		WebElement ele8 = driver.findElement(By.name("est_address_1"));
		WebDriverUtils1.selectDataByjs(driver, ele8, add);

		WebElement ele9 = driver.findElement(By.name("est_address_2"));
		WebDriverUtils1.selectDataByjs(driver, ele9, add);

		WebElement ele10 = driver.findElement(By.name("est_address_city"));
		WebDriverUtils1.selectDataByjs(driver, ele10, city);

		WebElement estdist = driver.findElement(By.name("est_address_district_id"));
		WebDriverUtils1.dropdownselect(estdist, "Jammu");

		WebElement ele11 = driver.findElement(By.name("est_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele11, pin);

		driver.findElement(By.name("business_type")).sendKeys("sdbhcEadr5238ejkt@#$%^&jjjkhj");
		;

		WebElement ele13 = driver.findElement(By.name("prin_name"));
		WebDriverUtils1.selectDataByjs(driver, ele13, name);

		WebElement ele14 = driver.findElement(By.name("prin_desig"));
		WebDriverUtils1.selectDataByjs(driver, ele14, design);

		WebElement ele15 = driver.findElement(By.name("prin_address_1"));
		WebDriverUtils1.selectDataByjs(driver, ele15, add);

		WebElement ele16 = driver.findElement(By.name("prin_address_2"));
		WebDriverUtils1.selectDataByjs(driver, ele16, add);

		WebElement ele17 = driver.findElement(By.name("prin_address_city"));
		WebDriverUtils1.selectDataByjs(driver, ele17, city);

		WebElement pdist = driver.findElement(By.name("prin_address_district_id"));
		WebDriverUtils1.dropdownselect(pdist, "Jammu");

		WebElement ele18 = driver.findElement(By.name("prin_address_pincode"));
		try {
			int pin1 = (Integer) pin;
			WebDriverUtils1.selectDataByjs(driver, ele18, pin1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		/*----------------------- 8. nature of work -------------------*/

		driver.findElement(By.name("nature_of_work")).sendKeys("sgcaydf#$%^&*bhjngdj45678");
		;

		WebElement celement = driver.findElement(By.name("commencement_date"));
		String cdate = "2019-10-11";
		WebDriverUtils1.selectDateByjs(driver, celement, cdate);

		WebElement element1 = driver.findElement(By.name("termination_date"));
		String date = "2018-11-11";
		WebDriverUtils1.selectDateByjs(driver, element1, date);

		WebElement ele20 = driver.findElement(By.name("max_no_of_labour"));
		WebDriverUtils1.selectDataByjs(driver, ele20, no);

		/*------------------------  9.  ------------------------------*/

		WebElement ele21 = driver.findElement(By.name("manager_name"));
		WebDriverUtils1.selectDataByjs(driver, ele21, name);

		WebElement ele22 = driver.findElement(By.name("manager_desig"));
		WebDriverUtils1.selectDataByjs(driver, ele22, design);

		WebElement ele23 = driver.findElement(By.name("manager_address_1"));
		WebDriverUtils1.selectDataByjs(driver, ele23, add);

		WebElement ele24 = driver.findElement(By.name("manager_address_2"));
		WebDriverUtils1.selectDataByjs(driver, ele24, add);

		WebElement ele25 = driver.findElement(By.name("manager_address_city"));
		WebDriverUtils1.selectDataByjs(driver, ele25, city);

		WebElement mdist = driver.findElement(By.name("manager_address_district_id"));
		WebDriverUtils1.dropdownselect(mdist, "Jammu");

		WebElement ele26 = driver.findElement(By.name("manager_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele26, pin);

		/*---------------------------- 10. -----------------------------*/

		WebElement pid = driver.findElement(By.name("prin_employer_doc_id"));
		WebDriverUtils1.dropdownselect(pid, "Pan Card");

		/*---------------------------- 11. -----------------------------*/

		WebElement eid = driver.findElement(By.name("employee_list_doc_id"));
		WebDriverUtils1.dropdownselect(eid, "Aadhaar Card");

		WebElement cpid = driver.findElement(By.name("contractor_photo_doc_id"));
		WebDriverUtils1.dropdownselect(cpid, "Test_Certificate");

		WebElement cdid = driver.findElement(By.name("contractor_doc_id"));
		WebDriverUtils1.dropdownselect(cdid, "Test_pan");

		WebElement cpdid = driver.findElement(By.name("contractor_pledged_doc_id"));
		WebDriverUtils1.dropdownselect(cpdid, "PHOTOGRAPH");

		WebElement adid = driver.findElement(By.name("allotment_doc_id"));
		WebDriverUtils1.dropdownselect(adid, "PHOTOGRAPH");

		WebElement sid = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdownselect(sid, "11");
		Thread.sleep(1000);
		driver.findElement(By.id("submit-btn")).submit();

		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet1");
		return data;
	}
}