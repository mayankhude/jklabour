package org.dev.jklabourF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.EstEmpBuildingWorkersMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.BuildingWorkers;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EditBuildingWorkerTest extends BaseClass1 {
	static int i = 3;

	@Test
	public void test1CreateBuildingWorker() throws IOException, Throwable {

		BuildingWorkers worker = PageFactory.initElements(driver, BuildingWorkers.class);
		worker.buildingWorkers();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*-------------------------------------------------------------------*/

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "factory");

		String fName = fl.getStringExcelData(i, 0);
		driver.findElement(By.name("establishment_name")).sendKeys(fName);

		String loc = fl.getStringExcelData(i, 1);
		driver.findElement(By.name("establishment_location")).sendKeys(loc);

		String add = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_postal_address_1")).sendKeys(add);

		String add2 = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_postal_address_2")).sendKeys(add2);

		String city = fl.getStringExcelData(i, 3);
		driver.findElement(By.name("establishment_postal_address_city")).sendKeys(city);

		WebElement dist = driver.findElement(By.name("establishment_postal_address_district_id"));
		String dist1 = WebDriverUtils1.dropdownselect(dist, "Jammu");
		System.out.println("selected dist ==>" + dist1);
		FileSet.setExcelData("./shop.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

		String pin = fl.convertDoubleToString(fl.getIntExcelData(i, 4));
		driver.findElement(By.name("establishment_postal_address_pincode")).sendKeys(pin);

		/*--------------------------- 3. -----------------------------------*/

		String padd = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_permanent_address_1")).sendKeys(padd);

		String padd2 = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_permanent_address_2")).sendKeys(padd2);

		String pcity = fl.getStringExcelData(i, 3);
		driver.findElement(By.name("establishment_permanent_address_city")).sendKeys(pcity);

		WebElement pdist = driver.findElement(By.name("establishment_permanent_address_district_id"));
		WebDriverUtils1.dropdown(pdist, 3);

		String ppin = fl.convertDoubleToString(fl.getIntExcelData(i, 12));
		driver.findElement(By.name("establishment_permanent_address_pincode")).sendKeys(ppin);

		/*--------------------------- 4. ----------------------------*/

		String mn = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_manager_name")).sendKeys(mn);

		String madd = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_manager_address_1")).sendKeys(madd);

		String madd2 = fl.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_manager_address_2")).sendKeys(madd2);

		String mcity = fl.getStringExcelData(i, 3);
		driver.findElement(By.name("establishment_manager_address_city")).sendKeys(mcity);

		WebElement mdist = driver.findElement(By.name("establishment_manager_address_district_id"));
		WebDriverUtils1.dropdown(mdist, 3);

		String mpin = fl.convertDoubleToString(fl.getIntExcelData(i, 4));
		driver.findElement(By.name("establishment_manager_address_pincode")).sendKeys(mpin);

		/*------------------------------ 5. ------------------------------*/

		String naturework = fl.getStringExcelData(i, 3);
		driver.findElement(By.name("nature_of_work")).sendKeys(naturework);

		/*------------------------------ 6. --------------------------------*/

		String no = fl.convertDoubleToString(fl.getIntExcelData(i, 11));
		driver.findElement(By.name("max_no_of_workers")).sendKeys(no);

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

		driver.findElement(By.id("submit-btn")).submit();

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		/*
		 * * * -------------------Fee Payment ---------------------------
		 */
		driver.switchTo().frame("paymentFrame");

		MakePayment mp = PageFactory.initElements(driver, MakePayment.class);
		mp.payment();
		mp.merchanSite();

		/*---------------------alert pop-up-------------------------*/
		try {
			Alert alt = driver.switchTo().alert();

			alt.accept();

			Thread.sleep(6000);

		} catch (Exception e) {
			// TODO: handle exception
		}

		/*------------------sceesfully complete payment verify-----*/
		String actmsg = driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();
		System.out.println("actual message ==>" + actmsg);

		// Assertr.assertEquals(actmsg, "Payment Transaction Completed
		// Succcessfully ");
		if (actmsg.contains("Payment Transaction Completed Succcessfully")) {
			System.out.print("transaction completed or  ");

		}

		String trckingId = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
		System.out.println("Tracking Id ==>" + trckingId);

		FileSet.setExcelData("./excel/jklabourData.xlsx", "trackinid", 5, 3, trckingId);
		String p = "alc";
		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	/* ------------------------------------------------------------------ */

	@Test
	public void test2ALCRevertBack() throws EncryptedDocumentException, Throwable {
		EstEmpBuildingWorkersMenu menu = PageFactory.initElements(driver, EstEmpBuildingWorkersMenu.class);
		menu.BuildingWorkers();

		/*
		 * ALCCustPage ap=PageFactory.initElements(driver, ALCCustPage.class);
		 * ap.gettrackingId(); ap.doAction();
		 */

		/*----------------------- click on View -------------------------------*/

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		String id = fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> " + id);

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[text()='View']")).click();

		/*---------------------do action ------------------*/

		LIRevertBackApplicant rb = PageFactory.initElements(driver, LIRevertBackApplicant.class);
		rb.revertBack();

		driver.findElement(By.xpath(
				"//input[@value='reverted_back']" + "/following-sibling::textarea[@name='status_update_message']"))
				.sendKeys("ok");

		/*
		 * driver.findElement(By.
		 * xpath("//div[contains(text(),'Revert Back Request')]/following-sibling::form/div[2]/div"
		 * )).click();
		 * 
		 * Thread.sleep(2000);
		 */

		driver.findElement(By
				.xpath("//div[contains(text(),'Revert Back Request')]/following-sibling::form/div[2]/input[@value='Send']"))
				.submit();

		String msg = driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
		System.out.println(msg);

		/*----------------------set
		                        person  --------------------*/

		String p = "user";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	/* ------------------------------------------------------------------ */

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

	}

}
