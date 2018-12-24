package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConstructionExtendBuildingFactoryMenu{
	
	@FindBy(linkText="Construction Extend or Building as a Factory")
	
	private WebElement buildingFactory;
	
	public void buildingFactory()
	{
		buildingFactory.click();
	}

}
