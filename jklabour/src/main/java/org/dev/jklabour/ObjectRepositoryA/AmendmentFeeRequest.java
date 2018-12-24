package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmendmentFeeRequest {
	
	@FindBy(linkText="Amendment Fee Request")
	private WebElement feeRequest;
	
	public void amendmentFeeRequest()
	{
		feeRequest.click();
	}

}
