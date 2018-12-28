package org.dev.jklabour.adminCommonLibs;

import java.util.Properties;
import org.dev.jklabour.ObjectRepositoryA.Common;
import org.dev.jklabour.ObjectRepositoryA.DepartmentLogin;
import org.dev.jklabour.ObjectRepositoryA.AdminLogin;
import org.dev.jklabour.ObjectRepositoryA.AdminLoginFunction;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AdminBaseClassSAF {
	
public static WebDriver driver;
	
	
	FWebDriverUtils webutile=new FWebDriverUtils();
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
			
			
			 FWebDriverUtils.newTab();
			 AFileUtiles fl= new AFileUtiles("./shop.xlsx","dist");
				String circle=fl.getStringExcelData(1,1);
				System.out.println("selected  circle ==>  "+circle );
			
	/*-----------------------SAF admin login-----------------------*/		
			 
			AFileUtiles af= new AFileUtiles("./excel/adminData.xlsx", "admin");
			
			if(circle.equalsIgnoreCase("Jammu Circle 1"))
			{
			String  adminALC= af.getStringExcelData(17,1);
			 String adminPWD =af.getStringExcelData(17,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
		 
			 ac.adminLogin(adminALC, adminPWD);
		
			}
			
			else if (circle.equalsIgnoreCase("Jammu Circle 2"))
			{
				
				String  adminALC= af.getStringExcelData(18,1);
				 String adminPWD =af.getStringExcelData(18,2);
			
				 AdminLoginFunction alf=PageFactory.initElements(driver, AdminLoginFunction.class);
				 alf.adminLogin(adminALC, adminPWD);
			
			}
				
			
			else if(circle.equalsIgnoreCase("Kashmir Circle 1"))
			{
				
				/*String  adminALC= af.getStringExcelData(17,1);
				 String adminPWD =af.getStringExcelData(17,2);
			
				 AdminLoginFunction alf=PageFactory.initElements(driver, AdminLoginFunction.class);
				 alf.adminLogin(adminALC, adminPWD);*/
			}
			
			
			
			
			else if(circle.equalsIgnoreCase("Kashmir Circle 2"))
			{
				
				/*String  adminALC= af.getStringExcelData(17,1);
				 String adminPWD =af.getStringExcelData(17,2);
			
				 AdminLoginFunction alf=PageFactory.initElements(driver, AdminLoginFunction.class);
				 alf.adminLogin(adminALC, adminPWD);*/
			}
			
			
			
			else{System.out.println("senior inspector of factory is  not available this perticular circle");}
				
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
