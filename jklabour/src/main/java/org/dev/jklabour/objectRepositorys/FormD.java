package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormD {
	@FindBy(xpath="//a[contains(text(),'Shop Act') ]/following-sibling::ul/li/a[contains(text(),'Form D - Notice of Change')]")
    private WebElement form;
	
	public void FormD()
	{
		form.click();
	}
}
