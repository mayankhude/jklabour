package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryRegistrationsMenu {
	@FindBy(linkText="Factory Registrations")
	private WebElement factory;
	
	public void factoryRegistrations()
	{
		factory.click();
	}

}
