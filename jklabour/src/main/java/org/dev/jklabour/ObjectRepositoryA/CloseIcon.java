package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseIcon {
	@FindBy(xpath="//i[@class='close icon']/following-sibling::div[contains(text(),' Upload Approval Certificate')]")
    private WebElement closei;
	
	public void closeMSG()
	{
		closei.click();
	}
}
