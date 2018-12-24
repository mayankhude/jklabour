package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIUpdateRegPeriod {
	
	@FindBy(xpath="//a[text()='Update Circle']/following-sibling::a")
	private WebElement updateRegistration;
	
	public void updateRegistrationPeriod()
	{
		updateRegistration.click();
	}
}
