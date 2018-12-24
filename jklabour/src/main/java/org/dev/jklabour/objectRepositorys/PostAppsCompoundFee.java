package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostAppsCompoundFee {
	@FindBy(xpath="//td[text()='68443012']/following-sibling::td/a[contains(text(),'Pay Compound Fee')]")
	private WebElement compoundFee;
	
	public void PayFee()
	{
	  compoundFee.click();	
	}

}
