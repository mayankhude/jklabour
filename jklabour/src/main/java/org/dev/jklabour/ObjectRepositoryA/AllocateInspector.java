package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllocateInspector {
	@FindBy(linkText="Allocate Inspector")
	private WebElement Inspector;
	
	public void AllocateInspector()
	{
		Inspector.click();
	}

}
