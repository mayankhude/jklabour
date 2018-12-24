package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractorsRegistration {
	@FindBy(xpath=
   "//a[contains(text(),'Contract Labour Act')]/following-sibling::ul/li/a[contains(text(),'Registration of Contractors')]")
	private WebElement registrationOfContractor;
	
	public void  registrationOfContractor()
	{
		registrationOfContractor.click();
	}

}
