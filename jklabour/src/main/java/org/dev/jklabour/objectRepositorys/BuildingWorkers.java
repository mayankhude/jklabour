package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildingWorkers  {
	@FindBy(xpath="//a[contains(text(),'Building Workers')]")
	private WebElement building;
	
	public void buildingWorkers()
	{ 
	  building.click();
	}

}
