package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryRenewal {
	
	@FindBy(xpath="//a[contains(text(),'Renewal of Factory Licence')]")
	private WebElement renewal;
	
	public void renewalFactory()
    	{
		  renewal.click();
	    }

}
