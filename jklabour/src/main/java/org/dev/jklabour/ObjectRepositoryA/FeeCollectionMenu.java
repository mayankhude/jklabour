package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeeCollectionMenu {
	@FindBy(linkText="Fee Collection")
	private WebElement fee;
	public void feeColletionMenu()
	{
		fee.click();
	}
}
