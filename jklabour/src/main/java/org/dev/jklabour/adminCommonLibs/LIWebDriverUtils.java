package org.dev.jklabour.adminCommonLibs;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class LIWebDriverUtils {
	 
	 
 /*---------------------------------maximize window------------------*/ 
	  
	 public  void maximizeWindow()
	 {
		 AdminBaseClassLI1.driver.manage().window().maximize();
	 }
	 
 /*---------------------implicitly wait method ---------------------*/
	 
	 public void implicitlyWait( int time)
	    {
		 AdminBaseClassLI1.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	    }
	 
	 
  /*--------------------------explicitly wait method-----------------------------*/
	 
	 public  void explicitlyWait(long time,  String xpath )
	   
	    {
		  WebDriverWait wait=new WebDriverWait(AdminBaseClassLI1.driver, time);
		  wait.until
		  (ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	     }
	 
	
	 
  /*-------------------------select dropdown by using index----------------------*/
	
	 public static void dropdown(WebElement  webElement,int index)
	    {
		  Select sl= new Select(webElement);
		  sl.selectByIndex(index);
	    }
	 
	
  /*-----------------------select dropdown by using visible text--------------- */
	 
	 public static void  dropdownselect(WebElement we,String visibleText)
	   {
		  Select slv= new Select(we);
		  slv.selectByVisibleText(visibleText);
	   }
	 
  /*---------------------SELECT dropdown  option by using value --------------- */ 
      public static void dropdownSelectByValue(WebElement welement,String value )
      {
    	  Select sl1=new Select(welement);
    	  sl1.selectByValue(value);
      }
      
      
      
  /*----------------------create action class to select -----------------------*/
      public static void selectDropdownMenu(WebElement we)
         {
    	   Actions act=new Actions(AdminBaseClassLI1.driver);
    	   act.moveToElement(we).perform();
         }

	
      
      /*-----------------------new Tab Handeling method--------------------*/

         public static void newTab(){
   		Set<String> set=AdminBaseClassLI1.driver.getWindowHandles();
   		System.out.println(set.size());
   		
   		Iterator<String> iterator=set.iterator();
   		String perentId=iterator.next();
   		System.out.println(perentId);
   		String childId=iterator.next();
   		AdminBaseClassLI1.driver.switchTo().window(childId);
   		
          }
         
         
       /*----------------------new Iframe handling---------------------- */
         
         
       /*-----------------------calander Handling------------------------*/
         
       
         
      
 }
