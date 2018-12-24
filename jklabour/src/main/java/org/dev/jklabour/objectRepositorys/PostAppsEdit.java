package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostAppsEdit {
	@FindBy(xpath="//td[text()='68443012']/following-sibling::td/a[contains(text(),'Edit')]")
     private WebElement edit;
	
	public void edit()
	{
		edit.click();
	}
}
