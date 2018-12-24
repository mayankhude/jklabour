package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InterContractorRegistration {
	
	@FindBy(xpath="//a[contains(text(),'Inter State Migrant Act')]/following-sibling::ul/li/a[contains(text(),' Registration of Contractors')]")
	private WebElement interStateCR;
	
	public void interStateContractor()
	{
		interStateCR.click();
	}

}
