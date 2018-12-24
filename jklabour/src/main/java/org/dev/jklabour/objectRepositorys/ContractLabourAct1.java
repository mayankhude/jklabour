package org.dev.jklabour.objectRepositorys;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractLabourAct1 extends WebDriverUtils1{
	@FindBy(xpath="//a[contains(text(),'Contract Labour Act')]")
	private WebElement contractLabour;
	
	public void contractLabour()
	  {
		selectDropdownMenu(contractLabour);
		
	  }

	

}
