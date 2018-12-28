package org.dev.jklabourF;

import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryLicenceGrant;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.dev.jklabour.commonLibS.TestNGListerner.class)
public class DataProviderFactoryLicenceTest extends  BaseClass1{
	
	@Test(dataProvider="getData")
	public void  dataTest(Object name,Object add ,Object city ,Object pin ,Object design ,Object per,
				Object m, Object f) throws Throwable   { 
	
	   FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();
	     FactoryLicenceGrant flc=PageFactory.initElements(driver,FactoryLicenceGrant.class);
	     flc.fLicenceGrant();
	     
	  driver.findElement(By.xpath("//button[text()='Continue']")).click(); ;
	     
	     
	WebElement ele1=   driver.findElement(By.xpath("//input[@name='factory_name']"));
		WebDriverUtils1.selectDataByjs(driver, ele1, name);
	     
	     
		WebElement ele2=     driver.findElement(By.xpath("//input[@name='factory_address_1']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele2, add);
	     
	   
	 	WebElement ele3 = driver.findElement(By.xpath("//input[@name='factory_address_2']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele3, add);
	     
	     
	    		
	 	WebElement ele4 = driver.findElement(By.xpath("//input[@name='factory_address_city']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele4, city);
	     
	     WebElement dist=driver.findElement(By.xpath("//select[@name='factory_address_district_id']"));
	     String  dist1=  WebDriverUtils1.dropdownselect(dist, "Kathua");
	   
	     
	     WebElement circle=driver.findElement(By.xpath("//select[@name='factory_address_circle_id']"));
	     WebDriverUtils1.dropdownSelectByValue(circle, "2");
	     
	  
	     
	   
	     WebElement ele5 =   driver.findElement(By.xpath("//input[@name='factory_address_pincode']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele5, pin);
	     
	     
	     
	     /*------------------------3.  ------------------------*/
	     
	     
	     WebElement ele6 =  driver.findElement(By.xpath("//input[@name='factory_situation_province']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele6, name);
	     
	     WebElement  pdist=driver.findElement(By.xpath("//select[@name='factory_situation_district_id']"));
	     WebDriverUtils1.dropdown(pdist, 2);
	     
	     
	    
	     WebElement ele7 =  driver.findElement(By.xpath("//input[@name='factory_situation_town']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele7, add);
	     
	    
	     WebElement ele8 = driver.findElement(By.xpath("//input[@name='factory_situation_railway_station']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele8, add);
	     
	      
	  
	     WebElement ele9 = driver.findElement(By.xpath("//input[@name='factory_situation_nearer_ghat']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele9, add);
	     
	     /*--------------------4.  communication address-------------------*/
	     
	   
	     WebElement ele10 = driver.findElement(By.xpath("//input[@name='communication_address_1']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele10, add);
	     
	     
	 	 WebElement ele11 = driver.findElement(By.xpath("//input[@name='communication_address_2']"));
		 	WebDriverUtils1.selectDataByjs(driver, ele11, add);
		     
		     
	    
	     WebElement ele12 = driver.findElement(By.xpath("//input[@name='communication_address_city']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele12, city);
	     
	     
	     WebElement cdist= driver.findElement(By.xpath("//select[@name='communication_address_district_id']"));
	    		 WebDriverUtils1.dropdown(cdist, 4);
	     
	     
	    
	   
	    WebElement ele13 =    driver.findElement(By.xpath("//input[@name='communication_address_pincode']"));
	 	WebDriverUtils1.selectDataByjs(driver, ele13, pin);
	     
	     
	     /*-----------------------5.  -------------------------*/
	     
	     
	     
	    
	     driver.findElement(By.xpath("//textarea[@name='detail_last_12_months']"))
	     .sendKeys("guhlfkejfdaysujk@#$%^&*Edtfghj345678");
	     
	   
	    
	  driver.findElement(By.xpath("//textarea[@name='detail_next_12_months']"))
	  .sendKeys("estrdyujweuiyd2#$%^&*(gdhjhg345678");
	     
	  
/*---------------6. Names and value of products to be manufactured ----------*/
	     String productstype="Service";
	     System.out.println("\n"+productstype);
	       String expproduct="Manufacturing";
	        if (expproduct.contains(productstype))
	         {
	    	  driver.findElement(By.xpath("//input[@value='manufacturing']")).click(); 
	        }
	       
	        else
	           {
	        	driver.findElement(By.xpath("//input[@value='service']")).click();
	           }
	       Thread.sleep(4000);
	     
	       
	        WebElement  nic2=driver.findElement(By.id("nic-2"));
	        Select sel= new Select(nic2);
	        java.util.List<WebElement> lst=sel.getOptions();
	        
	        int size=lst.size();
	        int leg=size;
	        
	        System.out.println(" size of nic-2 list is ---> "+lst.size());
	       
	        for(WebElement we:lst)
	        {
	        	System.out.println(we.getText());
	        }
	        
	        if(size<=2)
	        {
	        WebDriverUtils1.dropdown(nic2, 1);
	     Thread.sleep(5000);
	        }
	        
	        else if(size>2)
	        {
	        	    if (size>=6)
	        		 {
	        		 WebDriverUtils1.dropdown(nic2, 5);
		    	     Thread.sleep(5000);	
		        	 }
	        		 else{ WebDriverUtils1.dropdown(nic2, size-1);
		    	     Thread.sleep(5000); 
	        	        }	 	
	        }
/*--------------------------nic-4  size----------------------------------*/	     
	        WebElement nic4 =driver.findElement(By.id("nic-4"));
	        
	        Select sl=new Select(nic4);
	        java.util.List<WebElement> list=sl.getOptions();
	 
	        int nic4Size=list.size();
	        System.out.println("size of nic-4  list  is ===> " +list.size());
	        
	        for(WebElement we:list)
	            {System.out.println(we.getText());}
	        
	        /*--------------------------nic-4  selection----------------------------------*/	        
	        if(nic4Size<=2)
	        {  
	           WebDriverUtils1.dropdown(nic4, 1);
	           Thread.sleep(5000);
	          }
	        else if(nic4Size>2)
	           {
	        	if (nic4Size>=6)
       		 {
       		 WebDriverUtils1.dropdown(nic4, 5);
	    	     Thread.sleep(5000);	
	        	 }
       		 else{ WebDriverUtils1.dropdown(nic4, nic4Size-1);
	    	     Thread.sleep(5000); 
       	        }	 	
	           }
	        
	        
	        
	 /*--------------------------nic-5  size----------------------------------*/	     
	        WebElement nic5 =driver.findElement(By.id("nic-5"));
	        
	        Select sl5=new Select(nic5);
	        java.util.List<WebElement> list5=sl5.getOptions();
	 
	        int nic5Size=list5.size();
	        System.out.println("size of nic-5 list is ====> " +list5.size());
	        
	        for(WebElement we:list5)
	            {System.out.println(we.getText());}
	        
	        /*--------------------------nic-5  selection----------------------------------*/	        
	        if(nic5Size<=2)
	        {  
	           WebDriverUtils1.dropdown(nic5, 1);
	           Thread.sleep(5000);
	          }
	        else if(nic5Size>2)
	           {
	        	if (nic5Size>=6)
       		 {
       		 WebDriverUtils1.dropdown(nic4, 5);
	    	     Thread.sleep(5000);	
	        	 }
       		 else{ WebDriverUtils1.dropdown(nic4, nic5Size-1);
	    	     Thread.sleep(5000); 
       	        }	 	
	           }
	        
	/*------------------------------add nic------------------------------*/
	        driver.findElement(By.id("add-nic")).click();
	        Thread.sleep(1000);
	        /* 
	        driver.findElement(By.className("delete-nic")).click(); 
	        */
	        
 /*---------------------------no of worker---------------------------*/
	        
	      
	     
	        WebElement ele14 =  driver.findElement(By.xpath("//input [@name='no_of_workers']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele14, m);
		     
	      
	      
	     
	        WebElement ele15 =  driver.findElement(By.xpath("//input [@name='max_no_of_workers']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele15, f);
		     
	     
	      
	     
	        WebElement ele16 =  driver.findElement(By.xpath("//input [@name='total_amount_of_power']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele16, m);
		     
	      
	     
	        WebElement ele17 = driver.findElement(By.xpath("//input [@name='max_amount_of_power']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele17, f);
		     
	      
	      
	      
	  
	        WebElement ele18 = driver.findElement(By.xpath("//input[@name='manager_name']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele18, name);
		     
	      
	      
	        WebElement ele19 =  driver.findElement(By.xpath("//input[@name='manager_address_1']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele19, add);
		     
	      
	    
        WebElement ele20 =  driver.findElement(By.xpath("//input[@name='manager_address_2']"));
  	WebDriverUtils1.selectDataByjs(driver, ele20, add);
	     
      
      
	   
	        WebElement ele21 =  driver.findElement(By.xpath("//input[@name='manager_address_city']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele21, city);
		     
	      
	      
	      WebElement mdist=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"))
	    		  ;
	      WebDriverUtils1.dropdown(mdist, 2);
	      
	      
	   
	      WebElement ele22 =  driver.findElement(By.xpath("//input[@name='manager_address_pincode']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele22, pin);
		     
	      
	      
	/*--------------1. name and residential address of the occupier---------*/      
	      
	     
	      WebElement ele23 =    driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele23, name);
		     
	      
	      WebElement ele24 =  driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/input[@name='occupiers_name_address_address[]']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele24, add);
		     
	      
	      
	      
 /*--------------2. name and residential address of the occupier---------*/
	      
	      
	      WebElement ele25 =   driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele25, name);
		     
	      
	   
	      WebElement ele26 =  driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele26, add);
		     
	      
 /*--------------3. name and residential address of the occupier---------*/
	      
	      
	      WebElement ele27 = driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[1]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele27, name);
		     
	      
	    
	      WebElement ele28 =   driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[2]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele28, add);
		     
	      
 /*--------------4. name and residential address of the occupier---------*/
	      
	     
	      WebElement ele29 =   driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[1]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele29, name);
		     
	      
	     
	      WebElement ele30 =  driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[2]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele30, add);
		     
	      
 /*--------------5. name and residential address of the occupier---------*/
	      
	    
	      WebElement ele31 =    driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[1]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele31, name);
		     
	      
	     
	      WebElement ele32 =  driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[2]/div/input"));
	  	WebDriverUtils1.selectDataByjs(driver, ele32, add);
		     
 
 /*------------------------13. Full name and address of the owner ----------------------*/      
	      
	      
	      WebElement ele33 =   driver.findElement(By.xpath(" //input[@name='owner_name']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele33, name);
		     
	      
	     
	      WebElement ele34 = driver.findElement(By.xpath("//input[@name='owner_address_1']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele34, add);
		     
	      WebElement ele35 = driver.findElement(By.xpath("//input[@name='owner_address_2']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele35, add);
		     
	       
	     
	      WebElement ele36 =  driver.findElement(By.xpath("//input[@name='owner_address_city']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele36, city);
		     
	      
	      WebElement wdist=driver.findElement(By.xpath("//select[@name='owner_address_district_id']"));
	      WebDriverUtils1.dropdown(wdist, 20);
	      
	   
	    
	      WebElement ele37 =   driver.findElement(By.xpath("//input[@name='owner_address_pincode']"));
	  	WebDriverUtils1.selectDataByjs(driver, ele37, pin);
		     
	/*-----------------------14. Whether constructed or extended -------------------*/
	     
	      /*****
	               *       radio button        * 
	                                               *****/
	      
	      String data ="Constructed";
		     System.out.println("\n "+data);
		       String expdata="Constructed";
		        if (expdata.contains(data))
		         {
		    	  driver.findElement(By.xpath("//input[@value='Constructed']")).click(); 
		        }
		       
		        else
		           {
		        	driver.findElement(By.xpath("//input[@value='Extended']")).click();
		           }
	      
	      
	      
	 
		        WebElement ele38 =    driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_plans']"));
		        		WebDriverUtils1.selectDataByjs(driver, ele38, f);
	    
	
	     
	  
		        WebElement ele39 =   driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements']"));
		        		WebDriverUtils1.selectDataByjs(driver, ele39, m);
	      
	      

	      
		        		WebElement ele40 =    driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements'][contains(@placeholder,'Name of the authority')]"));
	    
		        				WebDriverUtils1.selectDataByjs(driver, ele40, f);
	    
	    /*------------------------15.  Industry Category--------------------*/  
	             
	      	           
	                         /*   radio button choose   */
	      
	      
	      String catagoryData ="Fertilizers";
		     System.out.println("\n" +catagoryData);
		       String expdata1="Fertilizers";
		        if (expdata1.contains(catagoryData))
		         {
		    	  driver.findElement(By.xpath("//input[@value='1'][@name='industry_category']")).click(); 
		        }
		       
		        else if("Solvent extraction plants".contains(catagoryData))
		           {
		        	driver.findElement(By.xpath("//input[@value='2'][@name='industry_category']")).click();
		           }
		        
		        else if("Electroplating,".contains(catagoryData))
		           {
		        	driver.findElement(By.xpath("//input[@value='3'][@name='industry_category']")).click();
		           }
		        else if("Copper and Steel".contains(catagoryData))
		           {
		        	driver.findElement(By.xpath("//input[@value='4'][@name='industry_category']")).click();
		           }
		        else if("Electonic Goods".contains(catagoryData))
		           {
		        	driver.findElement(By.xpath("//input[@value='5'][@name='industry_category']")).click();
		           }
		        else 
		           {
		        	driver.findElement(By.xpath("//input[@value='6'][@name='industry_category']")).click();
		           }
	      
	      
	      
	    /*------------------------16. Type of Industry*-------------------*/
		        
		        
		        String iData ="white";
			     System.out.println("\n Type of Industry==> "+ iData);
			       String Iexpdata="white";
			        if (Iexpdata.contains(iData))
			         {
			    	  driver.findElement(By.xpath("//input[@name='industry_type'][@value='white']")).click(); 
			        }
			       
			        else if("green".contains(iData))
			           {
			        	driver.findElement(By.xpath("//input[@name='industry_type'][@value='green']")).click(); 
			           }
			        
			        else if("orange".contains(iData))
			           {
			        	driver.findElement(By.xpath("//input[@name='industry_type'][@value='orange']")).click(); 
			           }
			        
			        else 
			           {
			        	driver.findElement(By.xpath("//input[@name='industry_type'][@value='red']")).click(); 
			           }
		      
		        
			        
 /*----------------------16 (1). Factory Registration Period*---------------*/
			       
		 try{
			        String fData ="2 Year";
				     System.out.println("\n Factory Registration Period* ==> "+fData+" \n");
				      
				        if ("1 Year".contains(fData))
				         {
				    	  driver.findElement(By.xpath("//input[@name='registration_period'][@value='1']")).click(); 
				        }
				       
				        else if("2 Year".contains(fData))
				           {
				        	driver.findElement(By.xpath("//input[@name='registration_period'][@value='2']")).click(); 
				           }
				        
				        else 
				           {
				        	driver.findElement(By.xpath("//input[@name='registration_period'][@value='3']")).click(); 
				           }
		 }catch (Exception e) {
			// TODO: handle exception
		}
			        
			      
			        
			        
			        
	      /*----------------17.  --------------------------*/
	      
	      
		 
	      WebElement we=  driver.findElement(By.xpath("//select[@name='consent_certificate_id']"));
	      WebDriverUtils1.dropdown(we, 3);
	     
	      
	      /*----------------18.  --------------------------*/
	      
		   WebElement we1=  driver.findElement(By.xpath("//select[@name='noc_license_id']"));
		   WebDriverUtils1.dropdown(we1, 6);
		     
		      
	      
	      /*----------------19.  --------------------------*/
	      		      
		   WebElement wmgr=  driver.findElement(By.xpath("//select[@name='manager_letter_id']"));
		   WebDriverUtils1.dropdown(wmgr, 4);
			     
			      
	     /*----------------20.  --------------------------*/

		   WebElement wpower=  driver.findElement(By.xpath("//select[@name='power_sanction_id']"));
		   WebDriverUtils1.dropdown(wpower,3);
				     
				      
	   /*----------------21.  --------------------------*/
	      
		  WebElement wsafty=  driver.findElement(By.xpath("//select[@name='safety_certificate_id']"));
		  WebDriverUtils1.dropdown(wsafty, 6);
	      
					     
				
	  /*----------------22.  --------------------------*/

		  WebElement wpass=  driver.findElement(By.xpath("//select[@name='passport_doc_id']"));
		  WebDriverUtils1.dropdown(wpass,5);
		     
		      
	/*----------------23.  --------------------------*/

		  WebElement wsupport=  driver.findElement(By.xpath("//select[@name='support_doc1_id']"));
		  WebDriverUtils1.dropdown(wsupport, 3);
			     
   /*----------------24.  --------------------------*/

		  WebElement wpen=  driver.findElement(By.xpath("//select[@name='support_doc2_id']"));
		  WebDriverUtils1.dropdown(wpen, 4);
	     
/*---------------------------- form complete --------------------------*/	  
	       Thread.sleep(20000);
		  driver.findElement(By.id("submit-btn")).submit();
		  Thread.sleep(60000);
	     
		 /*                                                             *
	      *                                                             *
	      * -------------------review detail--------------------------- */
	                 
	    // driver.findElement(By.linkText("Back")).click();
		
	     driver.findElement(By.xpath("//input[@value='Continue']")).click();
     }
@DataProvider
public  Object[][] getData()
{
	Object[][] data = FileSet.getTestData("./excel/data.xlsx", "Sheet2");
	
	return data;
}


}
