package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.dev.jklabour.commonLibS.TestNGListerner.class)
public class DataProviderFactoryRenewTest extends  BaseClass1{
@Test(dataProvider="getData")	
 public void createFactoryRenewTest(Object name,Object add ,Object city ,Object pin ,Object design ,Object per,
			Object m, Object f)
		throws EncryptedDocumentException, Throwable
     { 
	
	   FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();
	   
	     FactoryRenewal flc=PageFactory.initElements(driver,FactoryRenewal.class);
	     flc.renewalFactory();;
	     
	 	driver.findElement(By.xpath("//button[@type='submit']")).click();	
		  
		   
		WebElement oldId=driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);
		
		driver.findElement(By.name("registration_number")).sendKeys("23622519");
		
		driver.findElement(By.id("btn-online-reg")).click();
		
/*--------------------------form  start-------------------------------*/	     
	    
		
	   FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "factory");
	    
	    WebElement ele =driver.findElement(By.xpath("//input[@name='factory_name']"));
	    WebDriverUtils1.selectDataByjs(driver, ele, name); 
	    
	    WebElement ele1 = driver.findElement(By.xpath("//input[@name='factory_address_1']"));
	    WebDriverUtils1.selectDataByjs(driver, ele1 ,add);
	    		
	    WebElement ele2 = driver.findElement(By.xpath("//input[@name='factory_address_2']"));
	    WebDriverUtils1.selectDataByjs(driver, ele2 ,add);

	    WebElement ele3 =driver.findElement(By.xpath("//input[@name='factory_address_city']"));
	    WebDriverUtils1.selectDataByjs(driver, ele3 ,city);
	     
	    WebElement dist=driver.findElement(By.xpath("//select[@name='factory_address_district_id']"));
	    WebDriverUtils1.dropdownselect(dist, "Kathua");
	     
	     
	    WebElement circle=driver.findElement(By.xpath("//select[@name='factory_address_circle_id']"));
	    WebDriverUtils1.dropdownSelectByValue(circle, "1");
	     
	   
	    WebElement ele4 =driver.findElement(By.xpath("//input[@name='factory_address_pincode']"));
	    WebDriverUtils1.selectDataByjs(driver, ele4 ,pin);
	     
	     
	     
	     /*------------------------3.  ------------------------*/
	     
	     
	    WebElement ele5 =driver.findElement(By.xpath("//input[@name='factory_situation_province']"));
	    WebDriverUtils1.selectDataByjs(driver, ele5 ,name);
	   
	     
	     
	    WebElement  pdist=driver.findElement(By.xpath("//select[@name='factory_situation_district_id']"));
	    WebDriverUtils1.dropdown(pdist, 2);
	     
	    WebElement ele6 =driver.findElement(By.xpath("//input[@name='factory_situation_town']"));
	    WebDriverUtils1.selectDataByjs(driver, ele6 ,add);
	    
	     
	    WebElement ele7 =driver.findElement(By.xpath("//input[@name='factory_situation_railway_station']"));
	    WebDriverUtils1.selectDataByjs(driver, ele7 ,add);
	    
	    WebElement ele8 = driver.findElement(By.xpath("//input[@name='factory_situation_nearer_ghat']"));
	    WebDriverUtils1.selectDataByjs(driver, ele8 ,add);
	    
	     
	     /*--------------------4.  communication address-------------------*/
	     
	    WebElement ele9 =driver.findElement(By.xpath("//input[@name='communication_address_1']"));
	    WebDriverUtils1.selectDataByjs(driver, ele9 ,add);
	  
	    WebElement ele10 =  driver.findElement(By.xpath("//input[@name='communication_address_city']"));
	    WebDriverUtils1.selectDataByjs(driver, ele10 ,add);   
	     
	     
	     WebElement cdist= driver.findElement(By.xpath("//select[@name='communication_address_district_id']"));
	     WebDriverUtils1.dropdown(cdist, 4);
	     
	     WebElement ele11= driver.findElement(By.xpath("//input[@name='communication_address_pincode']"));
	     WebDriverUtils1.selectDataByjs(driver, ele11 ,pin);
	     
	     
	     /*-----------------------5.  -------------------------*/
	     
	     WebElement ele12= driver.findElement(By.xpath("//textarea[@name='detail_last_12_months']"));
	     WebDriverUtils1.selectDataByjs(driver, ele12 ,add);
	     
	     WebElement ele13= driver.findElement(By.xpath("//textarea[@name='detail_next_12_months']"));
	     WebDriverUtils1.selectDataByjs(driver, ele13 ,add);
	     
	  
/*---------------6. Names and value of products to be manufactured ----------*/
	     String productstype=fl.getStringExcelData(2,19);
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
	       
	     
	     WebElement ele14=driver.findElement(By.xpath("//input [@name='no_of_workers']"));
	     WebDriverUtils1.selectDataByjs(driver, ele14 ,m);
	      
	     WebElement ele15=  driver.findElement(By.xpath("//input [@name='max_no_of_workers']"));
	     WebDriverUtils1.selectDataByjs(driver, ele15 ,f); 
	     
	     WebElement ele16= driver.findElement(By.xpath("//input [@name='total_amount_of_power']"));
	     WebDriverUtils1.selectDataByjs(driver, ele16 ,f);
	     
	     WebElement ele17=driver.findElement(By.xpath("//input [@name='max_amount_of_power']"));
	     WebDriverUtils1.selectDataByjs(driver, ele17 ,m);
	      
	     WebElement ele18=driver.findElement(By.xpath("//input[@name='manager_name']"));
	     WebDriverUtils1.selectDataByjs(driver, ele18 ,name);
	      
	     WebElement ele19=driver.findElement(By.xpath("//input[@name='manager_address_1']"));
	     WebDriverUtils1.selectDataByjs(driver, ele19 ,add);
	      
	     WebElement ele20=driver.findElement(By.xpath("//input[@name='manager_address_city']"));
	     WebDriverUtils1.selectDataByjs(driver, ele20 ,city);
	      
	      
	     WebElement mdist=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));	  
	      WebDriverUtils1.dropdown(mdist, 2);
	     
	     WebElement ele21= driver.findElement(By.xpath("//input[@name='manager_address_pincode']"));
	     WebDriverUtils1.selectDataByjs(driver, ele21 ,pin); 
	      
	      
	/*--------------1. name and residential address of the occupier---------*/      
	      
	    
	    WebElement ele22=driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"));
	    WebDriverUtils1.selectDataByjs(driver, ele22 ,name); 
	      
	     
	    WebElement ele23=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/input[@name='occupiers_name_address_address[]']"));
	    WebDriverUtils1.selectDataByjs(driver, ele23 ,add);
	      
	      
	      
 /*--------------2. name and residential address of the occupier---------*/
	      
	      
	     WebElement ele24=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele24 ,name);
	     
	     WebElement ele25=driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div/input[@name='occupiers_name_address_address[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele25,add);
	      
 /*--------------3. name and residential address of the occupier---------*/
	      
	
	     WebElement ele26=driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[@name='occupiers_name_address_full_name[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele26 ,name);
	      
	     WebElement ele27=driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[@name='occupiers_name_address_address[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele27 ,add);
	      
 /*--------------4. name and residential address of the occupier---------*/
	      
	      
	     WebElement ele28=driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[@name='occupiers_name_address_full_name[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele28 ,name); 	      
	      
	     WebElement ele29=driver.findElement(By.xpath("//tbody/tr[4]/td[2]/input[@name='occupiers_name_address_address[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele29 ,add);
	      
 /*--------------5. name and residential address of the occupier---------*/
	      
	      
	     WebElement ele30=driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[@name='occupiers_name_address_full_name[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele30 ,name); 
	      
	    
	     WebElement ele31=driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[@name='occupiers_name_address_address[]']"));
	     WebDriverUtils1.selectDataByjs(driver, ele31 ,add); 
	      
 
 /*------------------------13. Full name and address of the owner ----------------------*/      
	      
	      
	     WebElement ele32= driver.findElement(By.xpath(" //input[@name='owner_name']"));
	     WebDriverUtils1.selectDataByjs(driver, ele32 ,name);	      
	    
	     WebElement ele33= driver.findElement(By.xpath("//input[@name='owner_address_1']"));
	     WebDriverUtils1.selectDataByjs(driver, ele33 ,add);
	      
	      
	     WebElement ele34= driver.findElement(By.xpath("//input[@name='owner_address_city']"));
	     WebDriverUtils1.selectDataByjs(driver, ele34 ,city);
	      
	     WebElement wdist=driver.findElement(By.xpath("//select[@name='owner_address_district_id']"));
	     WebDriverUtils1.dropdown(wdist, 20);
	      

	     WebElement ele35=driver.findElement(By.xpath("//input[@name='owner_address_pincode']"));
	     WebDriverUtils1.selectDataByjs(driver, ele35 ,pin);
	/*-----------------------14. Whether constructed or extended -------------------*/
	     
	      /*****
	               *       radio button        * 
	                                               *****/
	      
	      String data =fl.getStringExcelData(2,42);
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
	      
	      
	      
	    driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_plans']"))
		   .sendKeys("ftysgvdhjkldfus#$%^&*(3456789");
	    
	      
	
   	     WebElement element1= driver.findElement(By.xpath("//input[@name='already_date_of_approval_of_plans']"));
   	     String dateVal1="2018-12-27";
   	     WebDriverUtils1.selectDateByjs(driver, element1, dateVal1);
   	  
	     
	 driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements']"))
		   .sendKeys("ftysgvdhjkldfus#$%^&*(3456789");
	      
		     
     	 WebElement element=driver.findElement(By.xpath("//input[@name='already_date_of_approval_of_arrangements']"));
     	 String dateVal="2018-12-27";
     	 WebDriverUtils1.selectDateByjs(driver, element, dateVal);
     	  
	   driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements'][contains(@placeholder,'Name of the authority')]"))
	   .sendKeys("ftysgvdhjkldfus#$%^&*(3456789");
	    
	    /*------------------------15.  Industry Category--------------------*/  
	             
	      	           
	                         /*   radio button choose   */
	      
	      
	      String catagoryData =fl.getStringExcelData(2,42);
		     System.out.println("\n" +catagoryData);
		      
		        if (expdata.contains(catagoryData))
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
		        
		        
		        String iData =fl.getStringExcelData(2,49);
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
			        String fData =fl.getStringExcelData(2,49);
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
