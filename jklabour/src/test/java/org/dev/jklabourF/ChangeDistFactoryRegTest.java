package org.dev.jklabourF;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.ObjectRepositoryA.FactoryRegistrationsMenu;
import org.dev.jklabour.ObjectRepositoryA.LIRevertBackApplicant;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.FileSet;
import org.dev.jklabour.commonLibS.FileUtiles;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.FactoryAct1;
import org.dev.jklabour.objectRepositorys.FactoryLicenceGrant;
import org.dev.jklabour.objectRepositorys.MakePayment;
import org.dev.jklabour.objectRepositorys.PostApplication;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChangeDistFactoryRegTest extends BaseClass1 {
	static int i = 2;

	@Test(priority=0)
	public void test1Createfactory() throws IOException, Throwable
	{ FactoryAct1 fa=PageFactory.initElements(driver,FactoryAct1.class);
	   fa.factoryAct();
	     FactoryLicenceGrant flc=PageFactory.initElements(driver,FactoryLicenceGrant.class);
	     flc.fLicenceGrant();
	     
	  driver.findElement(By.xpath("//button[text()='Continue']")).click(); ;
	     
	     
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
       WebDriverUtils1.dropdownSelectByValue(circle,"2" );
	     
	  
		   FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, "Jammu Circle 2");
	    
		   
		   
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
	     
	     
	     
	     driver.findElement(By.xpath("//textarea[@name='detail_last_12_months']"))
	     .sendKeys("estrycuvbinojk@#$%5678bkljhg");
	     
	   
	   
	  driver.findElement(By.xpath("//textarea[@name='detail_next_12_months']"))
	  .sendKeys("estrycuvbinojk@#$%5678bkljhg");
	     
	  
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
	        
	        double wd= fl.getIntExcelData(2, 24);
	        System.out.println("no. of worker ==> "+wd);
	      String worker=fl.convertDoubleToString(wd
	    		 );
	     
	      driver.findElement(By.xpath("//input [@name='no_of_workers']"))
	      .sendKeys(worker);
	      
	      
	     String maxworker=fl.convertDoubleToString(fl.getIntExcelData(2,25));
	      driver.findElement(By.xpath("//input [@name='max_no_of_workers']"))
	      .sendKeys(maxworker);
	     
	      
	      String power=fl.convertDoubleToString(fl.getIntExcelData(2,26));
	      driver.findElement(By.xpath("//input [@name='total_amount_of_power']"))
	      .sendKeys(power);
	      
	      String maxPower= fl.convertDoubleToString(fl.getIntExcelData(2, 27));
	      driver.findElement(By.xpath("//input [@name='max_amount_of_power']"))
	      .sendKeys(maxPower);
	      
	      
	      
	      String name=fl.getStringExcelData(2,28);
	      driver.findElement(By.xpath("//input[@name='manager_name']"))
	      .sendKeys(name);
	      
	      String madd=fl.getStringExcelData(2, 29);
	      driver.findElement(By.xpath("//input[@name='manager_address_1']"))
	      .sendKeys(madd);
	      
	      
	      String mcity=fl.getStringExcelData(2, 31);
	      driver.findElement(By.xpath("//input[@name='manager_address_city']"))
	      .sendKeys(mcity);
	      
	      
	      WebElement mdist=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"))
	    		  ;
	      WebDriverUtils1.dropdown(mdist, 2);
	      
	      
	      String mpin=fl.convertDoubleToString(fl.getIntExcelData(2, 33));
	      driver.findElement(By.xpath("//input[@name='manager_address_pincode']"))
	      .sendKeys(mpin);
	      
	      
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
	      
/*--------------3. name and residential address of the occupier---------*/
	      
	      String rname3=fl.getStringExcelData(2, 34);
	      driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[1]/div/input"))
	      .sendKeys(rname3);
	      
	      String radd3=fl.getStringExcelData(2, 35);
	      driver.findElement(By.xpath("//div[2]/table/tbody/tr[3]/td[2]/div/input"))
	      .sendKeys(radd3);;
	      
/*--------------4. name and residential address of the occupier---------*/
	      
	      String rname4=fl.getStringExcelData(2, 34);
	      driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[1]/div/input"))
	      .sendKeys(rname4);
	      
	      String radd4=fl.getStringExcelData(2, 35);
	      driver.findElement(By.xpath("//div[2]/table/tbody/tr[4]/td[2]/div/input"))
	      .sendKeys(radd4);;
	      
/*--------------5. name and residential address of the occupier---------*/
	      
	      String rname5=fl.getStringExcelData(2, 34);
	      driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[1]/div/input"))
	      .sendKeys(rname5);
	      
	      String radd5=fl.getStringExcelData(2, 35);
	      driver.findElement(By.xpath("//div[2]/table/tbody/tr[5]/td[2]/div/input"))
	      .sendKeys(radd5);;
	      

/*------------------------13. Full name and address of the owner ----------------------*/      
	      
	      String wname=fl.getStringExcelData(2, 36);
	      driver.findElement(By.xpath(" //input[@name='owner_name']"))
	      .sendKeys(wname);
	      
	      String wadd=fl.getStringExcelData(2, 37);
	      driver.findElement(By.xpath("//input[@name='owner_address_1']"))
	      .sendKeys(wadd);
	      
	      String wcity=fl.getStringExcelData(2, 39);
	      driver.findElement(By.xpath("//input[@name='owner_address_city']"))
	      .sendKeys(wcity);
	      
	      WebElement wdist=driver.findElement(By.xpath("//select[@name='owner_address_district_id']"));
	      WebDriverUtils1.dropdown(wdist, 20);
	      
	   
	      String wpin=fl.convertDoubleToString(fl.getIntExcelData(2, 41));
	      driver.findElement(By.xpath("//input[@name='owner_address_pincode']"))
	      .sendKeys(wpin);
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
	      
	      
	      
	    String rf=fl.getStringExcelData(2, 43);
	    driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_plans']"))
	    .sendKeys(rf);
	    
	      
	 /*     String  date=fl.getStringExcelData(2,44);
	      driver.findElement(By.xpath("//input[@name='already_date_of_approval_of_plans']"))
	      .sendKeys(data);
	      
	      */
	     
	     String noFAprove= fl.convertDoubleToString(fl.getIntExcelData(2, 45));
	      driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements']"))
	      .sendKeys(noFAprove);
	      
	      
	/*      String  arrengeDate=fl.getStringExcelData(2,46);
	      driver.findElement(By.xpath("//input[@name='already_date_of_approval_of_arrangements']"))
	      .sendKeys(arrengeDate); */
	      
	      String  arrenge=fl.getStringExcelData(2,47);
	      driver.findElement(By.xpath("//input[@name='already_no_of_approval_of_arrangements'][contains(@placeholder,'Name of the authority')]"))
	      .sendKeys(arrenge);
	      
	    
	    /*------------------------15.  Industry Category--------------------*/  
	             
	      	           
	                         /*   radio button choose   */
	      
	      
	      String catagoryData =fl.getStringExcelData(2,42);
		     System.out.println("\n" +catagoryData);
		       
		        if ("Fertilizers".contains(catagoryData))
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
	      
	      WebDriverUtils1.dropdown(we, 2);
	     
	      
	      /*----------------18.  --------------------------*/
	      

	      
	      
		    WebElement we1=  driver.findElement(By.xpath("//select[@name='noc_license_id']"));
		      
		      WebDriverUtils1.dropdown(we1, 4);
		     
		      
	      
	      /*----------------19.  --------------------------*/
	      		      
		      
			    WebElement wmgr=  driver.findElement(By.xpath("//select[@name='manager_letter_id']"));
			      
			      WebDriverUtils1.dropdown(wmgr, 3);
			     
			      
	      /*----------------20.  --------------------------*/

			      
				    WebElement wpower=  driver.findElement(By.xpath("//select[@name='power_sanction_id']"));
				      
				      WebDriverUtils1.dropdown(wpower, 2);
				     
				      
	      /*----------------21.  --------------------------*/

				      
				      
		  WebElement wsafty=  driver.findElement(By.xpath("//select[@name='safety_certificate_id']"));
					      
	      WebDriverUtils1.dropdown(wsafty, 3);
	      
					     
				
	      /*----------------22.  --------------------------*/

	      
	      
		    WebElement wpass=  driver.findElement(By.xpath("//select[@name='passport_doc_id']"));
		      
		      WebDriverUtils1.dropdown(wpass, 4);
		     
		      
	      /*----------------23.  --------------------------*/

		      
		      
			    WebElement wsupport=  driver.findElement(By.xpath("//select[@name='support_doc1_id']"));
			      
			      WebDriverUtils1.dropdown(wsupport, 5);
			     
			      
	      /*----------------24.  --------------------------*/

			      
			      
		 WebElement wpen=  driver.findElement(By.xpath("//select[@name='support_doc2_id']"));
				      
	     WebDriverUtils1.dropdown(wpen, 6);
	     
	     
	     
	  WebElement fd  =  driver.findElement(By.name("form1_doc_id"));
	  WebDriverUtils1.dropdown(fd,7 );
	     
	     
	  WebElement ci =  driver.findElement(By.name("form_combined_id"));
	  WebDriverUtils1.dropdown(ci,4 );
	   
	  WebElement rd =  driver.findElement(By.name("rent_deed_id"));
	  WebDriverUtils1.dropdown( rd,7);
	   
	  WebElement df =  driver.findElement(By.name("dic_form_id"));
	  WebDriverUtils1.dropdown( df,3);
	   
	  WebElement ml  =  driver.findElement(By.name("machinery_list_id"));
	  WebDriverUtils1.dropdown(ml,2 );
	   
	  WebElement mp =  driver.findElement(By.name("manufacturing_process_id"));
	  WebDriverUtils1.dropdown(mp,7 );
	   
	  WebElement pr =  driver.findElement(By.name("project_report_id"));
	  WebDriverUtils1.dropdown(pr,3 );
	   
	  WebElement sp =  driver.findElement(By.name("site_plan_id"));
	  WebDriverUtils1.dropdown(sp,5 );
	  
	  WebElement rfi =  driver.findElement(By.name("resolution_form_id"));
	  WebDriverUtils1.dropdown(rfi,7 );
	  WebElement ld =  driver.findElement(By.name("list_doc_id"));
	  WebDriverUtils1.dropdown(ld,5 );
	  
	  WebElement  md =  driver.findElement(By.name("memorandum_doc_id"));
	  WebDriverUtils1.dropdown(md,6 );
	  
	  WebElement  pdi=  driver.findElement(By.name("partnership_deed_id"));
	  WebDriverUtils1.dropdown( pdi,3);
	  
	  WebElement ed =  driver.findElement(By.name("excise_dept_doc_id"));
	  WebDriverUtils1.dropdown(ed,6 );
	  
	  WebElement di =  driver.findElement(By.name("pan_doc_id"));
	  WebDriverUtils1.dropdown(di,7 );
	  
	  
	     
	     
	     
	     
	     
	     driver.findElement(By.id("submit-btn")).submit();
	     
	     
	     
	     /*                                                             *
	      *                                                             *
	      * -------------------review detail--------------------------- */
	                 
	    // driver.findElement(By.linkText("Back")).click();
	     
	     driver.findElement(By.xpath("//input[@value='Continue']")).click();
	    
	     
	     
	     /*                                                             *
	      *                                                             *
	      * -------------------Fee Payment --------------------------- */
	/*     driver.switchTo().frame("paymentFrame");
	    driver.findElement(By.id("loginUser")).sendKeys("ankit3990@yahoo.com");
	    driver.findElement(By.id("loginPassword")).sendKeys("ankit123");
	    // driver.findElement(By.id("serLogin")).click();     
	   
	     
	     */
	     
	       driver.switchTo().frame("paymentFrame");
        
        MakePayment mp1=PageFactory.initElements(driver, MakePayment.class);
        mp1.payment();
      
        mp1.merchanSite();
        
        
        
        
        
        /*---------------------alert pop-up-------------------------*/
	   try{  Alert alt= driver.switchTo().alert();
	     
	      alt.accept();
	   }catch (Exception e) {
		// TODO: handle exception
	}
	       Thread.sleep(8000);
	    
	   	/*------------------sceesfully complete payment verify-----*/
	    String actmsg=driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();
	  System.out.println("actual message ==>"+actmsg);
	  
	 // Assertr.assertEquals(actmsg, "Payment Transaction Completed Succcessfully ");
	  if(actmsg.contains("Payment Transaction Completed Succcessfully"))
	  {
		System.out.print("transaction completed or  ");  
		  
	  }
	  
	    String trckingId=driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
	    System.out.println("Tracking Id ==>"+trckingId);
	    
	  
	    FileSet.setExcelData("./excel/jklabourData.xlsx", "trackinid" ,5, 3, trckingId);
		
		String p1 = "saf";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p1);

	}

	/* ------------------------------------------------------------------ */

	@Test (priority=1)
	public void test2SAFRevertBack() throws EncryptedDocumentException, Throwable {
		FactoryRegistrationsMenu menu=PageFactory.initElements(driver, FactoryRegistrationsMenu.class);
		menu.factoryRegistrations();
		
	/*	ALCCustPage view= PageFactory.initElements(driver, ALCCustPage.class);
		view.gettrackingId();
		view.doAction();*/
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/


		LIRevertBackApplicant li =PageFactory.initElements(driver, LIRevertBackApplicant.class);;

		li.revertBack();

		driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div/textarea"))
		.sendKeys("Edit Field");

		driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();


		
		String msg = driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
		System.out.println(msg);

		/*----------------------set
		                        person  --------------------*/

		String p = "user";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}

	/* ------------------------------------------------------------------ */

	@Test(priority=2)
	public void test3UserEditAndSubmit() throws EncryptedDocumentException, Throwable {

		PostApplication pa = PageFactory.initElements(driver, PostApplication.class);
		pa.postApp();

		/*
		 * PostAppsEdit edit=PageFactory.initElements(driver,
		 * PostAppsEdit.class); edit.edit();
		 * //td[text()='68443012']/following-sibling::td/a[contains(text(),'Edit
		 * ')]
		 */

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		String id = fl.getStringExcelData(5, 3);
		System.out.println(" TRACKING ID = "+id);

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[contains(text(),'Edit')]"))
				.click();

		
	    WebElement circle=driver.findElement(By.xpath("//select[@name='factory_address_circle_id']"));
	       WebDriverUtils1.dropdownSelectByValue(circle,"1" );
		     
		  
			   FileSet.setExcelData("./shop.xlsx","dist" ,1, 1, "Jammu Circle 1");
		    
			   

		driver.findElement(By.xpath("//input[@value='Continue']")).submit();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		/*------------------------------revert back submitted suceesfully--------------------------*/

		try {
			String actmsg = driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();

			// Assertr.assertEquals(actmsg, "Payment Transaction Completed
			// Succcessfully ");
			if (actmsg.contains("Successfully Updated")) {
				System.out.println("revert back  ==>" + actmsg);
			}

			String status = driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
			System.out.println("current status of the application is ===>  " + status);

			String trckingId = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
			System.out.println("Tracking Id ==>" + trckingId);

		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		String p = "saf";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);


	}
	
	
	
	
	@Test(priority=3)
	public void test4SAFRevertBack() throws EncryptedDocumentException, Throwable
	{
		FactoryRegistrationsMenu menu=PageFactory.initElements(driver, FactoryRegistrationsMenu.class);
		menu.factoryRegistrations();
		
	/*	ALCCustPage view= PageFactory.initElements(driver, ALCCustPage.class);
		view.gettrackingId();
		view.doAction();*/
		
		/*----------------------- click on View -------------------------------*/
		

		 FileUtiles fl=new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		 String id=fl.getStringExcelData(5, 3);
		System.out.println("tracking id ==> "+id);
		 
		 driver.findElement(By.xpath("//td[text()='"+id+"']/following-sibling::td/a[text()='View']"))
		.click();
		
		
	/*---------------------do action ------------------*/


		LIRevertBackApplicant li =PageFactory.initElements(driver, LIRevertBackApplicant.class);;

		li.revertBack();

		driver.findElement(By.xpath("//div[6]/div/form/div[1]/div/div/textarea"))
		.sendKeys("Edit Field");

		driver.findElement(By.xpath("//div[6]/div/form/div[2]/input")).submit();


		

		String msg = driver.findElement(By.xpath("//span[@class='hl-toast hl-toast-pop']")).getText();
		System.out.println(msg);

		/*----------------------set
		                        person  --------------------*/

		String p = "user";

		FileSet.setExcelData("./excel/data.xlsx", "person", 1, 1, p);

	}
	
	
	@Test(priority=4)
	public void test5UserEditAndSubmit() throws EncryptedDocumentException, Throwable
	{

		PostApplication pa = PageFactory.initElements(driver, PostApplication.class);
		pa.postApp();

		/*
		 * PostAppsEdit edit=PageFactory.initElements(driver,
		 * PostAppsEdit.class); edit.edit();
		 * //td[text()='68443012']/following-sibling::td/a[contains(text(),'Edit
		 * ')]
		 */

		FileUtiles fl = new FileUtiles("./excel/jklabourData.xlsx", "trackinid");
		String id = fl.getStringExcelData(5, 3);
		System.out.println(" TRACKING ID = "+id);

		driver.findElement(By.xpath("//td[text()='" + id + "']/following-sibling::td/a[contains(text(),'Edit')]"))
				.click();

		driver.findElement(By.xpath("//input[@value='Continue']")).submit();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Continue']")).click();

		/*------------------------------revert back submitted suceesfully--------------------------*/

		try {
			String actmsg = driver.findElement(By.xpath("//div[@class='message_template template_success']")).getText();

			// Assertr.assertEquals(actmsg, "Payment Transaction Completed
			// Succcessfully ");
			if (actmsg.contains("Successfully Updated")) {
				System.out.println("revert back  ==>" + actmsg);
			}

			String status = driver.findElement(By.xpath("//tr[1]/td[1]")).getText();
			System.out.println("current status of the application is ===>  " + status);

			String trckingId = driver.findElement(By.xpath("//tr[2]/td[1]")).getText();
			System.out.println("Tracking Id ==>" + trckingId);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	
	
	

}
