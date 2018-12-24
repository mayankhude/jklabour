package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetermineCompoundFee {
	@FindBy(linkText="Determine Compound fee")
	private WebElement determineFee;
	
	
	public void  determineCompoundFee()
	{
		determineFee.click();
	}

}
