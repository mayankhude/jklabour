package org.dev.jklabour.ObjectRepositoryA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EstEmpBuildingWorkersMenu {
	@FindBy(linkText="Establishments employing Building Workers")
	 private WebElement EstablishmentsWorkers;
	
	
	public void BuildingWorkers()
	{EstablishmentsWorkers.click();}

}
