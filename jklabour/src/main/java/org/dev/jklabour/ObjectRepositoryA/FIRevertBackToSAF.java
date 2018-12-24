package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIRevertBackToSAF {
 
	@FindBy(linkText="Revert Back To Senior Assistant")
	private WebElement revert;
	public void RevertBackToSAF()
	{
		revert.click();
	}
}
