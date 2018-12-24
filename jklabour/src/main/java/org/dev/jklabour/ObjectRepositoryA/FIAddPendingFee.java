package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIAddPendingFee {
	
	@FindBy(linkText="Add Pending Fee")
	private WebElement pending;
	
	public void pendingFee()
	{
		pending.click();
	}

}
