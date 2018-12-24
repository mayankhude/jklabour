package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForwardALCCompoundfee {
	@FindBy(linkText="Forward to ALC for Compound fee")
	private  WebElement forwardALC ;
	
	public void forwardALCForCompoundfee()
	{
		forwardALC.click();
	}
}
