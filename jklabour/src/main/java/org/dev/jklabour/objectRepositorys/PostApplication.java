package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostApplication {
	@FindBy(xpath="//h3[@id='count_reg']/../following-sibling::a[text()='Click Here ']")
	public WebElement pApp;
	
	public void postApp()
	{
		pApp.click();
	}

}
