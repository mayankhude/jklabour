package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.FormDNoticceMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class test extends BaseClass1 {

	@Test
	public void revertBackForChangeDistTest() throws EncryptedDocumentException, Throwable {

		FormDNoticceMenu menu = PageFactory.initElements(driver, FormDNoticceMenu.class);
		menu.NoticceOfChange();

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		String id = fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> " + id);

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[text()='View']")).click();

		/*---------------------do action ------------------*/

		LIRevertBackApplicant li = PageFactory.initElements(driver, LIRevertBackApplicant.class);
		;

		li.revertBack();

		driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div/textarea")).sendKeys("ok");

		driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();

		String person = "user";
		FileSet.setExcelData("./excel/jklabourData.xlsx", "person", 1, 1, person);

	}

}
