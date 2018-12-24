package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstablishmentsEmployingContractLabourMenu {
	@FindBy(linkText="Establishments Employing Contract Labour")
	private WebElement EstablishmentsLabour;
	
	public void EstablishmentsLabour()
	{
		EstablishmentsLabour.click();
	}
		
	}

