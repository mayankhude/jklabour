package org.dev.jklabour.objectRepositorys;


import org.dev.jklabour.commonLibS.WebDriverUtils1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopAct1 extends WebDriverUtils1{
	@FindBy(xpath="//a[contains(text(),'Shop Act')]")
	private WebElement shop;
	
	public void shop()
	{
		selectDropdownMenu(shop);
	}

}
