package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractorsRenewal {
	
	@FindBy(xpath="//a[contains(text(),'Renewal of Contractors ')]")
	 private WebElement cRenewal;
	
	public void contractorsRenewal()
	        {
		  cRenewal.click();
		     
	          }
	

}
