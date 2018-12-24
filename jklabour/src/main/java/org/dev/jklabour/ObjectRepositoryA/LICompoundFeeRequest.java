package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LICompoundFeeRequest {
	
	@FindBy(linkText="Compound Fee Request")
    private WebElement compound;
	
	public void compoundFee ()
	{
		compound.click();
	}
}
