package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FIUpdateCircle {
	
	@FindBy(linkText="Update Circle")
	private WebElement circle;
	
	public void circleUpdate()
	{
		circle.click();
	}

}
