package org.dev.jklabour.adminCommonLibs;

import java.util.Properties;
import org.dev.jklabour.ObjectRepositoryA.AdminLogin;
import org.dev.jklabour.ObjectRepositoryA.Common;
import org.dev.jklabour.ObjectRepositoryA.DepartmentLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class labcom {
	
public static WebDriver driver;
	
	
	LabcomWebDriverUtils webutile=new LabcomWebDriverUtils();
	String propertyPath="./propertyFile/common.properties";
	    @BeforeClass
	      public void configBC() throws Throwable
	      {
	    	Properties pObj = AFileUtiles.getpropertyData();
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
	    	webutile.implicitlyWait(10);
	    	webutile.maximizeWindow();
	    	System.out.println("===============browser was launched===============");
	      }    
	    

		@BeforeMethod
		  public void configBM() throws Throwable
		  {Properties pObj = AFileUtiles.getpropertyData();
		  driver.get(pObj.getProperty("url"));
	      DepartmentLogin  dp=PageFactory.initElements(driver,DepartmentLogin.class);
			dp.deptLoginlink();
			
	/*-----
	 * 
	 * ------------------------new  browser handle-----------------------*/	
			LabcomWebDriverUtils.newTab();
	/*-----------------------alc admin login-----------------------*/		
			 AFileUtiles af= new AFileUtiles("./excel/adminData.xlsx", "admin");
			 String  adminALC= af.getStringExcelData(19,1);
			 String adminPWD =af.getStringExcelData(19,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
		
			
		 
			
			
		   }
		
			@AfterMethod
		public void configAM()
		    {
			System.out.println("=============user Logout============");
			
		//	Common cp=PageFactory.initElements(driver, Common.class);
			
			Common lg= PageFactory.initElements(driver, Common.class);
			lg.logOut();
			//cp.logOut();
		    }
		
		
		@AfterClass
		 public void configAC()
		 {
			driver.quit();
			System.out.println("==============Browser Closed=========");
		 }
	
	

}
