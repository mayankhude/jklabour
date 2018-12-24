package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostAppsStatusLog {
	@FindBy(xpath="//td[text()='27156361']/following-sibling::td/a[contains(text(),'View Status Log')]")
	private WebElement statusLog;
	
	public void ViewStatusLog()
	{
		 statusLog.click();
	}

}
