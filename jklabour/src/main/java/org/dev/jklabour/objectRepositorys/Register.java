package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement reg;
	
	public void register()
	{
		reg.click();
	}

}
