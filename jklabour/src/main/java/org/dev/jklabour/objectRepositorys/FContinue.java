package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FContinue {
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement fcontinue;
	

	 public void continueButton()
	 {
		 fcontinue.click();
	 }
}
