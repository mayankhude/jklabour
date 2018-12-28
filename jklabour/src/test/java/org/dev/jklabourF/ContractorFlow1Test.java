package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.ALCContractorsRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractorsRegistration;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContractorFlow1Test extends BaseClass1 {
	static int i = 2;

	@Test
	public void contractorFlow1Test() throws EncryptedDocumentException, Throwable {
		ContractLabourAct1 cla = PageFactory.initElements(driver, ContractLabourAct1.class);
		cla.contractLabour();
		System.out.println("====Contract Labour Act is working====");
		ContractorsRegistration cr = PageFactory.initElements(driver, ContractorsRegistration.class);
		cr.registrationOfContractor();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*------------ fill contractor form------------------------*/

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "contractor");

		String name = fl.getStringExcelData(i, 0);
		driver.findElement(By.name("contractor_name")).sendKeys(name);

		String fname = fl.getStringExcelData(i, 1);
		driver.findElement(By.name("contractor_fath_hus_name")).sendKeys(fname);

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

		WebElement element = driver.findElement(By.name("contractor_dob"));
		String dateVal = "1990-04-29";
		WebDriverUtils1.selectDateByjs(driver, element, dateVal);

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
		FileSet.setExcelData("./shop.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

		String estpin = fl.convertDoubleToString(fl.getIntExcelData(i, 13));
		driver.findElement(By.name("est_address_pincode")).sendKeys(estpin);

		String buss = fl.getStringExcelData(i, 14);
		driver.findElement(By.name("business_type")).sendKeys(buss);

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

		/*----------------------- 8. nature of work -------------------*/

		String work = fl.getStringExcelData(i, 22);
		driver.findElement(By.name("nature_of_work")).sendKeys(work);

		WebElement celement = driver.findElement(By.name("commencement_date"));
		String cdate = "2019-10-11";
		WebDriverUtils1.selectDateByjs(driver, celement, cdate);

		WebElement element1 = driver.findElement(By.name("termination_date"));
		String date = "2018-11-11";
		WebDriverUtils1.selectDateByjs(driver, element1, date);

		String noOfLabour = fl.convertDoubleToString(fl.getIntExcelData(i, 25));
		driver.findElement(By.name("max_no_of_labour")).sendKeys(noOfLabour);

		/*------------------------  9.  ------------------------------*/

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

		/*---------------------------- 10. -----------------------------*/

		WebElement pid = driver.findElement(By.name("prin_employer_doc_id"));
		WebDriverUtils1.dropdown(pid, 3);

		/*---------------------------- 11. -----------------------------*/

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

		WebElement sid = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdown(sid, 6);
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

	}

	@Test
	public void revertALCTest() throws EncryptedDocumentException, Throwable {

		ALCContractorsRegistrationsMenu al = PageFactory.initElements(driver, ALCContractorsRegistrationsMenu.class);
		al.ContractorsRegistrations();

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

	}

}
