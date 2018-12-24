package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopRenewal {
	
	@FindBy(xpath="//a[contains(text(),'Renewal of Shops and Establishments')]")
	 private WebElement renewal;
	
	public void renewal()
	  {
		renewal.click();
	  }

}
