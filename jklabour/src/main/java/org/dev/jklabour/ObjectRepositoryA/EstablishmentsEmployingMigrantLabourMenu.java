package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstablishmentsEmployingMigrantLabourMenu {
	
	@FindBy(linkText="Establishments Employing Migrant Labour")
	private WebElement EstablishmentsLabour;
	
	public void establishmentsLabour()
	{
		EstablishmentsLabour.click();
	}

}
