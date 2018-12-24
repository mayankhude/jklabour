package org.dev.jklabour.ObjectRepositoryA;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Listeners;
public class ALCContractorsRegistrationsMenu{
	
	@FindBy (linkText="Contractors Registrations")
	private WebElement alcc;
	
	
	public void ContractorsRegistrations()
	{ alcc.click();}
	
	
	
	

}
