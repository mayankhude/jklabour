package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormDNoticceMenu {
	@FindBy(xpath="//a[contains(text(),'Form D')]")
	private WebElement FormD;
	
	public void NoticceOfChange()
	{
		FormD.click();
	}

}
