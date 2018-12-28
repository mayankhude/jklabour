package org.dev.jklabour.objectRepositorys;

import org.dev.jklabour.commonLibS.WebDriverUtils1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

   public class InterStateMigrantAct1 extends  WebDriverUtils1 {
	@FindBy(xpath="//a[contains(text(),'Inter State Migrant Act')]")
	 private WebElement  StateMigrant;
	
	public void StateMigrant()
	{
	   selectDropdownMenu(StateMigrant);
	}

}
