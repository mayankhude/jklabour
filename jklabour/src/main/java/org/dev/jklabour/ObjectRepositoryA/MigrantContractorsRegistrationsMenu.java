package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MigrantContractorsRegistrationsMenu {
	@FindBy(linkText="Migrant Contractors Registrations")
	private WebElement MigrantRegistrations;
	
	public void MigrantContractors()
	{
		MigrantRegistrations.click();
	}

}
