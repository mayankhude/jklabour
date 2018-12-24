package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ALCOnHold {
	@FindBy(linkText="On Hold")
	private WebElement hold;
	
	public void  holdOn()
	{
		hold.click();
	}

}
