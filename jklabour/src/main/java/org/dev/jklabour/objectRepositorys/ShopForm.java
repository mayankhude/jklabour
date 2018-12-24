package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopForm {
	
	@FindBy(xpath="//a[contains(text(),'Form D')]")
	private WebElement form;
	
	public void sForm()
     	{
		  form.click();
	    }

}
