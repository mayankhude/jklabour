package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoilerRenewal {
	
	@FindBy(xpath="//a[contains(text(),'Renewal of Boilers')]")
	 private WebElement bRenewal;
	
	public void bRenew()
	      {
		    bRenewal.click();
	      }

}
