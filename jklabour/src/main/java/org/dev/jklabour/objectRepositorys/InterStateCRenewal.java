package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterStateCRenewal {
	
   @FindBy(xpath="//a[contains(text(),'Inter State Migrant Act')]/following-sibling::ul/li/a[contains(text(),'Renewal of Contractors')]")
    private WebElement contractorRenewal;
   
   public void interStateCRenewal()
     { 
	   contractorRenewal.click();
     }
}
