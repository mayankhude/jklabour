package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ALCApprove {
	@FindBy(linkText="Approve")
	private WebElement accept;
	
	public void approve()

	{
		accept.click();
	}
}
