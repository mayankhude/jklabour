package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpdateCircle {
	@FindBy(linkText="Update Circle")
	private WebElement circle;
	public void update()
	{
		circle.click();
	}

}
