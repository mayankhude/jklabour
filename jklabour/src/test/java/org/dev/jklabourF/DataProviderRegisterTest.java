package org.dev.jklabourF;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRegisterTest {
	public static WebDriver driver;
@BeforeClass


public void configBC() throws Throwable{
	
	Properties pObj = FileUtiles.getpropertyData();
	System.out.println("==================launch the browser==============");
	String bName=pObj.getProperty("browser");
	if(bName.equals("firefox"))
	   {
		driver=new FirefoxDriver();
	   }
	  
	else if(bName.equals("chrome"))
	   { String chrome="./resource/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chrome);
		driver=new ChromeDriver();
	   }
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("===============browser was launched===============");
  }    


@BeforeMethod
  public void configBM() throws Throwable
  {Properties pObj = FileUtiles.getpropertyData();
  driver.get(pObj.getProperty("url"));}
	



@Test(dataProvider="getData")
	
	
	
	public void registerTest(
			Object name, Object lname, Object email, Object mno, Object pin, Object p,
			Object c,Object g) throws EncryptedDocumentException, Throwable
	{
		Register reg=PageFactory.initElements(driver, Register.class);
		reg.register();
		
		
		
		
	WebElement nam=driver.findElement(By.name("firstname"));
		 WebDriverUtils1.selectDataByjs(driver, nam, name);
		
		
			WebElement ele=driver.findElement(By.name("lastname"));
		 WebDriverUtils1.selectDataByjs(driver, ele, lname);
	
		String gender=(String) g;
		if(gender.equalsIgnoreCase("female"))
		{
			driver.findElement(By.xpath("//input[@value='female']")).click();
		}
		else if(gender.equalsIgnoreCase("male")){
			
			driver.findElement(By.xpath("//input[@value='male']")).click();
		}
		
		else{driver.findElement(By.xpath("//input[@value='other']")).click();}
		
		
		
		WebElement ele2=driver.findElement(By.name("email"));
		 WebDriverUtils1.selectDataByjs(driver, ele2, email);
		
	
			WebElement ele3	=driver.findElement(By.name("mobile"));
		 WebDriverUtils1.selectDataByjs(driver, ele3, mno);
		
		
		String dateVal="2018-12-18";
				WebElement ele1=driver.findElement(By.name("dob"));
		WebDriverUtils1.selectDateByjs(driver, ele1, dateVal);
		
		driver.findElement(By.name("address_of_communication"))
		.sendKeys(",dkmvu;szhdjlk345678#$%^&*");
		
		
		WebElement ele4=driver.findElement(By.name("pincode"));
		 WebDriverUtils1.selectDataByjs(driver, ele4, pin);
		
		 WebElement ele5=driver.findElement(By.name("telephone_number"));
		 WebDriverUtils1.selectDataByjs(driver, ele5, mno);
		 
		 
		 
		 WebElement ele6=driver.findElement(By.name("fax_number"));;
		 WebDriverUtils1.selectDataByjs(driver, ele6, mno);
		 
		 
			WebElement ele7=driver.findElement(By.name("website_url"));
			 WebDriverUtils1.selectDataByjs(driver, ele7, email);
			
		
		 
		driver.findElement(By.id("same_as")).click();
		
	
		WebElement pwd=	driver.findElement(By.name("password"));
		 WebDriverUtils1.selectDataByjs(driver,pwd, p);
		
	
			WebElement  cpwd=driver.findElement(By.name("confirmpassword"));
		 WebDriverUtils1.selectDataByjs(driver, cpwd,c );
		driver.findElement(By.id("submit-btn")).click();
		}
	
	
	
	@DataProvider
	 public  Object[][] getData()
	 {
		Object[][] data = FileSet.getTestData("./excel/data.xlsx", "reg");
		return data;
	 }

}
