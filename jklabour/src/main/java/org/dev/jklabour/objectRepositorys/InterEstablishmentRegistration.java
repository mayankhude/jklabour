package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterEstablishmentRegistration {
	
	@FindBy(xpath="//a[contains(text(),'Registration of Establishments Employing Migrant Workmen')]")
     private WebElement interEstablishment;
	
	public void EstablishmentRegistration()
     	{
		  interEstablishment.click();
     	}
	  
}
