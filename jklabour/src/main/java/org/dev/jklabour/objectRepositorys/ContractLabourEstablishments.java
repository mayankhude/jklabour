package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContractLabourEstablishments {
	@FindBy(xpath="//a[contains(text(),'Contract Labour Act')]/following-sibling::ul/li/a[contains(text(),'Registration of Establishments Employing Contract Labour')]")
     private WebElement  establishmentcontract;
	
	public void establishmentContract()
	{
		establishmentcontract.click();
	}
}
