package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopRegistration {
	@FindBy(xpath="//a[contains(text(),'Registration of Shops and Establishments')]")
	 private WebElement shopRegistration;
	
	public void shopRegister()
	  {
		shopRegistration.click();
	  }

}
