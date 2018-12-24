package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrutinyCompleted {
	@FindBy(linkText="Scrutiny Completed")
	private WebElement scrutiny;
	
	public void scrutinyCompleted()
	{
		scrutiny.click();
	}

}
