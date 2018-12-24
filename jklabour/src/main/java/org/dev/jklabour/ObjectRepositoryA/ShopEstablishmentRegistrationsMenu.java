package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopEstablishmentRegistrationsMenu {
	@FindBy(linkText="Shop & Establishment Registrations")
     private WebElement ShopEstablishment;
	
	public void ShopRegistrations()
	{
		ShopEstablishment.click();
	}
}
