package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIAddLateFee {
	@FindBy(linkText="Add Late Fee")
	private WebElement fee;
	
	public void latefee()
	{
		fee.click();
	}

}
