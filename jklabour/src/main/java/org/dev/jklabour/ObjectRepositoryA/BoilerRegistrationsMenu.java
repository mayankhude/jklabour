package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoilerRegistrationsMenu {
	@FindBy(linkText="Boiler Registrations")
	private WebElement boiler;
	
	public void boiler()
	{
		boiler.click();
	}
}
