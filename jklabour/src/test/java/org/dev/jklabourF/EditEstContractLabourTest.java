

/*
 * @author hudelabs
 * 
 */

package org.dev.jklabourF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.EstablishmentsEmployingContractLabourMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractLabourEstablishments;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EditEstContractLabourTest extends BaseClass1 {

	static int i = 10;

	@Test

	public void Test1CreateEstContractLabour() throws EncryptedDocumentException, Throwable {
		ContractLabourAct1 act = PageFactory.initElements(driver, ContractLabourAct1.class);
		act.contractLabour();
		;

		ContractLabourEstablishments reg = PageFactory.initElements(driver, ContractLabourEstablishments.class);
		reg.establishmentContract();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*------------ fill contractor form------------------------*/

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "contractor");

		/*------------------------ 1. -------------------------------*/

		String name = fl.getStringExcelData(i, 0);
		driver.findElement(By.name("est_name")).sendKeys(name);
		/*------------------------ 2.------------------------------*/

		String loc = fl.getStringExcelData(i, 1);
		driver.findElement(By.name("est_location")).sendKeys(loc);

		/*--------------------- 3. Full postal address of office -----------------*/

		String epostAdd = fl.getStringExcelData(i, 2);
		driver.findElement(By.xpath("//input[@name='est_postal_address_1']")).sendKeys(epostAdd);
		;

		String epostAdd2 = fl.getStringExcelData(i, 3);
		driver.findElement(By.xpath("//input[@name='est_postal_address_2']")).sendKeys(epostAdd2);

		String epostCity = fl.getStringExcelData(i, 4);
		driver.findElement(By.xpath("//input[@name='est_postal_address_city']")).sendKeys(epostCity);

		WebElement pd = driver.findElement(By.xpath("//select[@name='est_postal_address_district_id']"));
		String dist1 = WebDriverUtils1.dropdownselect(pd, "Jammu");
		System.out.println("selected dist ==>" + dist1);
		FileSet.setExcelData("./shop.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

		String epin = fl.convertDoubleToString(fl.getIntExcelData(i, 6));
		driver.findElement(By.name("est_postal_address_pincode")).sendKeys(epin);
		;

		/*--------------------------4. ----------------------*/

		String pname = fl.getStringExcelData(i, 7);
		driver.findElement(By.name("p_employer_name")).sendKeys(pname);

		String fname = fl.getStringExcelData(i, 8);
		driver.findElement(By.name("p_employer_father_husband_name")).sendKeys(fname);

		String postAdd = fl.getStringExcelData(i, 9);
		driver.findElement(By.xpath("//input[@name='p_employer_address_1']")).sendKeys(postAdd);
		;

		String postAdd2 = fl.getStringExcelData(i, 10);
		driver.findElement(By.xpath("//input[@name='p_employer_address_2']")).sendKeys(postAdd2);

		String postCity = fl.getStringExcelData(i, 11);
		driver.findElement(By.xpath("//input[@name='p_employer_address_city']")).sendKeys(postCity);

		WebElement pdist = driver.findElement(By.xpath("//select[@name='p_employer_address_district_id']"));
		WebDriverUtils1.dropdown(pdist, 3);

		String pin = fl.convertDoubleToString(fl.getIntExcelData(i, 13));
		driver.findElement(By.name("p_employer_address_pincode")).sendKeys(pin);
		;

		/*--------------------------5. member detail-----------------------*/
		String namep = fl.getStringExcelData(i, 14);
		driver.findElement(By.name("member_one_name")).sendKeys(namep);
		;

		String share = fl.convertDoubleToString(fl.getIntExcelData(i, 15));
		driver.findElement(By.xpath("//input[@name='member_one_share']")).sendKeys(share);
		;

		String madd = fl.getStringExcelData(i, 16);
		driver.findElement(By.xpath("//input[@name='member_one_per_address']")).sendKeys(madd);
		;

		String des = fl.getStringExcelData(i, 17);
		driver.findElement(By.xpath("//input[@name='member_one_designation']")).sendKeys(des);

		/*----------------------member 2-------------------------------------*/

		String name2 = fl.getStringExcelData(i, 14);
		driver.findElement(By.name("member_two_name")).sendKeys(namep);
		;

		String share2 = fl.convertDoubleToString(fl.getIntExcelData(i, 15));
		driver.findElement(By.xpath("//input[@name='member_two_share']")).sendKeys(share);
		;

		String madd2 = fl.getStringExcelData(i, 16);
		driver.findElement(By.xpath("//input[@name='member_two_per_address']")).sendKeys(madd);
		;

		String des2 = fl.getStringExcelData(i, 17);
		driver.findElement(By.xpath("//input[@name='member_two_designation']")).sendKeys(des);

		/*---------------------------3. member-------------------------*/

		driver.findElement(By.name("member_three_name")).sendKeys(namep);
		;

		driver.findElement(By.xpath("//input[@name='member_three_share']")).sendKeys(share);
		;

		driver.findElement(By.xpath("//input[@name='member_three_per_address']")).sendKeys(madd);
		;

		driver.findElement(By.xpath("//input[@name='member_three_designation']")).sendKeys(des);

		/*---------------------------4. member-------------------------*/

		driver.findElement(By.name("member_four_name")).sendKeys(namep);
		;

		driver.findElement(By.xpath("//input[@name='member_four_share']")).sendKeys(share);
		;

		String madd4 = fl.getStringExcelData(i, 16);
		driver.findElement(By.xpath("//input[@name='member_four_per_address']")).sendKeys(madd);
		;

		driver.findElement(By.xpath("//input[@name='member_four_designation']")).sendKeys(des);

		/*---------------------------5. member-------------------------*/

		String name5 = fl.getStringExcelData(i, 14);
		driver.findElement(By.name("member_five_name")).sendKeys(namep);
		;

		String share5 = fl.convertDoubleToString(fl.getIntExcelData(i, 15));
		driver.findElement(By.xpath("//input[@name='member_five_share']")).sendKeys(share);
		;

		String madd5 = fl.getStringExcelData(i, 16);
		driver.findElement(By.xpath("//input[@name='member_five_per_address']")).sendKeys(madd);
		;

		String des5 = fl.getStringExcelData(i, 17);
		driver.findElement(By.xpath("//input[@name='member_five_designation']")).sendKeys(des);

		/*-------------------6. Full name and address of the
		 *                     Manager or person responsible for 
		 *                 the supervision and control of the establishment -------------*/

		String mname = fl.getStringExcelData(i, 18);
		driver.findElement(By.name("manager_name")).sendKeys(mname);

		String mdes = fl.getStringExcelData(i, 19);
		driver.findElement(By.xpath("//input[@name='manager_designation']")).sendKeys(mdes);

		String mpostAdd = fl.getStringExcelData(i, 20);
		driver.findElement(By.xpath("//input[@name='manager_address_1']")).sendKeys(mpostAdd);
		;

		String mpostAdd2 = fl.getStringExcelData(i, 21);
		driver.findElement(By.xpath("//input[@name='manager_address_2']")).sendKeys(mpostAdd2);

		String mpostCity = fl.getStringExcelData(i, 22);
		driver.findElement(By.xpath("//input[@name='manager_address_city']")).sendKeys(epostCity);

		WebElement mpd = driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
		WebDriverUtils1.dropdown(mpd, 2);

		String mpin = fl.convertDoubleToString(fl.getIntExcelData(i, 24));
		driver.findElement(By.name("manager_address_pincode")).sendKeys(mpin);
		;

		/*----------------------7. nature of work-------------------------*/

		String work = fl.getStringExcelData(i, 25);
		driver.findElement(By.name("nature_of_work")).sendKeys(work);

		/*----------------------select document--------------------------*/

		String twork = fl.convertDoubleToString(fl.getIntExcelData(i, 26));
		driver.findElement(By.name("no_of_workers")).sendKeys(twork);

		WebElement cpid = driver.findElement(By.name("contractor_list_doc_id"));
		WebDriverUtils1.dropdownselect(cpid, "Test_Certificate");

		WebElement cdid = driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdownselect(cdid, "Test_pan");

		WebElement cpdid = driver.findElement(By.name("photograph_doc_id"));
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
			// TODO: handle exception
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

	public void test2ALCRevertBack() throws IOException, Throwable {

		EstablishmentsEmployingContractLabourMenu m = PageFactory.initElements(driver,
				EstablishmentsEmployingContractLabourMenu.class);

		m.EstablishmentsLabour();

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
				.sendKeys("edit this field");

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

		String p = "user";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	@Test

	public void test3ApplicantEditApp() throws EncryptedDocumentException, Throwable {

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
