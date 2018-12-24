package org.dev.jklabour.commonLibS;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.dev.jklabour.ObjectRepositoryA.AdminLogin;
import org.dev.jklabour.ObjectRepositoryA.DepartmentLogin;
import org.dev.jklabour.objectRepositorys.Logins;
import org.dev.jklabour.objectRepositorys.UsersLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass1 {
	
	public static WebDriver driver;
	static  String person;
	static  String dist;
	static String perentId;
	
	
	    @BeforeClass
	      public void configBC() throws Throwable
	      {
	    System.out.println("===============browser was launched===============");

	    String p="user";
		  String d="jammu";
		  FileSet.setExcelData("./excel/data.xlsx", "person" ,1,1, p);
	     
		  FileSet.setExcelData("./excel/data.xlsx", "dist" ,1,1, d);
   
		 
	      }    
	    
	  
		@BeforeMethod
		  public void configBM() throws Throwable
		  {Properties pObj = FileUtiles.getpropertyData();
		  String chrome="./resource/chromedriver.exe";
  		  System.setProperty("webdriver.chrome.driver", chrome);
  		  driver=new ChromeDriver();
  	   
         WebDriverUtils1.implicitlyWait(10);
         WebDriverUtils1.maximizeWindow();
  	System.out.println("===============browser was launched===============");
  
		  
		  driver.get(pObj.getProperty("url"));
				  Logins lg=PageFactory.initElements(driver, Logins.class);
			         lg.loginmenu();
		      
		  FileUtiles fl=new FileUtiles("./excel/data.xlsx", "person");
			  person=fl.getStringExcelData(1,1);
	
			
/*--------------------------------------------------------------------*/
			 
	 if(person.equalsIgnoreCase("USER"))
	     {    
		 FileUtiles af1=new FileUtiles("./excel/adminData.xlsx", "admin");
			
		 String user=af1.getStringExcelData(21,1);
		 String userPWD =af1.getStringExcelData(21,2);
			System.out.println("login");
			UsersLogin lp = PageFactory.initElements(driver, UsersLogin.class);
			lp.login(user,userPWD);		 
	   }
			 
			 
		
		 else if(person.equalsIgnoreCase("ALC"))
			     { 
			 FileUtiles fl1=new FileUtiles("./excel/data.xlsx", "dist");
			 dist=fl1.getStringExcelData(1,1);	
 
			 DepartmentLogin  dp=PageFactory.initElements(driver,DepartmentLogin.class);
				dp.deptLoginlink();
				
		/*-----
		 * 
		 * ------------------------new  browser handle-----------------------*/	
				
				Set<String> set=driver.getWindowHandles();
				System.out.println(set.size());
				
				Iterator<String> iterator=set.iterator();
				 perentId=iterator.next();
				String childId=iterator.next();
				driver.switchTo().window(childId);

			
				 
				
			 
				   if(dist.equalsIgnoreCase("Jammu"))
				     {
					   FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					  String  adminALC= af.getStringExcelData(1,1);
					  String adminPWD =af.getStringExcelData(1,2);
					  AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					  ac.adminLogin(adminALC, adminPWD );
				     }	
				
				  else if (dist.equalsIgnoreCase("Samba"))
				     {
					  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					  String  adminALC= af.getStringExcelData(5,1);
					  String adminPWD =af.getStringExcelData(5,2);
					  AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					  ac.adminLogin(adminALC, adminPWD );
				     }
				
				  else if (dist.equalsIgnoreCase("Kathua"))
				     {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					  String  adminALC= af.getStringExcelData(7,1);
					  String adminPWD =af.getStringExcelData(7,2);
					  AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					  ac.adminLogin(adminALC, adminPWD );
				      }
				
				  else if (dist.equalsIgnoreCase("Udhampur"))
				   {
					  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(8,1);
					 String adminPWD =af.getStringExcelData(8,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
				  else if (dist.equalsIgnoreCase("Reasi"))
				   {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(9,1);
					 String adminPWD =af.getStringExcelData(9,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
				
				  else if (dist.equalsIgnoreCase("Ramban"))
				   {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(10,1);
					 String adminPWD =af.getStringExcelData(10,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
				  else if (dist.equalsIgnoreCase("Doda"))
				   {
					  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(11,1);
					 String adminPWD =af.getStringExcelData(11,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				   }
				
				  else if (dist.equalsIgnoreCase("Kishtwar"))
				   {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(12,1);
					 String adminPWD =af.getStringExcelData(12,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
					
				     }
				
				  else if (dist.equalsIgnoreCase("Rajouri"))
				   {
					  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(13,1);
					 String adminPWD =af.getStringExcelData(13,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD ); 
				   
				   }
				
				
				  else if (dist.equalsIgnoreCase("Poonch"))
				   {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					String  adminALC= af.getStringExcelData(14,1);
					 String adminPWD =af.getStringExcelData(14,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
			
			          }
			 
			 else if(person.equalsIgnoreCase("LI"))
			    {   	
				 DepartmentLogin  dp=PageFactory.initElements(driver,DepartmentLogin.class);
					dp.deptLoginlink();
					
			/*-----
			 * 
			 * ------------------------new  browser handle-----------------------*/	
					
					Set<String> set=driver.getWindowHandles();
					System.out.println(set.size());
					
					Iterator<String> iterator=set.iterator();
					String perentId=iterator.next();
					String childId=iterator.next();
					driver.switchTo().window(childId);

			
				
					 
					 FileUtiles fl1=new FileUtiles("./excel/data.xlsx", "dist");
							 dist=fl1.getStringExcelData(1,1);	
				 
				 
				  if(dist.equalsIgnoreCase("Jammu"))
				   { FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					  String  adminALC= af.getStringExcelData(3,3);
						 String adminPWD =af.getStringExcelData(3,4);
						 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
						 ac.adminLogin(adminALC, adminPWD );
				   }	
				
				
			
				else if (dist.equalsIgnoreCase("Samba"))
				   {
					FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(5,3);
					 String adminPWD =af.getStringExcelData(5,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );  
				   }
				
				else if (dist.equalsIgnoreCase("Kathua"))
				   {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(7,3);
					 String adminPWD =af.getStringExcelData(7,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
				else if (dist.equalsIgnoreCase("Udhampur"))
				   {FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(8,3);
					 String adminPWD =af.getStringExcelData(8,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
				
				else if (dist.equalsIgnoreCase("Doda"))
				   {
					FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(11,3);
					 String adminPWD =af.getStringExcelData(11,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );  
				   }
				
				  else if (dist.equalsIgnoreCase("Kishtwar"))
				   {
					  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(12,3);
					 String adminPWD =af.getStringExcelData(12,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD ); 
				   }
				
				  else if (dist.equalsIgnoreCase("Rajouri"))
				   {
					  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(13,3);
					 String adminPWD =af.getStringExcelData(13,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				
				
			  }
			 
			 else if(person.equalsIgnoreCase("SAF"))
			  {   	
				 DepartmentLogin  dp=PageFactory.initElements(driver,DepartmentLogin.class);
					dp.deptLoginlink();
					
			/*-----
			 * 
			 * ------------------------new  browser handle-----------------------*/	
					
					Set<String> set=driver.getWindowHandles();
					System.out.println(set.size());
					
					Iterator<String> iterator=set.iterator();
					 perentId=iterator.next();
					String childId=iterator.next();
					driver.switchTo().window(childId);
					 
					 FileUtiles fl1=new FileUtiles("./excel/data.xlsx", "dist");
							 dist=fl1.getStringExcelData(1,1);	
				
				
				 
				 if (dist.equalsIgnoreCase("Jammu Circle 1"))
				   { FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(17,1);
					 String adminPWD =af.getStringExcelData(17,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				 
				 else if (dist.equalsIgnoreCase("Jammu Circle 2"))
				     { FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(18,1);
					 String adminPWD =af.getStringExcelData(18,2);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				  
				  else{
					  System.out.println("---selected district admin not present now ----");
				     }
				
				 
			       }//SAF close
			 
			 
			 else if(person.equalsIgnoreCase("IOF"))
			    {
				   	
				 DepartmentLogin  dp=PageFactory.initElements(driver,DepartmentLogin.class);
					dp.deptLoginlink();
					
			/*-----
			 * 
			 * ------------------------new  browser handle-----------------------*/	
					
					Set<String> set=driver.getWindowHandles();
					System.out.println(set.size());
					
					Iterator<String> iterator=set.iterator();
					 perentId=iterator.next();
					String childId=iterator.next();
					driver.switchTo().window(childId);

				
					 
					 FileUtiles fl1=new FileUtiles("./excel/data.xlsx", "dist");
							 dist=fl1.getStringExcelData(1,1);	
							 
				 if (dist.equalsIgnoreCase("Jammu Circle 1"))
				   { FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(17,3);
					 String adminPWD =af.getStringExcelData(17,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				 
				 else if (dist.equalsIgnoreCase("Jammu Circle 2"))
				     { FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
					 String  adminALC= af.getStringExcelData(18,3);
					 String adminPWD =af.getStringExcelData(18,4);
					 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
					 ac.adminLogin(adminALC, adminPWD );
				     }
				  
				   else{
					  System.out.println("---selected district admin not present now ----");
				     }
				
			    }// iof close 
			 
			  else if(person.equalsIgnoreCase("SC"))
			      {
				  
				   	
					 DepartmentLogin  dp=PageFactory.initElements(driver,DepartmentLogin.class);
						dp.deptLoginlink();
						
				/*-----
				 * 
				 * ------------------------new  browser handle-----------------------*/	
						
						Set<String> set=driver.getWindowHandles();
						System.out.println(set.size());
						
						Iterator<String> iterator=set.iterator();
						 perentId=iterator.next();
						String childId=iterator.next();
						driver.switchTo().window(childId);

					
				  
				  FileUtiles af=new FileUtiles("./excel/adminData.xlsx", "admin");	 
				 String  adminALC= af.getStringExcelData(19,1);
				 String adminPWD =af.getStringExcelData(19,2);
				 AdminLogin ac = PageFactory.initElements(driver, AdminLogin.class);
				 ac.adminLogin(adminALC, adminPWD );
			       }// sc close

	    } // base class close	 
		
		
		
	@AfterMethod
		public void configAM()
		{
		
			driver.quit();
		 
		 
	        }
		
		
	/*	@AfterClass
		 public void configAC()
		 {
			driver.quit();
			System.out.println("==============Browser Closed=========");
		 }
			
			*/
}
