package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryLicenceGrant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FLengthFactroryRegTest extends BaseClass1 {

	static int i = 2;

	@Test

	public void facoryLengthTest() throws EncryptedDocumentException, Throwable

	{
		FactoryAct1 fa = PageFactory.initElements(driver, FactoryAct1.class);
		fa.factoryAct();

		FactoryLicenceGrant flc = PageFactory.initElements(driver, FactoryLicenceGrant.class);
		flc.fLicenceGrant();

		/*---------------------------continue --------------------------*/

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

		driver.findElement(By.xpath("//input[@name='factory_name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='factory_address_1']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='factory_address_2']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='factory_address_city']")).sendKeys(name);

		WebElement dist = driver.findElement(By.xpath("//select[@name='factory_address_district_id']"));
		WebDriverUtils1.dropdownselect(dist, "Kathua");

		WebElement circle = driver.findElement(By.xpath("//select[@name='factory_address_circle_id']"));
		WebDriverUtils1.dropdownSelectByValue(circle, "2");

		driver.findElement(By.xpath("//input[@name='factory_address_pincode']")).sendKeys(name);

		/*------------------------3.  ------------------------*/

		driver.findElement(By.xpath("//input[@name='factory_situation_province']")).sendKeys(name);

		WebElement pdist = driver.findElement(By.xpath("//select[@name='factory_situation_district_id']"));
		WebDriverUtils1.dropdown(pdist, 2);

		driver.findElement(By.xpath("//input[@name='factory_situation_town']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='factory_situation_railway_station']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='factory_situation_nearer_ghat']")).sendKeys(name);

		/*--------------------4.  communication address-------------------*/

		driver.findElement(By.xpath("//input[@name='communication_address_1']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='communication_address_2']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='communication_address_city']")).sendKeys(name);

		WebElement cdist = driver.findElement(By.xpath("//select[@name='communication_address_district_id']"));
		WebDriverUtils1.dropdown(cdist, 4);

		driver.findElement(By.xpath("//input[@name='communication_address_pincode']")).sendKeys(name);

		/*-----------------------5.  -------------------------*/

		driver.findElement(By.xpath("//textarea[@name='detail_last_12_months']")).sendKeys(detail);

		driver.findElement(By.xpath("//textarea[@name='detail_next_12_months']")).sendKeys(detail);

		/*---------------6. Names and value of products to be manufactured ----------*/
		String productstype = name;
		System.out.println("\n" + productstype);
		String expproduct = "Manufacturing";
		if (expproduct.contains(productstype)) {
			driver.findElement(By.xpath("//input[@value='manufacturing']")).click();
		}

		else {
			driver.findElement(By.xpath("//input[@value='service']")).click();
		}
		Thread.sleep(4000);

		WebElement nic2 = driver.findElement(By.id("nic-2"));
		Select sel = new Select(nic2);
		java.util.List<WebElement> lst = sel.getOptions();

		System.out.println(" size of nic-2 list is ---> " + lst.size());

		WebDriverUtils1.dropdown(nic2, 3);
		Thread.sleep(5000);

		/*--------------------------nic-4  size----------------------------------*/
		WebElement nic4 = driver.findElement(By.id("nic-4"));

		Select sl = new Select(nic4);
		java.util.List<WebElement> list = sl.getOptions();

		System.out.println("size of nic-4  list  is ===> " + list.size());

		WebDriverUtils1.dropdown(nic4, 1);
		Thread.sleep(5000);

		/*--------------------------nic-5  size----------------------------------*/
		WebElement nic5 = driver.findElement(By.id("nic-5"));

		Select sl5 = new Select(nic5);
		java.util.List<WebElement> list5 = sl5.getOptions();

		System.out.println("size of nic-5 list is ====> " + list5.size());

		WebDriverUtils1.dropdown(nic4, 2);
		Thread.sleep(5000);

		/*--------------------------nic-5  selection----------------------------------*/

		/*------------------------------add nic------------------------------*/
		driver.findElement(By.id("add-nic")).click();
		Thread.sleep(1000);
		/*
		 * driver.findElement(By.className("delete-nic")).click();
		 */

		/*---------------------------no of worker---------------------------*/

		driver.findElement(By.xpath("//input [@name='no_of_workers']")).sendKeys(name);

		driver.findElement(By.xpath("//input [@name='max_no_of_workers']")).sendKeys(name);

		driver.findElement(By.xpath("//input [@name='total_amount_of_power']")).sendKeys(name);

		driver.findElement(By.xpath("//input [@name='max_amount_of_power']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='manager_name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='manager_address_1']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='manager_address_2']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='manager_address_city']")).sendKeys(name);

		WebElement mdist = driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
		WebDriverUtils1.dropdown(mdist, 2);

		driver.findElement(By.xpath("//input[@name='manager_address_pincode']")).sendKeys(name);

		/*--------------1. name and residential address of the occupier---------*/
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"))
				.sendKeys(name);

		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/input[@name='occupiers_name_address_address[]']"))
				.sendKeys(name);

		/*--------------2. name and residential address of the occupier---------*/

		driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"))
				.sendKeys(name);

		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div/input[@name='occupiers_name_address_address[]']"))
				.sendKeys(name);

		/*--------------3. name and residential address of the occupier---------*/

		driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[1]/div/input")).sendKeys(name);

		driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[2]/div/input")).sendKeys(name);

		/*--------------4. name and residential address of the occupier---------*/

		driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[1]/div/input")).sendKeys(name);

		driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[2]/div/input")).sendKeys(name);

		/*--------------5. name and residential address of the occupier---------*/

		driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[1]/div/input")).sendKeys(name);

		driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[2]/div/input")).sendKeys(name);

		/*------------------------13. Full name and address of the owner ----------------------*/

		driver.findElement(By.xpath(" //input[@name='owner_name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='owner_address_1']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='owner_address_2']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='owner_address_city']")).sendKeys(name);

		WebElement wdist = driver.findElement(By.xpath("//select[@name='owner_address_district_id']"));
		WebDriverUtils1.dropdown(wdist, 20);

		driver.findElement(By.xpath("//input[@name='owner_address_pincode']")).sendKeys(name);

		/*------------------------13. Full name and address of the owner ----------------------*/

		driver.findElement(By.xpath(" //input[@name='owner_name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='owner_address_1']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@name='owner_address_city']")).sendKeys(name);

		WebElement wdist1 = driver.findElement(By.xpath("//select[@name='owner_address_district_id']"));
		WebDriverUtils1.dropdown(wdist1, 20);

		driver.findElement(By.xpath("//input[@name='owner_address_pincode']")).sendKeys(name);
		/*-----------------------14. Whether constructed or extended -------------------*/

		/*****
		 * radio button *
		 *****/

		String data = name;
		System.out.println("\n " + data);
		String expdata = "Constructed";
		if (expdata.contains(data)) {
			driver.findElement(By.xpath("//input[@value='Constructed']")).click();
		}

		else {
			driver.findElement(By.xpath("//input[@value='Extended']")).click();
		}

		driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_plans']")).sendKeys(name);

		/*
		 * String date=fl.getStringExcelData(2,44); driver.findElement(By.xpath(
		 * "//input[@name='already_date_of_approval_of_plans']"))
		 * .sendKeys(name); (data);
		 * 
		 */
		driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements']")).sendKeys(name);

		/*
		 * String arrengeDate=fl.getStringExcelData(2,46);
		 * driver.findElement(By.xpath(
		 * "//input[@name='already_date_of_approval_of_arrangements']"))
		 * .sendKeys(name); (arrengeDate);
		 */

		driver.findElement(By
				.xpath("//input[@name='already_no_of_approval_of_arrangements'][contains(@placeholder,'Name of the authority')]"))
				.sendKeys(name);

		/*------------------------15.  Industry Category--------------------*/

		/* radio button choose */

		String catagoryData = name;
		System.out.println("\n" + catagoryData);

		if (expdata.contains(catagoryData)) {
			driver.findElement(By.xpath("//input[@value='1'][@name='industry_category']")).click();
		}

		else if ("Solvent extraction plants".contains(catagoryData)) {
			driver.findElement(By.xpath("//input[@value='2'][@name='industry_category']")).click();
		}

		else if ("Electroplating,".contains(catagoryData)) {
			driver.findElement(By.xpath("//input[@value='3'][@name='industry_category']")).click();
		} else if ("Copper and Steel".contains(catagoryData)) {
			driver.findElement(By.xpath("//input[@value='4'][@name='industry_category']")).click();
		} else if ("Electonic Goods".contains(catagoryData)) {
			driver.findElement(By.xpath("//input[@value='5'][@name='industry_category']")).click();
		} else {
			driver.findElement(By.xpath("//input[@value='6'][@name='industry_category']")).click();
		}

		/*------------------------16. Type of Industry*-------------------*/

		String iData = name;
		System.out.println("\n Type of Industry==> " + iData);
		String Iexpdata = "white";
		if (Iexpdata.contains(iData)) {
			driver.findElement(By.xpath("//input[@name='industry_type'][@value='white']")).click();
		}

		else if ("green".contains(iData)) {
			driver.findElement(By.xpath("//input[@name='industry_type'][@value='green']")).click();
		}

		else if ("orange".contains(iData)) {
			driver.findElement(By.xpath("//input[@name='industry_type'][@value='orange']")).click();
		}

		else {
			driver.findElement(By.xpath("//input[@name='industry_type'][@value='red']")).click();
		}

		/*----------------------16 (1). Factory Registration Period*---------------*/

		try {
			String fData = name;
			System.out.println("\n Factory Registration Period* ==> " + fData + " \n");

			if ("1 Year".contains(fData)) {
				driver.findElement(By.xpath("//input[@name='registration_period'][@value='1']")).click();
			}

			else if ("2 Year".contains(fData)) {
				driver.findElement(By.xpath("//input[@name='registration_period'][@value='2']")).click();
			}

			else {
				driver.findElement(By.xpath("//input[@name='registration_period'][@value='3']")).click();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		/*----------------17.  --------------------------*/

		WebElement we = driver.findElement(By.xpath("//select[@name='consent_certificate_id']"));

		WebDriverUtils1.dropdown(we, 2);

		/*----------------18.  --------------------------*/

		WebElement we1 = driver.findElement(By.xpath("//select[@name='noc_license_id']"));

		WebDriverUtils1.dropdown(we1, 1);

		/*----------------19.  --------------------------*/

		WebElement wmgr = driver.findElement(By.xpath("//select[@name='manager_letter_id']"));

		WebDriverUtils1.dropdown(wmgr, 3);

		/*----------------20.  --------------------------*/

		WebElement wpower = driver.findElement(By.xpath("//select[@name='power_sanction_id']"));

		WebDriverUtils1.dropdown(wpower, 5);

		/*----------------21.  --------------------------*/

		WebElement wsafty = driver.findElement(By.xpath("//select[@name='safety_certificate_id']"));

		WebDriverUtils1.dropdown(wsafty, 4);

		/*----------------22.  --------------------------*/

		WebElement wpass = driver.findElement(By.xpath("//select[@name='passport_doc_id']"));

		WebDriverUtils1.dropdown(wpass, 3);

		/*----------------23.  --------------------------*/

		WebElement wsupport = driver.findElement(By.xpath("//select[@name='support_doc1_id']"));

		WebDriverUtils1.dropdown(wsupport, 4);

		/*----------------24.  --------------------------*/

		WebElement wpen = driver.findElement(By.xpath("//select[@name='support_doc2_id']"));

		WebDriverUtils1.dropdown(wpen, 3);

	}
}
