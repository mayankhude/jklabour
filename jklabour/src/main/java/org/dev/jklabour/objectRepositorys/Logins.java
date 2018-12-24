package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logins {
	@FindBy(xpath="//li[8]/a[contains(text(),'Login')]")
	private WebElement login;
	
	public void loginmenu()
	  {
	    login.click();	
     	}

}
