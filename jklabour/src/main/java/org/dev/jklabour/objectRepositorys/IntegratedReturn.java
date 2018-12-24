package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IntegratedReturn  {
	@FindBy(xpath="//a[contains(text(),'Integrated Return')]")
	private WebElement integratedReturn;
	
	public void integratedReturns()
	{
		integratedReturn.click();
	}

}
