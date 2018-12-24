package org.dev.jklabour.objectRepositorys;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryAct1 extends WebDriverUtils1 {
	@FindBy(xpath="//a[contains(text(),'Factory Act')]")
	private WebElement factory;
	
	public void factoryAct()
	{
	 selectDropdownMenu(factory);
	}
	

}
