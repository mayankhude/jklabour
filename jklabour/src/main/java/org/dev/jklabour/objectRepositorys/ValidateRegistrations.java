package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidateRegistrations {
	@FindBy(xpath="//a[contains(text(),'Validate Registrations')]")
    private WebElement validateRegistrations;
	
	public void validateRegistrations()
	{
		validateRegistrations.click();
	}
}
