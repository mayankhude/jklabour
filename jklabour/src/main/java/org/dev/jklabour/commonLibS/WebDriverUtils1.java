package org.dev.jklabour.commonLibS;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class WebDriverUtils1 {
	 
	 
 /*---------------------------------maximize window------------------*/ 
	  
	 public static  void maximizeWindow()
	 {
		 BaseClass1.driver.manage().window().maximize();
	 }
	 
 /*---------------------implicitly wait method ---------------------*/
	 
	 public static void implicitlyWait( int time)
	    {
		 BaseClass1.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	    }
	 
	 
  /*--------------------------explicitly wait method-----------------------------*/
	 
	 public  void explicitlyWait(long time,  String xpath )
	   
	    {
		  WebDriverWait wait=new WebDriverWait(BaseClass1.driver, time);
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
	 
	 public static String  dropdownselect(WebElement we,String visibleText)
	   {
		  Select slv= new Select(we);
		  slv.selectByVisibleText(visibleText);
		  return visibleText;
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
    	   Actions act=new Actions(BaseClass1.driver);
    	   act.moveToElement(we).perform();
         }
      
      /*-----------------------new Tab Handeling method--------------------*/

         public void newTab(){
   		Set<String> set=BaseClass1.driver.getWindowHandles();
   		System.out.println(set.size());
   		
   		Iterator<String> iterator=set.iterator();
   		String perentId=iterator.next();
   		String childId=iterator.next();
   		BaseClass1.driver.switchTo().window(childId);
   		
          }
         
         
       /*----------------------new Iframe handling---------------------- */
         
         
       /*-----------------------calander Handling------------------------*/
         
       public static void selectDateByjs(WebDriver driver,WebElement element,String dateVal)
         {
    	    JavascriptExecutor js=((JavascriptExecutor) driver);
    	    
    	    js.executeScript("arguments[0].setAttribute('value','"+dateVal+"')",element);
           }
    
       public static void selectDataByjs(WebDriver driver,WebElement element,Object val)
       {
  	    JavascriptExecutor js=((JavascriptExecutor) driver);
  	    
  	    js.executeScript("arguments[0].setAttribute('value','"+val+"')",element);
         }
	
      
 }
