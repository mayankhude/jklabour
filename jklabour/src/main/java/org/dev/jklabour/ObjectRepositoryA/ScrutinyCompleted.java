package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ScrutinyCompleted {
	@FindBy(xpath="//div[2]/div[4]/div/a[2]")
	private WebElement scrutiny;
	
	public void scrutinyCompleted()
	{
		scrutiny.click();
	}

}
