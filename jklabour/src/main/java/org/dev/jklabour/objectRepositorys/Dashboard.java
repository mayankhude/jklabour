package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	private WebElement dash;
	
	 public void dashboard()
	 {
		 dash.click();
	 }

}
