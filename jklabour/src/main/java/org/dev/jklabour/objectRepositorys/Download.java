package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Download {
	@FindBy(xpath="//tr/td/a[text()='Download']")
	private WebElement down;
	
	public void download()
	{
		down.click();
	}

}
