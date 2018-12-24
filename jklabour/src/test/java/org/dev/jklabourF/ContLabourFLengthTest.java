

/*
 * @author hudelabs
 * 
 */

package org.dev.jklabourF;

import org.apache.poi.EncryptedDocumentException;
import org.dev.jklabour.commonLibS.BaseClass1;
import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.dev.jklabour.objectRepositorys.ContractLabourAct1;
import org.dev.jklabour.objectRepositorys.ContractLabourEstablishments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ContLabourFLengthTest extends BaseClass1{
	
	static int i=2;
	
	@Test
	
	public void facoryLengthTest() throws EncryptedDocumentException, Throwable

			{
		ContractLabourAct1 act= PageFactory.initElements(driver, ContractLabourAct1.class);
        act.contractLabour();;
        
      
ContractLabourEstablishments reg=PageFactory.initElements(driver, ContractLabourEstablishments.class);
reg.establishmentContract();


driver.findElement(By.xpath("//button[@type='submit']")).click();	


							
		/*--------------------------Form start -----------------------------------*/
			
				
				
				
				
				
				  String name="Lorem passages, and more recently with desktop"
						  + " publishing software like Aldus PageMaker including "
						  + "versions publishing software like Aldus PageMa" ;
				
				  String detail="Lorem passages, and more recently with desktop"
						  	+ " publishing software like Aldus PageMaker including "
						  + "versions of Lorem Ipsum."
						  +"Lorem passages, and more recently with desktop"
						  + " publishing software like Aldus PageMaker including "
						  + "versions of Lorem Ipsum."+" publishing software like Aldus PageMaker including "
						+ "versions of Lorem Ipsum."
						+"Lorem passages, and more recently with desktop"
						 + " publishing software like Aldus PageMaker including "
						 + "versions of Lorem Ipsum."
						 +"Lorem passages, and more recently with desktop"
						 + " publishing software like Aldus PageMaker including "
						 + "versions of Lorem Ipsum."
						 +"Lorem passages, and more recently with desktop"
						  + " publishing software like Aldus PageMaker including "
						  + "versions of Lorem Ipsum."
						
						  		    			    		;
				


				
			 	   /*------------ fill contractor form------------------------*/
			 		
			 		
			 	
			 	/*------------------------ 1. -------------------------------*/	
			 	   
			 	   driver.findElement(By.name("est_name"))
			 	     .sendKeys(name) ;      
			 	/*------------------------ 2.------------------------------*/     
			 	     
			 	    driver.findElement(By.name("est_location"))
			 	     .sendKeys(name) ;    
			 	     
			 	     
			/*--------------------- 3. Full postal address of office -----------------*/
					 

					 
					driver.findElement(By.xpath("//input[@name='est_postal_address_1']"))
					 .sendKeys(name) ;        
					 
					 driver.findElement(By.xpath("//input[@name='est_postal_address_2']"))
					 .sendKeys(name) ;      
					 
					 driver.findElement(By.xpath("//input[@name='est_postal_address_city']"))
					 .sendKeys(name) ;     
					 
					 WebElement pd=driver.findElement(By.xpath("//select[@name='est_postal_address_district_id']"));
					WebDriverUtils1.dropdownselect(pd,"Jammu");
				  	 
				        
					 
					 driver.findElement(By.name("est_postal_address_pincode"))
					 .sendKeys(name) ;    
					 
			 	     
					 
			    /*--------------------------4. ----------------------*/
					 
					 driver.findElement(By.name("p_employer_name"))
			 	     .sendKeys(name) ;       
			 
			 	     
			 	     driver.findElement(By.name("p_employer_father_husband_name"))
			 	     .sendKeys(name) ;      
				 
					 driver.findElement(By.xpath("//input[@name='p_employer_address_1']"))
					 .sendKeys(name) ;      
					 
					driver.findElement(By.xpath("//input[@name='p_employer_address_2']"))
					 .sendKeys(name) ;      
					 
					driver.findElement(By.xpath("//input[@name='p_employer_address_city']"))
					 .sendKeys(name) ;     
					 
					 WebElement pdist=driver.findElement(By.xpath("//select[@name='p_employer_address_district_id']"));
					 WebDriverUtils1.dropdown(pdist, 3);
					 
					driver.findElement(By.name("p_employer_address_pincode"))
					 .sendKeys(name) ;       	 
					 
					 
			 	     
			 	  /*--------------------------5. member detail-----------------------*/   
			 	   driver.findElement(By.name("member_one_name"))
					 .sendKeys(name) ;       
					 
				 driver.findElement(By.xpath("//input[@name='member_one_share']"))
					 .sendKeys(name) ;    
					 
					driver.findElement(By.xpath("//input[@name='member_one_per_address']"))
					 .sendKeys(name) ;   
					 
					driver.findElement(By.xpath("//input[@name='member_one_designation']"))
					 .sendKeys(name) ;       
					 
					 
			/*----------------------member 2-------------------------------------*/
					 
					  driver.findElement(By.name("member_two_name"))
						 .sendKeys(name) ;     
						 
					driver.findElement(By.xpath("//input[@name='member_two_share']"))
						 .sendKeys(name) ;     
						 
					 driver.findElement(By.xpath("//input[@name='member_two_per_address']"))
						 .sendKeys(name) ;      
						 
						 driver.findElement(By.xpath("//input[@name='member_two_designation']"))
						 .sendKeys(name) ;      
						 
				/*---------------------------3. member-------------------------*/		 
			     
						 driver.findElement(By.name("member_three_name"))
							 .sendKeys(name) ;       
							 
						 driver.findElement(By.xpath("//input[@name='member_three_share']"))
							 .sendKeys(name) ;       
							 
							driver.findElement(By.xpath("//input[@name='member_three_per_address']"))
							 .sendKeys(name) ;        
							 
							 driver.findElement(By.xpath("//input[@name='member_three_designation']"))
							 .sendKeys(name) ;     
							 
							 /*---------------------------4. member-------------------------*/		 			 
							 
							 driver.findElement(By.name("member_four_name"))
								 .sendKeys(name) ;        
								 
								driver.findElement(By.xpath("//input[@name='member_four_share']"))
								 .sendKeys(name) ;       
								 
								 driver.findElement(By.xpath("//input[@name='member_four_per_address']"))
								 .sendKeys(name) ;       
								 
								 driver.findElement(By.xpath("//input[@name='member_four_designation']"))
								 .sendKeys(name) ;      
								 
								 
				  /*---------------------------5. member-------------------------*/		 	 
								 
				    driver.findElement(By.name("member_five_name"))
					 .sendKeys(name) ;        
									 
					driver.findElement(By.xpath("//input[@name='member_five_share']"))
					 .sendKeys(name) ;       
									 
					driver.findElement(By.xpath("//input[@name='member_five_per_address']"))
					.sendKeys(name) ;       
									
					driver.findElement(By.xpath("//input[@name='member_five_designation']"))
					.sendKeys(name) ;       
						 
									 
				/*-------------------6. Full name and address of the
				 *                     Manager or person responsible for 
				 *                 the supervision and control of the establishment -------------*/		 
						 
									 
				  driver.findElement(By.name("manager_name"))
				    .sendKeys(name) ;    			 
									 
									 
						 
				    driver.findElement(By.xpath("//input[@name='manager_designation']"))
				    .sendKeys(name) ;      
									 
				  driver.findElement(By.xpath("//input[@name='manager_address_1']"))
				  .sendKeys(name) ;     
				  
				   driver.findElement(By.xpath("//input[@name='manager_address_2']"))
				  .sendKeys(name) ;        
				   
				   driver.findElement(By.xpath("//input[@name='manager_address_city']"))
			       .sendKeys(name) ;      
									 
				   WebElement mpd=driver.findElement(By.xpath("//select[@name='manager_address_district_id']"));
				   WebDriverUtils1.dropdown(mpd, 2);
				
				   driver.findElement(By.name("manager_address_pincode"))
				   .sendKeys(name) ;        
				   
				   
			 /*----------------------7. nature of work-------------------------*/
									 
				  driver.findElement(By.name("nature_of_work")).sendKeys(detail) ;     
				  
				   
				  
			 /*----------------------select document--------------------------*/
			       
			       

			      driver.findElement(By.name("no_of_workers"))
				   .sendKeys(name) ;        
			       
				   WebElement cpid= driver.findElement(By.name("contractor_list_doc_id"));
				   WebDriverUtils1.dropdownselect(cpid,"Test_Certificate");
				       	     
				   WebElement cdid= driver.findElement(By.name("license_doc_id"));
				   WebDriverUtils1.dropdownselect(cdid,"Test_pan");
				       	     
				   WebElement cpdid =driver.findElement(By.name("photograph_doc_id"));
				   WebDriverUtils1.dropdownselect(cpdid, "PHOTOGRAPH"); 
				      
				       	     
				    WebElement sid=driver.findElement(By.name("support_doc_id"));
				    WebDriverUtils1.dropdownselect(sid, "11");
				    Thread.sleep(1000);
				 
				 
				   
			}
	}


