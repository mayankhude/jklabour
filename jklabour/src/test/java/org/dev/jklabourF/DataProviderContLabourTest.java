package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractLabourEstablishments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderContLabourTest extends BaseClass1 {

	static int i = 10;

	@Test(dataProvider = "getData")

	public void EstablishmentsEmployingContractLabourTest(Object name, Object fname, Object add, Object city,
			Object pin, Object design, Object no) throws EncryptedDocumentException, Throwable {
		ContractLabourAct1 act = PageFactory.initElements(driver, ContractLabourAct1.class);
		act.contractLabour();
		;

		ContractLabourEstablishments reg = PageFactory.initElements(driver, ContractLabourEstablishments.class);
		reg.establishmentContract();

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		/*------------ fill contractor form------------------------*/

		/*------------------------ 1. -------------------------------*/

		WebElement ele = driver.findElement(By.name("est_name"));
		WebDriverUtils1.selectDataByjs(driver, ele, fname);
		/*------------------------ 2.------------------------------*/

		WebElement ele1 = driver.findElement(By.name("est_location"));
		WebDriverUtils1.selectDataByjs(driver, ele1, city);

		/*--------------------- 3. Full postal address of office -----------------*/

		WebElement ele2 = driver.findElement(By.xpath("//input[@name='est_postal_address_1']"));
		WebDriverUtils1.selectDataByjs(driver, ele2, add);

		WebElement ele3 = driver.findElement(By.xpath("//input[@name='est_postal_address_2']"));
		WebDriverUtils1.selectDataByjs(driver, ele3, add);

		WebElement ele4 = driver.findElement(By.xpath("//input[@name='est_postal_address_city']"));
		WebDriverUtils1.selectDataByjs(driver, ele4, city);

		WebElement pd = driver.findElement(By.xpath("//select[@name='est_postal_address_district_id']"));
		WebDriverUtils1.dropdown(pd, 2);

		WebElement ele5 = driver.findElement(By.name("est_postal_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele5, pin);

		/*--------------------------4. ----------------------*/

		WebElement ele6 = driver.findElement(By.name("p_employer_name"));
		WebDriverUtils1.selectDataByjs(driver, ele6, name);

		WebElement ele7 = driver.findElement(By.name("p_employer_father_husband_name"));
		WebDriverUtils1.selectDataByjs(driver, ele7, fname);

		WebElement ele8 = driver.findElement(By.xpath("//input[@name='p_employer_address_1']"));
		WebDriverUtils1.selectDataByjs(driver, ele8, add);

		WebElement ele9 = driver.findElement(By.xpath("//input[@name='p_employer_address_2']"));
		WebDriverUtils1.selectDataByjs(driver, ele9, add);

		WebElement ele10 = driver.findElement(By.xpath("//input[@name='p_employer_address_city']"));
		WebDriverUtils1.selectDataByjs(driver, ele10, city);

		WebElement pdist = driver.findElement(By.xpath("//select[@name='p_employer_address_district_id']"));
		WebDriverUtils1.dropdown(pdist, 3);

		WebElement ele11 = driver.findElement(By.name("p_employer_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele11, pin);

		/*--------------------------5. member detail-----------------------*/

		WebElement ele12 = driver.findElement(By.name("member_one_name"));
		WebDriverUtils1.selectDataByjs(driver, ele12, name);

		WebElement ele13 = driver.findElement(By.xpath("//input[@name='member_one_share']"));
		WebDriverUtils1.selectDataByjs(driver, ele13, pin);

		WebElement ele14 = driver.findElement(By.xpath("//input[@name='member_one_pin_address']"));
		WebDriverUtils1.selectDataByjs(driver, ele14, add);

		WebElement ele15 = driver.findElement(By.xpath("//input[@name='member_one_designation']"));
		WebDriverUtils1.selectDataByjs(driver, ele15, design);

		/*----------------------member 2-------------------------------------*/

		WebElement ele16 = driver.findElement(By.name("member_two_name"));
		WebDriverUtils1.selectDataByjs(driver, ele16, name);

		WebElement ele17 = driver.findElement(By.xpath("//input[@name='member_two_share']"));
		WebDriverUtils1.selectDataByjs(driver, ele17, pin);

		WebElement ele18 = driver.findElement(By.xpath("//input[@name='member_two_pin_address']"));
		WebDriverUtils1.selectDataByjs(driver, ele18, add);

		WebElement ele19 = driver.findElement(By.xpath("//input[@name='member_two_designation']"));
		WebDriverUtils1.selectDataByjs(driver, ele19, design);

		/*---------------------------3. member-------------------------*/

		WebElement ele20 = driver.findElement(By.name("member_three_name"));
		WebDriverUtils1.selectDataByjs(driver, ele20, name);

		WebElement ele21 = driver.findElement(By.xpath("//input[@name='member_three_share']"));
		WebDriverUtils1.selectDataByjs(driver, ele21, pin);

		WebElement ele22 = driver.findElement(By.xpath("//input[@name='member_three_pin_address']"));
		WebDriverUtils1.selectDataByjs(driver, ele22, add);

		WebElement ele23 = driver.findElement(By.xpath("//input[@name='member_three_designation']"));
		WebDriverUtils1.selectDataByjs(driver, ele23, design);

		/*---------------------------4. member-------------------------*/

		WebElement ele24 = driver.findElement(By.name("member_four_name"));
		WebDriverUtils1.selectDataByjs(driver, ele24, name);

		WebElement ele25 = driver.findElement(By.xpath("//input[@name='member_four_share']"));
		WebDriverUtils1.selectDataByjs(driver, ele25, pin);

		WebElement ele26 = driver.findElement(By.xpath("//input[@name='member_four_pin_address']"));
		WebDriverUtils1.selectDataByjs(driver, ele26, add);

		WebElement ele27 = driver.findElement(By.xpath("//input[@name='member_four_designation']"));
		WebDriverUtils1.selectDataByjs(driver, ele27, design);

		/*---------------------------5. member-------------------------*/

		WebElement ele28 = driver.findElement(By.name("member_five_name"));
		WebDriverUtils1.selectDataByjs(driver, ele28, name);

		WebElement ele29 = driver.findElement(By.xpath("//input[@name='member_five_share']"));
		WebDriverUtils1.selectDataByjs(driver, ele29, pin);

		WebElement ele30 = driver.findElement(By.xpath("//input[@name='member_five_pin_address']"));
		WebDriverUtils1.selectDataByjs(driver, ele30, add);

		WebElement ele31 = driver.findElement(By.xpath("//input[@name='member_five_designation']"));
		WebDriverUtils1.selectDataByjs(driver, ele31, design);

		/*-------------------6. Full name and address of the
		 *                     Manager or pinson responsible for 
		 *                 the supinvision and control of the establishment -------------*/

		WebElement ele32 = driver.findElement(By.name("manager_name"));
		WebDriverUtils1.selectDataByjs(driver, ele32, name);

		WebElement ele33 = driver.findElement(By.xpath("//input[@name='manager_designation']"));
		WebDriverUtils1.selectDataByjs(driver, ele33, design);

		WebElement ele34 = driver.findElement(By.xpath("//input[@name='manager_address_1']"));
		WebDriverUtils1.selectDataByjs(driver, ele34, add);

		WebElement ele35 = driver.findElement(By.xpath("//input[@name='manager_address_2']"));
		WebDriverUtils1.selectDataByjs(driver, ele35, add);

		WebElement ele36 = driver.findElement(By.xpath("//input[@name='manager_address_city']"));
		WebDriverUtils1.selectDataByjs(driver, ele36, city);

		WebElement mpd = driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
		WebDriverUtils1.dropdown(mpd, 2);

		WebElement ele37 = driver.findElement(By.name("manager_address_pincode"));
		WebDriverUtils1.selectDataByjs(driver, ele37, pin);

		/*----------------------7. nature of work-------------------------*/

		driver.findElement(By.name("nature_of_work")).sendKeys("JHWSG$%^&*hjkhdf123456D nmadb");
		;

		/*----------------------select document--------------------------*/

		WebElement ele39 = driver.findElement(By.name("no_of_workers"));
		WebDriverUtils1.selectDataByjs(driver, ele39, no);

		/*------------------------- select options ----------------------*/
		WebElement cpid = driver.findElement(By.name("contractor_list_doc_id"));
		WebDriverUtils1.dropdownselect(cpid, "Test_Certificate");

		WebElement cdid = driver.findElement(By.name("license_doc_id"));
		WebDriverUtils1.dropdownselect(cdid, "Test_pan");

		WebElement cpdid = driver.findElement(By.name("photograph_doc_id"));
		WebDriverUtils1.dropdownselect(cpdid, "PHOTOGRAPH");

		WebElement sid = driver.findElement(By.name("support_doc_id"));
		WebDriverUtils1.dropdownselect(sid, "11");
		Thread.sleep(10000);

		/*---------------------------- submit form-------------------------------*/

		driver.findElement(By.xpath("//input[@value='Continue']")).submit();
		Thread.sleep(40000);

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet1");
		return data;
	}

}
