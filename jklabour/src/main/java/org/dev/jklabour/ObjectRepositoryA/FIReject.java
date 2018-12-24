package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIReject {
	
	@FindBy (linkText="Reject")
	private WebElement reject;
	
	public void IoFReject()
	{
		reject.click();
	}

}
