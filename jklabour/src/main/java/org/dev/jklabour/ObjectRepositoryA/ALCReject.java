package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ALCReject {
	@FindBy(linkText="Reject")
	private WebElement cancel;
	
	public void reject()
	{
		cancel.click();
	}

}
