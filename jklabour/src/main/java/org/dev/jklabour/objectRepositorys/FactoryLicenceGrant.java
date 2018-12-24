package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryLicenceGrant {
	
	@FindBy(xpath="//a[contains(text(),'Grant of Factory Licence')]")
	 private WebElement factoryLicence;
	
	public void fLicenceGrant()
	    {
		  factoryLicence.click();
	     }

}
