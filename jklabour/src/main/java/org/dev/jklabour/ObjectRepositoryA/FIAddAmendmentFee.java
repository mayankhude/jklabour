package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIAddAmendmentFee {
	@FindBy(linkText="Add Amendment Fee")
    private WebElement amendment;
	
	public void addAmendmentFee()
	{
		amendment.click();
	}
}
