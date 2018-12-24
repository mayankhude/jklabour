package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostAppsAmendmentFee {
	@FindBy(xpath="//td[text()='68443012']/following-sibling::td/a[contains(text(),'Pay Fee')]")
	private WebElement payFee;
	
	public void amendmentFee()
	{
		payFee.click();
	}
	

}
