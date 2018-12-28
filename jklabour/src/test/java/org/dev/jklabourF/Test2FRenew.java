package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryRenewal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.dev.jklabour.commonLibS.TestNGListerner.class)
public class Test2FRenew extends  BaseClass1{
@Test	
 public void createFactoryRTest() throws EncryptedDocumentException, Throwable
     { 
	
	   FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();;
	     FactoryRenewal flc=PageFactory.initElements(driver,FactoryRenewal.class);
	     flc.renewalFactory();;
	     
	 	driver.findElement(By.xpath("//button[@type='submit']")).click();	
		  
		   
		WebElement oldId=driver.findElement(By.name("registration_approval_file"));
		WebDriverUtils1.dropdown(oldId, 4);
		
		driver.findElement(By.name("registration_number")).sendKeys("23622519");
		
		driver.findElement(By.id("btn-online-reg")).click();
		
	     
	    //String pPath=System.getProperty("user.dir");
	    FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "factory");
	    String fname= fl.getStringExcelData(2,0);
	    System.out.println(fname);
	     driver.findElement(By.xpath("//input[@name='factory_name']"))
	     .sendKeys(fname);
	     
	     String fadd=fl.getStringExcelData(2,1);
	     driver.findElement(By.xpath("//input[@name='factory_address_1']"))
	     .sendKeys(fadd);
	     
	     String fadd2=fl.getStringExcelData(2,2);
	     driver.findElement(By.xpath("//input[@name='factory_address_2']"))
	     .sendKeys(fadd2);
	     
	     String fcity=fl.getStringExcelData(2,3)
	    		 ;
	     driver.findElement(By.xpath("//input[@name='factory_address_city']"))
	     .sendKeys(fcity);
	     
	     WebElement dist=driver.findElement(By.xpath("//select[@name='factory_address_district_id']"));
	     WebDriverUtils1.dropdownselect(dist, "Kathua");
	     
	     
	     WebElement circle=driver.findElement(By.xpath("//select[@name='factory_address_circle_id']"));
	     WebDriverUtils1.dropdownSelectByValue(circle, "1");
	     
	     double pinc= fl.getIntExcelData(2, 6);
	     int p=(int) pinc;
	     
	     String d=String.valueOf(p);
	     driver.findElement(By.xpath("//input[@name='factory_address_pincode']"))
	     .sendKeys(d);
	     
	     
	     
	     /*------------------------3.  ------------------------*/
	     
	     String provi=fl.getStringExcelData(2,7);
	     driver.findElement(By.xpath("//input[@name='factory_situation_province']")).
	     sendKeys(provi);
	     
	     
	     WebElement  pdist=driver.findElement(By.xpath("//select[@name='factory_situation_district_id']"));
	     WebDriverUtils1.dropdown(pdist, 2);
	     
	     
	     String ptown=fl.getStringExcelData(2,9);
	     driver.findElement(By.xpath("//input[@name='factory_situation_town']")).
	     sendKeys(ptown);
	     
	     String pstation=fl.getStringExcelData(2, 10);
	     driver.findElement(By.xpath("//input[@name='factory_situation_railway_station']")).
	     sendKeys(pstation);
	     
	      
	     String pghat=fl.getStringExcelData(2,11);
	     driver.findElement(By.xpath("//input[@name='factory_situation_nearer_ghat']"))
	     .sendKeys(pghat);
	     
	     
	     /*--------------------4.  communication address-------------------*/
	     
	     String cadd=fl.getStringExcelData(2,12);
	     driver.findElement(By.xpath("//input[@name='communication_address_1']"))
	     .sendKeys(cadd);
	     
	     
	     
	     String cCity=fl.getStringExcelData(2,14);
	     driver.findElement(By.xpath("//input[@name='communication_address_city']"))
	     .sendKeys(cCity);
	     
	     
	     WebElement cdist= driver.findElement(By.xpath("//select[@name='communication_address_district_id']"));
	    		 WebDriverUtils1.dropdown(cdist, 4);
	     
	     
	    
	     String spin=fl.convertDoubleToString( fl.getIntExcelData(2,16));
	     
	     driver.findElement(By.xpath("//input[@name='communication_address_pincode']"))
	     .sendKeys(spin);
	     
	     
	     
	     /*-----------------------5.  -------------------------*/
	     
	     
	     
	     String lastMonth=fl.getStringExcelData(2,17);
	     driver.findElement(By.xpath("//textarea[@name='detail_last_12_months']"))
	     .sendKeys(lastMonth);
	     
	   
	     String nextMonth= fl.getStringExcelData(2, 18);
	  driver.findElement(By.xpath("//textarea[@name='detail_next_12_months']"))
	  .sendKeys(nextMonth);
	     
	
	      
	      
	/*--------------1. name and residential address of the occupier---------*/      
	      
	      String rname=fl.getStringExcelData(2, 34);
	      driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"))
	      .sendKeys(rname);
	      
	      String radd=fl.getStringExcelData(2, 35);
	      driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div/input[@name='occupiers_name_address_address[]']"))
	      .sendKeys(radd);;
	      
	      
	      
 /*--------------2. name and residential address of the occupier---------*/
	      
	      String rname2=fl.getStringExcelData(2, 34);
	      driver.findElement(By.xpath("//tbody/tr[2]/td[1]/div/input[1][@name='occupiers_name_address_full_name[]']"))
	      .sendKeys(rname2);
	      
	      String radd2=fl.getStringExcelData(2, 35);
	      driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div/input[@name='occupiers_name_address_address[]']"))
	      .sendKeys(radd2);;
	      
 
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
	      
	      WebDriverUtils1.dropdown(we, 2);
	     
	      
	      /*----------------18.  --------------------------*/
	      

	      
	      
		    WebElement we1=  driver.findElement(By.xpath("//select[@name='noc_license_id']"));
		      
		      WebDriverUtils1.dropdown(we1, 2);
		     
		      
	      
	      /*----------------19.  --------------------------*/
	      		      
		      
			    WebElement wmgr=  driver.findElement(By.xpath("//select[@name='manager_letter_id']"));
			      
			      WebDriverUtils1.dropdown(wmgr, 2);
			     
			      
	      /*----------------20.  --------------------------*/

			      
				    WebElement wpower=  driver.findElement(By.xpath("//select[@name='power_sanction_id']"));
				      
				      WebDriverUtils1.dropdown(wpower, 2);
				     
				      
	      /*----------------21.  --------------------------*/

				      
				      
		  WebElement wsafty=  driver.findElement(By.xpath("//select[@name='safety_certificate_id']"));
					      
	      WebDriverUtils1.dropdown(wsafty, 2);
	      
					     
				
	      /*----------------22.  --------------------------*/

	      
	      
		    WebElement wpass=  driver.findElement(By.xpath("//select[@name='passport_doc_id']"));
		      
		      WebDriverUtils1.dropdown(wpass, 2);
		     
		      
	      /*----------------23.  --------------------------*/

		      
		      
			    WebElement wsupport=  driver.findElement(By.xpath("//select[@name='support_doc1_id']"));
			      
			      WebDriverUtils1.dropdown(wsupport, 2);
			     
			      
	      /*----------------24.  --------------------------*/

			      
			      
		 WebElement wpen=  driver.findElement(By.xpath("//select[@name='support_doc2_id']"));
				      
	     WebDriverUtils1.dropdown(wpen, 2);
	     
	     
	     driver.findElement(By.id("submit-btn")).submit();
	     
	     
	     FactoryAct1 fa1=PageFactory.initElements(driver,FactoryAct1.class);
		   fa1.factoryAct();;
		     FactoryRenewal flc1=PageFactory.initElements(driver,FactoryRenewal.class);
		     flc1.renewalFactory();;
		     
		 	driver.findElement(By.xpath("//button[@type='submit']")).click();	
			  
			   
	     
	    
	 
     }

}
