package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BoilerRegistration {
	@FindBy(xpath="//a[contains(text(),'Registration of Boilers')]")
     private WebElement boilerRgister;
	 
	
	public void boilerRegistration()
	{
		boilerRgister.click();
	}
}
