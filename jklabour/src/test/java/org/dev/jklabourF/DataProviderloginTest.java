

/*
 * @author hudelabs
 * 
 */

package org.dev.jklabourF;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.dev.jklabour.ObjectRepositoryA.DepartmentLogin;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@Listeners(org.dev.jklabour.commonLibS.TestNGListerner.class)
public class DataProviderloginTest {
	static WebDriver driver;
	static Sheet sheet;
	static String perentId;
	static int i = 0;

	@BeforeMethod

	public void setup() {
		String chrome = "./resource/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		driver = new ChromeDriver();
		driver.get("http://www.dev.jklabour.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DepartmentLogin dp = PageFactory.initElements(driver, DepartmentLogin.class);
		dp.deptLoginlink();

		/*-----
		* 
		* ------------------------new  browser handle-----------------------*/

		Set<String> set = driver.getWindowHandles();

		Iterator<String> iterator = set.iterator();
		perentId = iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);
	}

	@Test(dataProvider = "getLoginData")
	public void createFactoryRTest(Object id, Object pwd) throws EncryptedDocumentException, Throwable {

		System.out.println((FileSet.i) + 1 + " sno = ");

		WebElement ele = driver.findElement(By.name("email"));
		WebDriverUtils1.selectDataByjs(driver, ele, id);

		WebElement ele1 = driver.findElement(By.name("password"));
		WebDriverUtils1.selectDataByjs(driver, ele1, pwd);

		driver.findElement(By.xpath("//div[text()='Login']")).click();

		try {

			String admin = driver.findElement(By.xpath("//span[@class='span']")).getText();
			System.out.println(admin + " id is active");

		}

		catch (Exception e) {
			if ("Incorrect Email or Password".equals("Incorrect Email or Password")) {
				String msg = driver.findElement(By.xpath("//div[contains(text(),'Incorrect Email or Password')]"))
						.getText();
				System.out.println(msg);
				System.out.println(id + "  is  " + msg);

				// FileSet.setExcelData("./shop", "Sheet4", i, 2, id1);;
				// i++;
			} else {
				String msg1 = driver.findElement(By.xpath("//div[2]/ul/li")).getText();
				System.out.println("given email " + id + " is " + msg1);
			}
		}
	}

	@DataProvider
	public static Object[][] getLoginData() {

		Object[][] data = FileSet.getTestData("./jklabour.xlsx", "Sheet1");
		return data;
	}

	@AfterMethod
	public void configAM() {

		driver.quit();
		// cp.logOut();

	}

}
