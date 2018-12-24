package org.dev.jklabour.objectRepositorys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonUser {
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logout;
	
	public void logout(){
	logout.click();
	}

}
