package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIHold {
	
	@FindBy(linkText="On Hold")
	private WebElement hold;
	
	public void onHold()
	{
		hold.click();
	}

}
