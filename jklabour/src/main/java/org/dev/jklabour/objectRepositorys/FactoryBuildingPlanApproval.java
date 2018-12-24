package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FactoryBuildingPlanApproval {
	
	@FindBy(xpath="//a[contains(text(),'Approval of Building Plan / Permission')]")
	 private WebElement factorybuildingPlan;
	
	 public void buildingPlan()
	   {
		 factorybuildingPlan.click();
	   }

}
