package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StatusLog {
	@FindBy(linkText="Status Log")
	private WebElement status ;
	
	public void status()
	{
		status.click();
	}

}
