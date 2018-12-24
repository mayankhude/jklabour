package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostAppsView {
	@FindBy(xpath="//td[text()='37548147']/following-sibling::td/a[contains(text(),'View')]")
  private WebElement view;
	public void view()
	{
		view.click();
	}
}
