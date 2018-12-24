package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LIRevertBackApplicant {
	@FindBy(linkText="Revert Back to Applicant")
	private WebElement revert;
	
	public void revertBack()
	{
		revert.click();
	}
}
