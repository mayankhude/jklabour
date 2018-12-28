package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.BoilerAct1;
import org.dev.jklabour.objectRepositorys.BoilerRegistration;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateBoilerReg1Test extends BaseClass1 {

	static int i = 2;

	@Test

	public void BoilerRegTest() throws EncryptedDocumentException, Throwable

	{
		BoilerAct1 boiler = PageFactory.initElements(driver, BoilerAct1.class);
		boiler.boilerAct();

		BoilerRegistration reg = PageFactory.initElements(driver, BoilerRegistration.class);
		reg.boilerRegistration();
		;

		/*---------------------------continue --------------------------*/

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*--------------------------Form start -----------------------------------*/
		FileUtiles fs = new FileUtiles("./excel/jklabourData.xlsx", "contractor");

		String name = fs.getStringExcelData(i, 0);
		driver.findElement(By.name("establishment_name")).sendKeys(name);
		;

		/*---------------------2. Postal address of the establishment-----------*/

		String add = fs.getStringExcelData(i, 1);
		driver.findElement(By.name("establishment_address_1")).sendKeys(add);
		;

		String add2 = fs.getStringExcelData(i, 2);
		driver.findElement(By.name("establishment_address_2")).sendKeys(add2);
		;

		String city = fs.getStringExcelData(i, 3);
		driver.findElement(By.name("establishment_address_city")).sendKeys(city);
		;

		WebElement dist = driver.findElement(By.name("establishment_address_district_id"));
		String dist1 = WebDriverUtils1.dropdownselect(dist, "Jammu");
		System.out.println("selected dist ==>" + dist1);
		FileSet.setExcelData("./shop.xlsx", "dist", 1, 1, dist1);
		Thread.sleep(1000);

		WebElement Circle = driver.findElement(By.name("establishment_address_circle_id"));
		WebDriverUtils1.dropdown(Circle, 1);

		String pin = fs.convertDoubleToString(fs.getIntExcelData(i, 6));
		driver.findElement(By.name("establishment_address_pincode")).sendKeys(pin);
		;

		/*---------------------- Nature of work -----------------------*/

		driver.findElement(By.name("nature_of_work")).sendKeys("jdTFDM");
		;

		driver.findElement(By.name("boiler_rating")).sendKeys("1243.9");
		;

		WebElement folder = driver.findElement(By.name("boiler_folder_doc_id"));
		WebDriverUtils1.dropdown(folder, 3);

		WebElement drawingsOfBoiler = driver.findElement(By.name("boiler_drawings_doc_id"));
		WebDriverUtils1.dropdown(drawingsOfBoiler, 5);

		WebElement attendant = driver.findElement(By.name("boiler_attendant_doc_id"));
		WebDriverUtils1.dropdown(attendant, 2);

		WebElement pipe = driver.findElement(By.name("pipe_layout_doc_id"));
		WebDriverUtils1.dropdown(pipe, 3);

		WebElement welder = driver.findElement(By.name("boiler_welder_doc_id"));
		WebDriverUtils1.dropdown(welder, 3);

		WebElement bi = driver.findElement(By.name("boiler_installation_doc_id"));
		WebDriverUtils1.dropdown(bi, 3);
		WebElement bill = driver.findElement(By.name("bill_doc_id"));
		WebDriverUtils1.dropdown(bill, 3);

		WebElement bil = driver.findElement(By.name("partnership_deed_id"));
		WebDriverUtils1.dropdown(bil, 2);

		try {
			String s = "Yes";

			if ("Yes".contains(s))

			{
				driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
				WebElement last = driver.findElement(By.name("last_certificate_doc_id"));
				WebDriverUtils1.dropdown(last, 2);

				WebElement sell = driver.findElement(By.name("seller_doc_id"));
				WebDriverUtils1.dropdown(sell, 4);

				WebElement rec = driver.findElement(By.name("receipt_doc_id"));
				WebDriverUtils1.dropdown(rec, 2);

			}

			else {
				driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
			}

		} catch (Exception e) {
		}

		WebElement support = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdown(support, 1);

		/*---------------------------- submit form-------------------------------*/

		driver.findElement(By.id("submit-btn")).submit();

		/*---------------------------- next page --------------------------------*/

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

			Thread.sleep(8000);

		} catch (Exception e) {

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
}
