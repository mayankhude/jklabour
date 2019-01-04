package org.dev.jklabour.adminCommonLibs;

import java.util.Properties;
import org.dev.jklabour.ObjectRepositoryA.Common;
import org.dev.jklabour.ObjectRepositoryA.DepartmentLogin;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.ObjectRepositoryA.AdminLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class AdminBaseClassALC {
	
public static WebDriver driver;
	
	
	AWebDriverUtils webutile=new AWebDriverUtils();
	String propertyPath="./propertyFile/common.properties";
	    @BeforeClass
	      public void configBC() throws Throwable
	      {
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
		AWebDriverUtils.newTab();
			
            AFileUtiles fl= new AFileUtiles("./shop.xlsx","dist");
			 String dist1=fl.getStringExcelData(1,1);
			 System.out.println( dist1);
	/*-----------------------alc admin login-----------------------*/		
			 AFileUtiles af= new AFileUtiles("./excel/adminData.xlsx", "admin");
			
			 if(dist1.contains("Jammu"))
			 {
			 String  adminALC= af.getStringExcelData(1,1);
			 String adminPWD =af.getStringExcelData(1,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			
			 
			 else if(dist1.contains("Samba"))
			 {
			 String  adminALC= af.getStringExcelData(5,1);
			 String adminPWD =af.getStringExcelData(5,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			 else if(dist1.contains("Kishtwar"))
			 {
			 String  adminALC= af.getStringExcelData(12,1);
			 String adminPWD =af.getStringExcelData(12,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			
			 
			 
			 else if(dist1.contains("Kathua"))
			 {
			 String  adminALC= af.getStringExcelData(7,1);
			 String adminPWD =af.getStringExcelData(7,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			
			 
			 else if(dist1.equalsIgnoreCase("Udhampur"))
			 {
			 String  adminALC= af.getStringExcelData(8,1);
			 String adminPWD =af.getStringExcelData(8,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			 
			 
			 else if(dist1.equalsIgnoreCase("Reasi"))
			 {
			 String  adminALC= af.getStringExcelData(9,1);
			 String adminPWD =af.getStringExcelData(9,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			 else if(dist1.equalsIgnoreCase("Ramban"))
			 {
			 String  adminALC= af.getStringExcelData(10,1);
			 String adminPWD =af.getStringExcelData(10,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 ac.adminLogin(adminALC, adminPWD);
			 }
			 
			 
			 else if(dist1.equalsIgnoreCase("Doda"))
			 {
			 String  adminALC= af.getStringExcelData(11,1);
			 String adminPWD =af.getStringExcelData(11,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			 else if(dist1.equalsIgnoreCase("Rajouri"))
			 {
			 String  adminALC= af.getStringExcelData(13,1);
			 String adminPWD =af.getStringExcelData(13,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			 else if(dist1.equalsIgnoreCase("Poonch"))
			 {
			 String  adminALC= af.getStringExcelData(14,1);
			 String adminPWD =af.getStringExcelData(14,2);
			 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
			 
			 ac.adminLogin(adminALC, adminPWD);
			 }
			
			
			
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
